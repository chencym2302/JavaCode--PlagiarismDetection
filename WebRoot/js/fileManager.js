/**
 * 
 */

$.fn.extend({
    initFileManager:function(opt){
        if ( typeof opt != "object" ) {
            alert('参数错误!');
            return;
        }
        var fileManagerId = $(this).attr("id");
        $.each(getInitFileManagerOption(fileManagerId),function(key,value){
            if(opt[key]==null){
                opt[key] = value;
            }else if(key == "contentMenu"){
                opt[key]=$.merge(value,opt[key]);
            }
        });
        $("#"+fileManagerId).data("fileManagerOpt",opt);
        initWithConment(fileManagerId);
        setClickObjectMessage(fileManagerId);
    }
});
 
function getInitFileManagerOption(fileManagerId){
    var initOption={
        "fileManagerId":fileManagerId,
        "fileHead":true,
        "contentMenu":[
            {
                "text":"新建",
                "code":"1",//非文件夹右键菜单
                "func":function(){
                    createFile(fileManagerId);
                }
            },
            {
                "text":"删除",
                "code":"2",//文件夹右键菜单
                "func":function(){
                    deleteFile(fileManagerId);
                }
            },
            {
                "text":"重命名",
                "code":"2",
                "func":function(){
                    chengeFileName(fileManagerId);
                }
            }
        ]
    };
    return initOption;
}
 
function initWithConment(fileManagerId){
    var initContentDiv = "";
    var opt = $("#"+fileManagerId).data("fileManagerOpt");
 
    if(opt.fileHead) {
        initContentDiv += "<div class='fileHeader'>";
        initContentDiv += "<button onclick=createFile('"+fileManagerId+"')>创建文件夹</button><button onclick=removeAllFile('"+fileManagerId+"')>清空文件夹</button><button onclick=deleteFile('"+fileManagerId+"')>删除文件夹</button>";
        initContentDiv += "</div>";
        initContentDiv += " <div class='fileDivision'></div>";
    }
    initContentDiv+="<div class='fileContentDiv'>";
    initContentDiv+="<ul class='fileList'>";
    //下面这两句仅仅测试，删除就好
    initContentDiv+="<li><div>新建文件夹1</div></li>";
    initContentDiv+="<li><div>新建文件夹2新建</div></li>";
    initContentDiv+=" </ul>";
    initContentDiv+="</div>";
    $("#"+fileManagerId).append(initContentDiv);
}
 
 
/**
 * zxm
 * 作用:创建文件
 */
function createFile(fileManagerId){
    //还需要添加写入数据库的代码
    $(".fileList").append("<li><input type='text' class='cleateInputFile' value='新建文件夹' autofocus='autofocus'  onfocus='this.select()' onblur='fileNameSuccess(this)'></li>")
    setClickObjectMessage(fileManagerId);
}
/*失去焦点，也就是文件名输入成功的时候*/
function fileNameSuccess(obj){
    var parentObj=$(obj).parent();
    var objValue = $(obj).val();
    if(objValue==""||objValue==null){
        alert("文件名不能为空");
        $(obj).focus();
        return;
    }
    $(obj).remove();
    $(parentObj).append("<div>"+objValue+"</div>")
}
/**
 * zxm
 * 作用:设置文件点击事件
 * @param fileManagerId 文件管理的根路径
 */
function setClickObjectMessage(fileManagerId){
    //文件上的点击事件
    $("#"+fileManagerId+" .fileContentDiv .fileList li").mousedown(function(e){
        var clickObj = $("#"+fileManagerId).data("clickObj");
        $(this).on('contextmenu', function(){
            return false; //设置返回为false，设置为true则返回右键菜单，大家可以自己修改代码试试
        });
        if(e.which==3){//右键点击
            if(clickObj!=null){
                $(clickObj).removeClass("selectFile");
            }
            $(this).addClass("selectFile");
            clickObj = this;
            $("#"+fileManagerId).data("clickObj",clickObj);
            var position = {
                "X": e.clientX,
                "Y": e.clientY
            }
            initWithConmentMenu(fileManagerId,position,"2");
 
        }else if(e.which==1){//左键点击
            if(clickObj!=null){
                $(clickObj).removeClass("selectFile");
            }
            $(this).addClass("selectFile");
            clickObj = this;
            $("#"+fileManagerId).data("clickObj",clickObj);
 
        }
 
    });
    //文件外空白的点击事件
    $(".fileContent:not(li)").mousedown(function(e){
        var isFile = false;
        if(e.which==1) {
            if($(e.target).attr('class')!="menu") {
                removeMenu(fileManagerId);
            }
        }
        if(e.which==3) {
 
            if($(e.target).attr('class')!="selectFile"){
 
                $(this).on('contextmenu', function(){
                    return false; //设置返回为false，设置为true则返回右键菜单，大家可以自己修改代码试试
                });
                var position = {
                    "X": e.clientX,
                    "Y": e.clientY
                }
                initWithConmentMenu(fileManagerId,position,"1");
            }
        }
    });
}
/**
 * zxm
 * 作用：删除文件
 * @param fileManagerId
 */
function deleteFile(fileManagerId){
    if(confirm("确认要删除？"))
    {
        var clickObj = $("#" + fileManagerId).data("clickObj");
        if (clickObj != null) {
            $(clickObj).remove();
        } else {
            alert("没有选择的文件，请选择要删除的文件！");
        }
    }
}
/**
 * zxm
 * 作用：移除所有的文件
 * @param fileManagerId
 */
function removeAllFile(fileManagerId){
    $("#"+fileManagerId +" .fileList").html("");
}
/**
 * zxm
 * 作用：初始化右键菜单
 * @param fileManagerId
 */
function initWithConmentMenu(fileManagerId,position,code){
    //alert(position.X+","+position.Y);
    var menuLiNimber = 0;
    var opt = $("#"+fileManagerId).data("fileManagerOpt");
    removeMenu(fileManagerId);
    var menuData ="";
    menuData+="<div class='menuDiv' id='"+fileManagerId+"_menuDiv'>";
    menuData+="<ul>";
    for(var i = 0; i<opt.contentMenu.length;i++){
        if(code==opt.contentMenu[i].code) {
            menuLiNimber++;
            menuData += "<li class='menu' onclick= dofuntionWithMenu('"+fileManagerId+"','"+i+"')>"+opt.contentMenu[i].text+"</li>"
        }
    }
 
    menuData+="</ul>";
    menuData+="</div>";
    $("#"+fileManagerId).append(menuData);
    var X = position.X+10;
    var Y=0;
    if(opt.fileHead) {
         Y = position.Y - 60;
    }else{
         Y = position.Y;
    }
    $("#"+fileManagerId+"_menuDiv").css({"top":Y,"left":X});
    var height = menuLiNimber*30;
    $("#"+fileManagerId+"_menuDiv").css("height",height);
 
}
/**
 * zxm
 * 作用：移除菜单
 * @param fileManagerId 文件管理id
 */
function removeMenu(fileManagerId){
    var menuObj =  $("#"+fileManagerId+"_menuDiv");
    if(menuObj!=null){
        menuObj.remove();
    }
}
/**
 * zxm
 * 作用：执行menu中的方法函数
 * @param fileManagerId 文件管理id
 * @param menuContentId 菜单所在的位置
 */
function dofuntionWithMenu(fileManagerId,menuContentId){
    var opt = $("#"+fileManagerId).data("fileManagerOpt");
    removeMenu(fileManagerId);
    opt.contentMenu[menuContentId].func();
 
}
/**
 * zxm
 * 作用：更改文件名
 * @param fileManagerId 文件管理id
 */
function chengeFileName(fileManagerId){
    var clickObj = $("#"+fileManagerId).data("clickObj");
    if(clickObj!=null){
        var divValue =  $(clickObj).children("div").html();
        $(clickObj).children("div").remove();
        $(clickObj).append("<input type='text' class='cleateInputFile' value='"+divValue+"' autofocus='autofocus'  onfocus='this.select()' onblur='fileNameSuccess(this)'>");
    }else{
        alert("没有选择的文件，请选择要修改文件名的文件！");
    }
    removeMenu(fileManagerId);
}