$(function () {

    // 1.初始化Table
    var oTable = new TableInit();
    // oTable.Init();
});


var TableInit = function () {
    var oTableInit = new Object();
    // 初始化Table
    oTableInit.Init =  $('#files_table').bootstrapTable({
			url : 'upload/getFiles', // 请求后台的URL（*）
			method : 'get', // 请求方式（*）
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
				title : '文件名',
				field : 'fileName',
				align : 'center',
				valign : 'middle',
			}, {
				title : '班级',
				field : 'classNum',
				align : 'center'
			},{
				title : '课堂',
				field : 'lessonNum',
				align : 'center'
			}, {
				title : '创建时间',
				field : 'createTime',
				align : 'center'
			}, ]
		});

	// 得到查询的参数
	oTableInit.queryParams = function(params) {

        var qclass = $("#classes").val();
        var qclass = $("#lesson").val();
        
		var temp = { // 这里的键的名字和控制器的变量名必须一直，这边改动，控制器也需要改成一样的
			limit : params.limit, // 页面大小
			offset : params.offset, // 页码
			qclass : qclass,
			lesson : lesson,
		};
	
		return temp;
	};
	 return oTableInit;
};

// 刷新表格
function getFilesList() {
    $("#files_table").bootstrapTable('refresh');
}

// 多文件上传
function moreUploadFile() {
	var form = $("#f_fileUpload");
	var options = {
		url : 'upload/moreUploadFile',
		type : 'post',
		// data:{},
		success : function(data) {
			var htmlToJson = JSON.parse(data);
			if (htmlToJson.ifSuccess == "success") {
				alert("文件上传成功！");
			}
			if (htmlToJson.ifSuccess == "error") {
				alert("文件上传失败！");
			}
		}
	};
	form.ajaxSubmit(options);
	getFilesList();
}


//转换日期格式(时间戳转换为datetime格式)
/*function changeDateFormat(cellval) {
    var dateVal = cellval + "";
    if (cellval != null) {
        var date = new Date(parseInt(dateVal.replace("/Date(", "").replace(")/", ""), 10));
        var month = date.getMonth() + 1 < 10 ? "0" + (date.getMonth() + 1) : date.getMonth() + 1;
        var currentDate = date.getDate() < 10 ? "0" + date.getDate() : date.getDate();
        var hours = date.getHours() < 10 ? "0" + date.getHours() : date.getHours();
        var minutes = date.getMinutes() < 10 ? "0" + date.getMinutes() : date.getMinutes();
        var seconds = date.getSeconds() < 10 ? "0" + date.getSeconds() : date.getSeconds();
        return date.getFullYear() + "-" + month + "-" + currentDate + " " + hours + ":" + minutes + ":" + seconds;
    }
}
*/