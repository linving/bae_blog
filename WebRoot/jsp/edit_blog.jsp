<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<%@ page import="com.blog.model.User"%>

<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="description" content="">
<meta name="author" content="">
<link rel="shortcut icon" href="../../assets/ico/favicon.png">

<title>Start Blog</title>

<!-- Bootstrap core CSS -->
<link href="../../dist/css/bootstrap.css" rel="stylesheet">

<!-- Custom styles for this template -->
<link href="../css/edit_blog.css" rel="stylesheet">

</head>
<%
	String s = session.getId();
	User u = (User) session.getAttribute("user");
%>
<body>

	<div class="navbar navbar-inverse navbar-fixed-top">
		<div class="container">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle" data-toggle="collapse"
					data-target=".navbar-collapse">
					<span class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
				<a class="navbar-brand" href="#">${user.blogName} </a>
			</div>
			<div class="collapse navbar-collapse">
				<ul class="nav navbar-nav">
					 <li ><a href="allblogs">主页</a></li>           
                     <li><a href="listBlogs" target="_blank">我的博客</a></li>
                     <li><a class="active" href="writeblog" target="_blank">写博客</a></li>
                     <li><a href="userdetail">关于我</a></li>
				</ul>
			</div>
			<!--/.nav-collapse -->
		</div>
	</div>



	<div class="container">

		<div class="../css/edit_blog.css">
			<h1>Starting Blog</h1>
			<form action="/user/blogAdd" method="post">
				<h2 class="form-signin-heading">博客标题：</h2>
				<input type="text" class="form-control" name="blogTitle"
					placeholder="标题">
				<h2 class="form-signin-heading">博客内容：</h2>
				<textarea rows="12" cols="80" class="form-control"
					name="blogContent" placeholder="内容"></textarea>
				<br>
				<button class="btn btn-lg btn-primary" type="submit">发表博客</button>
			</form>


		</div>
		<br>
		<p>
			<a class="btn btn-primary btn-rg" href="listBlogs?index=0">查看博客 &raquo;</a>
		</p>
	</div>

	<!-- /.container -->
	<!-- Bootstrap core JavaScript
    ================================================== -->
	<!-- Placed at the end of the document so the pages load faster -->
	<script src="../../asset/js/jquery.js"></script>
	<script src="../../dist/js/bootstrap.min.js"></script>
</body>
</html>
