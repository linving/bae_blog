<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>  
    <%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
		+ path + "/";
%>
<%@ page import="com.blog.model.User"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>   
<%@ page import="com.blog.model.Comment"%>

<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">
   
    <link rel="shortcut icon" href="../../assets/ico/favicon.png">

    <title>Starter Template for Bootstrap</title>
    <!-- Bootstrap core CSS -->
    <link href="../../dist/css/bootstrap.css" rel="stylesheet">
    <!-- Custom styles for this template -->
    <link href="../../css/starter-template.css" rel="stylesheet">
    <!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
      <script src="../../assets/js/html5shiv.js"></script>
      <script src="../../assets/js/respond.min.js"></script>
    <![endif]-->
  </head>
<%	String s = session.getId();
		User u = (User) session.getAttribute("user");
	%>
  <body background="../pic_files/body_bg.jpg" >

    <div class="navbar navbar-inverse navbar-fixed-top">
      <div class="container">
        <div class="navbar-header">
          <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
          <a class="navbar-brand" href="#">${u.blogName }</a>
        </div>
        <div class="collapse navbar-collapse">
          <ul class="nav navbar-nav">
             <li ><a href="allblogs">主页</a></li>           
            <li><a href="listBlogs" target="_blank">我的博客</a></li>
            <li><a class="active" href="writeblog" target="_blank">写博客</a></li>
            <li><a href="userdetail">关于我</a></li>
          </ul>
        </div><!--/.nav-collapse -->
      </div>
    </div>

    <div class="container">
      <div class="starter-template">
      <h6> 博主签名：</h6>
      <h1>   ${blog.userId.blogDescription }</h1>
     
      </div>
    </div><!-- /.container -->

    <div class="container">
      <div class="starter-template">
        <h2> ${blog.blogTitle}</h2>
        <br>
        <p>博客内容：</p>
        <br>
        <p class="lead"> ${blog.blogContent}</p>    
       </div>      
      
    <p class="lead" >评论：</p>   
    <img src="../pic_files/nav.png">
    <br>
    <br>
    <c:forEach items="${comments}" varStatus="status" var="comment">    
	     <div >
          <h4> ${comment.userId.blogName}说：</h4>
              <p> ${comment.commentContent }</p>
           <h6> 发布时间：${comment.commentTime}</h6>
            </div>
          <br>     
	 </c:forEach>                            
          <br>
        <form class="form-signin" method="post" action ="commentblog"  >       
        <textarea name="commentContent" class="form-control"  rows="3" cols="75" placeholder="评论内容："></textarea>
        <input name="blogid" type="hidden" value="${blog.blogId}">
        <br>
        <button class="btn btn-primary btn-rg" type="submit">发布</button>     
        <div id="info" class="container"> 	
                <code>${error_msg}</code>
		</div>       
        </form>   
       </div><!-- /.container -->
   
      	
    <!-- Bootstrap core JavaScript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
    <script src="../../asset/js/jquery.js"></script>
    <script src="../../dist/js/bootstrap.min.js"></script>
  </body>
</html>
