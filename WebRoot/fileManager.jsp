<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta HTTP-EQUIV="x-ua-compatible" content="IE=edge">
<meta name="viewport"
	content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
<title>Admin</title>
<link rel="stylesheet" href="css/bootstrap.min.css">
<link rel="stylesheet" href="css/darkly.css">
<link rel="stylesheet" href="css/main.css">
<link rel="stylesheet" href="css/fileManager.css">
</head>

<body>
	<!--导航-->
	<nav class="nav navbar-default">
		<div class="container">
			<div class="navbar-header">
				<button class="navbar-toggle" data-toggle="collapse"
					data-target=".navbar-collapse">
					<span class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
				<a href="index2.html" class="navbar-brand">GoodFinder</a>
			</div>
			<div class="navbar-collapse collapse">
				<ul class="nav navbar-nav">
					<li class="active"><a href="upload.jsp"><span
							class="glyphicon glyphicon-home"></span>代码查重</a></li>
					<li><a href="user_list.html"><span
							class="glyphicon glyphicon-user"></span>文件管理</a></li>
					<li><a href="content.html"><span
							class="glyphicon glyphicon-list-alt"></span>结果记录</a></li>
					<li><a href="tag.html"><span
							class="glyphicon glyphicon-tag"></span>其他功能</a></li>
				</ul>
				<ul class="nav navbar-nav navbar-right">
					<li class="dropdown"><a id="dLabel" type="button"
						data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
							我 </a>
					<li><a href="index.html"><span
							class="glyphicon glypxhicon-off"></span>退出</a></li>
				</ul>
			</div>
		</div>
	</nav>

	<div class="container">
		<div class="row">
		
			<div class="fileContent" id="testFileContent"></div>
	
		</div>
	</div>


	<script src="js/jquery.min.js" type="text/javascript"></script>
	<script src="js/bootstrap.min.js" type="text/javascript"></script>
	<script src="js/Chart.js" type="text/javascript"></script>
	<script src="js/fileManager.js" type="text/javascript"></script>
	<script>
		//文件管理器
		$("#testFileContent").initFileManager({
        "fileHead":false,
        "contentMenu":[
            {
                "text":"新建文件夹",
                "code":"1",//1非文件夹右键菜单//2文件夹右键菜单
                "func":function(){
                    createFile("testFileContent");
                }
            }
         ]
    });
	</script>
</body>
</html>