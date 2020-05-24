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
					<li class="active"><a href="detect.jsp"><span
							class="glyphicon glyphicon-user"></span>代码查重</a></li>
					<li><a href="detectmoss.jsp"><span
							class="glyphicon glyphicon-list-alt"></span>Moss查重</a></li>
					<li><a href="compare.jsp"><span
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

		<div class="col-md-12">
			<div class="panel panel-default" style="padding-bottom: 0px;">
				<div class="panel-heading">查重模块</div>
				<div class="panel-body">
					<form id="f_codeDetect" class="form-horizontal">
						<div class="form-group" style="margin-top: 15px">

							<div class="col-sm-3" style="width: 20%">
								<input type="text" class="form-control" name="classes" value=""
									placeholder="填写班級" />
							</div>

							<div class="col-sm-3" style="width: 20%">
								<input type="text" class="form-control" name="lesson" value=""
									placeholder="课程序号" />
							</div>

							<div class="col-sm-3" style="width: 10%">
								<input type="text" class="form-control" name="lowScore" value=""
									placeholder="阈值" />
							</div>
							<div class="col-sm-4" style="width: 50%; text-align: left">
								<button type="submit" onclick="codeDetect()"
									class="btn btn-default"
									style="width: 20%; margin-top: 0px; float: right">开始查重</button>
							</div>
							

						</div>
					</form>

				</div>
			</div>
			<div class="col-md-12">
				<table id="results_table2"></table>
			</div>
			<div class="col-md-12">
				<table id="results_table"></table>
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
	
	
	<script>
		
	</script>

</body>
</html>