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
<link rel="stylesheet" href="css/style.css">
<link rel="stylesheet"
	href="https://unpkg.com/bootstrap-table@1.14.2/dist/bootstrap-table.min.css">
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
				<a href="upload.jsp" class="navbar-brand">GoodFinder</a>
			</div>
			<div class="navbar-collapse collapse">
				<ul class="nav navbar-nav">
					<li><a href="upload.jsp"><span
							class="glyphicon glyphicon-home"></span>代码上传</a></li>
					<li><a href="detect.jsp"><span
							class="glyphicon glyphicon-user"></span>代码查重</a></li>
					<li><a href="detectmoss.jsp"><span
							class="glyphicon glyphicon-list-alt"></span>Moss查重</a></li>
					<li class="active"><a href="compare.jsp"><span
							class="glyphicon glyphicon-tag"></span>在线对比</a></li>
				</ul>
				<ul class="nav navbar-nav navbar-right">
					<li class="dropdown"><a id="dLabel" type="button"
						data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
							教师A </a>
					<li><a href="login.jsp"><span
							class="glyphicon glypxhicon-off"></span>退出</a></li>
				</ul>
			</div>
		</div>
	</nav>

	<div class="container">
		<input type="file" id="fil"style="display:none"
			onchange="handleFiles(this.files, this.id)" accept=""> <input
			type="file" id="fir"style="display:none"
			onchange="handleFiles(this.files, this.id)">


		<div class="col-md-12">
			<div class="wrap" id="cont">
				<div class="column_left">
					<h3 class="glow" id="upload_left">Upload</h3>
					<textarea draggable="false" rows="25"
						placeholder="or enter some code..." id="code_left"></textarea>
				</div>

				<div class="column_right">
					<h3 class="glow" id="upload_right">Upload</h3>
					<textarea draggable="false" rows="25"
						placeholder="or enter some code..." id="code_right"></textarea>
				</div>
			</div>
		</div>
	</div>
	<script src="js/jquery-3.3.1.js" type="text/javascript"></script>
	<script src="js/jquery-form.js" type="text/javascript"></script>
	<script src="js/bootstrap.min.js" type="text/javascript"></script>
	<script src="js/Chart.js" type="text/javascript"></script>
	<script src="js/bootstrap-table.js" type="text/javascript"></script>
	<script src="js/bootstrap-table-zh-CN.js" type="text/javascript"></script>
	<script src="js/detect.js" type="text/javascript"></script>
	<script src="js/app.js" type="text/javascript"></script>

	<script>
		
	</script>

</body>
</html>