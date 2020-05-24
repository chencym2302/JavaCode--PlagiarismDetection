var SStorage = (function() {
	var k = sessionStorage;
	var c = function() {
		return (arguments.length == 1) ? k.getItem(arguments[0]) : k.setItem(
				arguments[0], JSON.stringify(arguments[1]));
	};
	var l = function() {
		var args = Array.prototype.slice.call(arguments);
		var val = c(args[0]);
		if (val === null || val.length == 0)
			return false;
		val = JSON.parse(val);
		args.push(val);
		args[1][args[2]].apply(args[1], args.slice(3));
		return true;
	};
	var s = function() {
		c("cl", E.lCode.val());
		c("cr", E.rCode.val());
		c("clt", E.lTitle.text());
		c("crt", E.rTitle.text());
	}
	return {
		saveCode : s,

		saveResponse : function(response) {
			c("r", response);
		},

		save : function(label, item) {
			c(label, item);
		},

		load : function(label) {
			JSON.parse(c(label));
		},

		autoSaveCode : function(period) {
			setInterval(function() {
				s();
			}, period);
		},

		clearResponse : function() {
			k.removeItem("r");
		},

		clear : function() {
			k.clear();
		},

		hasResponse : function() {
			return c("r") != null;
		},

		hasCode : function() {
			return (c("cl") != null && c("cl").length > 0)
					|| (c("cr") != null && c("cr").length > 0);
		},

		getResponse : function() {
			return JSON.parse(c("r"));
		},

		loadInputs : function() {
			l('clt', E.lTitle, 'text');
			l('crt', E.rTitle, 'text');

			return l('cl', E.lCode, 'val') || l('cr', E.rCode, 'val');

		}
	};

})();

function bindElements() {
	return {
		lCode : $("#code_left"),
		rCode : $("#code_right"),
		lTitle : $("#upload_left"),
		rTitle : $("#upload_right"),
		compare : $("#compare"),
		score : $("#score"),
		lUploader : $("#fil"),
		rUploader : $("#fir"),
		diagram : $("#diagram"),
		result : $("#result"),
		explanations : $("#expls"),
		X : {
			box : $("#expl_box"),
			list : $("#expls")
		},
	};
}

function showChart(p, onComplete) {
	var doughnutData = [ {
		value : p,
		color : "#E64C65"
	}, {
		value : 100 - p,
		color : "#11D88B"
	} ];
	var myDoughnut = new Chart(document.getElementById("canvas").getContext(
			"2d")).Doughnut(doughnutData, {
		onAnimationComplete : onComplete
	});
}

function hasValidInput() {
	return E.lCode.val().trim().length > 50 && E.rCode.val().trim().length > 50;
}

function renderResponse(response) {
	var score_tmpl = "<span>{{text}}</span><br/><span class=\"percent\">{{percent}}%<span>";
	var expl_tmpl = "{{#explanations}} <li> {{{.}}} </li> {{/explanations}}";

	response.explanations = $.map(response.explanations, function(e) {
		return e.replace(/<fn>/g, "<span class=\"glow\">").replace(/<\/fn>/g,
				"</span>");
	});

	E.result.html(Mustache.render(score_tmpl, response));
	E.explanations.append(Mustache.render(expl_tmpl, response));
}

function gatherData() {
	return {
		lcode : E.lCode.val(),
		rcode : E.rCode.val()
	};
}

function initialLabels() {
	E.lCode.val('');
	E.rCode.val('');

	E.lTitle.text("Upload");
	E.rTitle.text("Upload");
	E.compare.text("Compare");

	E.explanations.list.empty();
}

var transitions = {
	initial : {},
	filling : {},
	sent : {}
}

transitions['initial']['sent'] = function() {
	SStorage.loadInputs();
	var response = SStorage.getResponse();
	renderResponse(response);
	E.score.text(response.percent + "% similiarity");
	showMiddle().done(function() {
		E.compare.text('Clear');
		showChart(response.percent, function() {
			E.explanations.slideDown();
		});
	});
	state = 'sent';
}

transitions['filling']['sent'] = function() {
	SStorage.saveCode();
	var eb = new vertx.EventBus("http://localhost:8080/eventbus");
	E.compare.text("Please wait...");
	eb.onopen = function() {
		var el = [ E.compare, E.lTitle, E.rTitle ];
		$.each(el, function(i, e) {
			e.off('click');
		});
		eb.send('/score', gatherData(), function(response) {
			onScore(response);
		});
	};
}

transitions['sent']['filling'] = function() {
	SStorage.clearResponse();
	E.compare.off('click');
	hideMiddle().then(function() {
		E.compare.text('Compare');
		E.compare.click(nextState);
	});
	state = 'filling';
}

transitions['sent']['initial'] = function() {
	transitions['sent']['filling']();
	SStorage.clear();
	initialLabels();
	state = 'initial';
}

function handleFiles(files, which) {
	var file = files[0];
	var reader = new FileReader();
	reader.readAsText(file);
	var els = which == 'fir' ? [ E.rCode, E.rTitle ] : [ E.lCode, E.lTitle ];
	reader.onload = function() {
		els[0].val(reader.result);
		els[1].text(file.name);
		execState('filling');
	}
}

function nextState() {
	if (state == 'initial' || state == 'filling') {
		state = 'filling';
		if (hasValidInput()) {
			execState('sent');
		} else {
			alert("Please enter code");
		}
	} else if (state == 'sent') {
		execState('initial');
	}
}

var state = "initial";

function initialState() {
	if (SStorage.hasResponse()) {
		return execState('sent');
	}
	if (SStorage.loadInputs()) {
		state = 'filling';
	}
}

function execState(target) {
	if (transitions[state][target]) {
		transitions[state][target]();
	} else {
		state = target;
	}
}

function urClick() {
	E.rUploader.click();
}

function ulClick() {
	E.lUploader.click();
}

function showMiddle() {
	$("#cont").width("100%");
	var a = $(".column_left").css({
		left : "1%",
		width : "32%"
	}).slideDown().promise();
	var b = $(".column_right").css({
		right : "1%",
		width : "32%"
	}).slideDown().promise();
	var c = $(".column_middle").css({
		left : "34%",
		width : "32%"
	}).slideDown().promise();
	return $.when(a, b, c);
}

function hideMiddle() {
	var a = $(".column_middle").slideUp().promise();
	$("#cont").removeAttr('style');
	var b = $(".column_middle").removeAttr('style').slideUp().promise();
	var c = $(".column_right").removeAttr('style').slideDown().promise();
	var d = $(".column_left").removeAttr('style').slideDown().promise();
	return $.when(a, b, c, d);
}

function onScore(response) {
	if (response.status == 'OK') {
		SStorage.saveResponse(response);
		renderResponse(response);
		E.score.text(response.percent + "% similiarity");
		var showE = function() {
			E.explanations.slideDown(400, function() {
				E.lTitle.click(ulClick);
				E.rTitle.click(urClick);
				E.compare.click(nextState);
			});
		}
		showMiddle().then(function() {
			E.compare.text('Clear');
			showChart(response.percent, showE);
		});
		state = 'sent';
	} else {
		E.lTitle.click(ulClick);
		E.rTitle.click(urClick);
		E.compare.click(nextState);
		E.compare.text('Score');
		alert(response.reason);
	}
}

$(function() {
	window.E = bindElements();
	SStorage.autoSaveCode(3000);
	// delegate clicks;
	E.lTitle.click(ulClick);
	E.rTitle.click(urClick);
	E.compare.click(nextState);

	var f = function() {
		execState('filling');
	};
	E.lCode.on('input paste', f);
	E.rCode.on('input paste', f);

	initialState();
});
