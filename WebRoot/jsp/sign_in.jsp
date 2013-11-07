<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>

<html lang="en">
  <head>
    <base href="<%=basePath%>">
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="shortcut icon" href="../asset/ico/favicon.png">

    <title>登陆</title>

    <!-- Bootstrap core CSS -->
    <link href="../dist/css/bootstrap.css" rel="stylesheet">

    <link href="../css/register.css" rel="stylesheet">

  </head>

  <body>

    <div class="container">

      <form class="form-signin" method="post" action ="user/userSign" name="form1" >
        <h2 class="form-signin-heading">博客登陆</h2>
        <input type="text" class="form-control" name="username" placeholder="用户名">                    
        <input type="password" class="form-control" name="password" placeholder="密码">
        <button class="btn btn-lg btn-primary btn-block" type="submit">登陆</button>
        <br>
        <p><a class="btn btn-primary btn-rg" href="user/register">注册 &raquo;</a></p>
        	<div id="info" class="container"> 	
                <code>${error_msg}</code>
		</div>
        
      </form>  	
    </div> 
    </body>

</html>
