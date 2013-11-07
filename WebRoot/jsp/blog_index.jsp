<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
		+ path + "/";
%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>   
<%@ page import="com.blog.model.User"%>

<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="shortcut icon" href="../../asset/ico/favicon.png">

    <title>众览天下博客</title>

    <!-- Bootstrap core CSS -->
    <link href="../../dist/css/bootstrap.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="../../css/jumbotron.css" rel="stylesheet">

    <!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
      <script src="../../assets/js/html5shiv.js"></script>
      <script src="../../assets/js/respond.min.js"></script>
    <![endif]-->
  </head>
   <%	String s = session.getId();
		User u = (User) session.getAttribute("user");  			
	%>
  <body>
    <div class="navbar navbar-inverse navbar-fixed-top">
      <div class="container">
        <div class="navbar-header">
          <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
          <a class="navbar-brand" href="#">博览天下</a>
        </div>
        <div class="navbar-collapse collapse">
          <ul class="nav navbar-nav">
              <li class="active"><a href="allblogs" target="_blank">主页</a></li>           
            <li><a href="listBlogs" target="_blank" >我的博客</a></li>
            <li><a href="writeblog" target="_blank">写博客</a></li>
            <li><a href="userdetail" target="_blank">关于我</a></li>          
         </ul>
          <c:if test="${user==null  }">
             <form class="navbar-form navbar-right" action="user/userSign" method="post">
            <div class="form-group">
              <input type="text" placeholder="用户名" name="username" class="form-control">
            </div>
            <div class="form-group">
              <input type="password" placeholder="密码" name="password" class="form-control">
            </div>
            <button type="submit" class="btn btn-success">登陆</button>
       <a class="btn btn-default"  target="_blank" href="user/register">注册</a>
           
          </form>       
                                  
   		</c:if>
         
         
        </div><!--/.navbar-collapse -->
      </div>
    </div>

    <!-- Main jumbotron for a primary marketing message or call to action -->
    <div class="jumbotron">
      <div class="container">
        <h1>Hello, world!</h1>
        <p>欢迎来到这里！</p>
        <p><a class="btn btn-primary btn-lg">Learn more &raquo;</a></p>
      </div>
    </div>

    <div class="container">
      <!-- Example row of columns -->
      <div class="row">
     <c:forEach items="${blogList}" varStatus="status" var="blog">    
	     <div class="col-lg-4">
              <h2> 标题：${blog.blogTitle}</h2>
           <!--   <p> 内容：${blog.blogContent }</p> --> 
              <p>  发布时间：${blog.saveDate}</p>
              <p><a class="btn btn-default"  target="_blank" href="blogdetail?blogid=${blog.blogId}">View details &raquo;</a></p>
           </div>
	     </c:forEach>                  
      </div>

      <hr>

      <footer>
        <p>&copy; Company 2013</p>
      </footer>
    </div> <!-- /container -->


    <!-- Bootstrap core JavaScript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
    <script src="../../asset/js/jquery.js"></script>
    <script src="../../dist/js/bootstrap.min.js"></script>
  </body>
</html>