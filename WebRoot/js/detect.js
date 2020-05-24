
//调用代码相似度计算模块
function codeDetect() {
	var form = $("#f_codeDetect");
	var options = {
		url : 'detect/codeDetect',
		type : 'post',
		//data:{q_class: q_class},  
		success : function(data) {
			//刷新表格
			getResultsList();
			
			var htmlToJson = JSON.parse(data);

			if (htmlToJson.ifSuccess == "success") {
				alert("成功！");
			}
			if (htmlToJson.ifSuccess == "error") {
				alert("找不到指定的文件! 请确认参数或重新上传");
			}
		}
	};
	form.ajaxSubmit(options);
}

$(function () {

    // 1.初始化Table
    var oTable = new TableInit();
    // oTable.Init();
    var oTable2 = new TableInit2();
});

var TableInit = function () {
    var oTableInit = new Object();
    // 初始化Table
    oTableInit.Init =  $('#results_table').bootstrapTable({
			url : 'detect/getResults', // 请求后台的URL（*）
			method : 'post', // 请求方式（*）
			dataType: "json",
			toolbar : '#toolbar', // 工具按钮用哪个容器
			striped : true, // 是否显示行间隔色
			cache : false, // 是否使用缓存，默认为true，所以一般情况下需要设置一下这个属性（*）
			pagination : true, // 是否显示分页（*）
			sortable : false, // 是否启用排序
			sortOrder : "asc", // 排序方式
			queryParams : oTableInit.queryParams,// 传递参数（*）
			sidePagination : "server", // 分页方式：client客户端分页，server服务端分页（*）
			pageNumber : 1, // 初始化加载第一页，默认第一页
			pageSize : 100, // 每页的记录行数（*）
			pageList : [ 10, 25, 50, 100 ], // 可供选择的每页的行数（*）
			
			strictSearch : true,
			clickToSelect : true, // 是否启用点击选中行
// height : 500, //行高，如果没有设置height属性，表格自动根据记录条数觉得表格高度
			uniqueId : "id", // 每一行的唯一标识，一般为主键列
			cardView : false, // 是否显示详细视图
			detailView : false, // 是否显示父子表
			columns : [ {
				title : '代码A',
				field : 'fileA',
				align : 'center',
				valign : 'middle',
			}, {
				title : '代码B',
				field : 'fileB',
				align : 'center',
				valign : 'middle',
			}, {
				title : '相似度得分',
				field : 'score',
				align : 'center'
			}, ]
		});

	// 得到查询的参数
	oTableInit.queryParams = function(params) {

       var classes = document.getElementsByName("classes").val();
       var lesson = document.getElementsByName("lesson").val(); 
       
		var temp = { // 这里的键的名字和控制器的变量名必须一直，这边改动，控制器也需要改成一样的
			limit : params.limit, // 页面大小
			offset : params.offset, // 页码
			classes : classes, //班级序号
			lesson : lesson, //课堂序号
		};
	
		return temp;
	};
	 return oTableInit;
};




var TableInit2 = function () {
    var oTableInit = new Object();
    // 初始化Table
    oTableInit.Init =  $('#results_table2').bootstrapTable({
			url : 'detect/getResults2', // 请求后台的URL（*）
			method : 'post', // 请求方式（*）
			dataType: "json",
			toolbar : '#toolbar', // 工具按钮用哪个容器
			striped : true, // 是否显示行间隔色
			cache : false, // 是否使用缓存，默认为true，所以一般情况下需要设置一下这个属性（*）
			pagination : false, // 是否显示分页（*）
			sortable : false, // 是否启用排序
			sortOrder : "asc", // 排序方式
			queryParams : oTableInit.queryParams,// 传递参数（*）
			sidePagination : "server", // 分页方式：client客户端分页，server服务端分页（*）
			pageNumber : 1, // 初始化加载第一页，默认第一页
			pageSize : 100, // 每页的记录行数（*）
			pageList : [ 10, 25, 50, 100 ], // 可供选择的每页的行数（*）
			
			strictSearch : true,
			clickToSelect : true, // 是否启用点击选中行
// height : 500, //行高，如果没有设置height属性，表格自动根据记录条数觉得表格高度
			uniqueId : "id", // 每一行的唯一标识，一般为主键列
			cardView : false, // 是否显示详细视图
			detailView : false, // 是否显示父子表
			columns : [ {
				title : '作业份数',
				field : 'allPeopleNum',
				align : 'center',
				valign : 'middle',
			},  {
				title : '实际作业份数',
				field : 'badPeopleNum',
				align : 'center',
				valign : 'middle',
			},  {
				title : '抄袭比例',
				field : 'percent',
				align : 'center',
				
			}, ]
		});

	// 得到查询的参数
	oTableInit.queryParams = function(params) {
       
		var temp = { // 这里的键的名字和控制器的变量名必须一直，这边改动，控制器也需要改成一样的
			limit : params.limit, // 页面大小
			offset : params.offset, // 页码
		};
	
		return temp;
	};
	 return oTableInit;
};
//刷新表格
function getResultsList() {
    $("#results_table").bootstrapTable('refresh');
    getResultsList2();
    
}
//刷新表格2
function getResultsList2() {
    $("#results_table2").bootstrapTable('refresh');

    
}