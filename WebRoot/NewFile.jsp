<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>UpLoad</title>
<script type="text/javascript" >
function fileupload(filepath){  
if(filepath!=""){    
sendFileToServer(filepath);  
}  else{  
alert("请选择要上传的文件");  
} 
}
function callback() {   
if (xmlhttp.readyState == 4) {       
var responseText = xmlhttp.responseText;          
}
}
function sendByteStreamToServer(stream,url){  
if (window.XMLHttpRequest) {      
xmlhttp = new XMLHttpRequest();       
if (xmlhttp.overrideMimeType) {          
xmlhttp.overrideMimeType("text/xml")      
}  
} else if (window.ActiveXObject) {       
var activexName = ["MSXML2.XMLHTTP","Microsoft.XMLHTTP"];      
for (var i = 0; i < activexName.length; i++) {          
try {              
xmlhttp = new ActiveXObject(activexName[i]);              
break;          
} catch(e) {               
e.print()          
}    
} 
} 
xmlhttp.onreadystatechange = callback;  
xmlhttp.open("post", url, false);  
boundary="abcd"  
xmlhttp.setRequestHeader("Content-Type", "multipart/form-data, boundary="+boundary);
xmlhttp.setRequestHeader("Content-Length", stream.Size); 
xmlhttp.send(stream); 
}
function sendFileToServer(filePath){     
var filepath=encodeURI(encodeURI(filePath));    
var stream =new ActiveXObject("ADODB.Stream");     
stream.Type=1;     
stream.Open();     
stream.Position = 0;//指定或返加对像内数据的当前指针。
stream.LoadFromFile(filePath) //将FileName指定的文件装入对像中,参数FileName为指定的用户名
stream.Position = 0;
sendByteStreamToServer(stream,"<%=request.getContextPath() %>/upLoad.do?path="+filepath);//请求路径
stream.Close();
}
var countfiles=0;
var countfolders=0;
//用于打开浏览对话框选择路径
function BrowseFolder(){
try{   
var Message = "请选择文件夹"; //选择框提示信息
var Shell = new ActiveXObject( "Shell.Application" );   
var Folder = Shell.BrowseForFolder(0,Message,0x0040,0x11);//起始目录为我的电脑
//var Folder = Shell.BrowseForFolder(0,Message,0); //起始目录为桌面
 if(Folder != null){
Folder = Folder.items(); // 返回 FolderItems 对象 
Folder = Folder.item(); // 返回 Folderitem 对象
Folder = Folder.Path; // 返回路径
if(Folder.charAt(Folder.length-1) != "\\"){
Folder = Folder + "\\";   
}
return Folder;
}else{      
Folder=""; 
return Folder;  
} 
} catch(e){     
alert(e.message+"11"); 
}
}
//用于遍历
function traverse(localPath,textHtml){ 
var fso = new ActiveXObject("Scripting.FileSystemObject"); 
var currentFolder = fso.GetFolder(localPath);   
var fileList = new Enumerator(currentFolder.files);   
var subFolderList = "";   
var fileHtml=textHtml;   
var aFile;      
for (; !fileList.atEnd(); fileList.moveNext()) { 
countfiles++;   
aFile=fileList.item();
fileHtml.push(aFile.Path);
}
subFolderList = new Enumerator(currentFolder.SubFolders); 
for (; !subFolderList.atEnd(); subFolderList.moveNext())   { 
countfolders++;
 fileHtml=traverse(subFolderList.item().Path,fileHtml)//递归遍历子文件夹  
}
return(fileHtml);
}
function showDiv(){
document.getElementById('loadStyle').style.display='inline';
}
function browse(){
showDiv(); 
document.all.path.value=BrowseFolder();
if(viewfiles()){
document.getElementById('loadStyle').style.display='none';
alert("文件上传成功");
}//上传文件
}

function viewfiles(){
var ts = document.getElementById('loadStyle');
var flag = true;
var textHtml = new Array(); 
var textHtmls = new Array(); 
var folderpath=document.all.path.value;
if(folderpath == ''){
document.getElementById('loadStyle').style.display='none';
flag = false;
}else{
setTimeout("showDiv()",2000);
textHtmls=traverse(folderpath,textHtml);
for(var i=0;i<(textHtmls.length);i++){    
fileupload(textHtmls[i]);
ts.innerHTML = textHtmls[i] + "<br/>";
}  
flag = true;
}
return flag;
}
 </script>


</head>
<body>
<input type="text" id="path" name="path">
<input type="button" value="选择" onclick="browse()">
<div style="display: none;" id="loadStyle">
文件上传中
</div>
</body>
</html>