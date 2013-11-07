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

    <title>注册</title>

    <!-- Bootstrap core CSS -->
    <link href="../dist/css/bootstrap.css" rel="stylesheet">

    <link href="../css/register.css" rel="stylesheet">

  </head>

  <body>

    <div class="container">

      <form class="form-signin" method="post" action ="user/userAdd" name="form1" onsubmit="return check()">
        <h2 class="form-signin-heading">注册博客</h2>
        <input type="text" class="form-control" name="username" placeholder="用户名">
        <input type="text" class="form-control" name="email" placeholder="邮箱" autofocus>               
        <input type="text" class="form-control" name="blogName" placeholder="博客昵称">
        <input type="text" class="form-control" name="blogDescription" placeholder="博客签名">        
        <input type="password" class="form-control" name="password" placeholder="密码">
        <input type="password" class="form-control" name="password2" placeholder="确认密码">
      <!--   <label class="checkbox">
           <input type="checkbox" value="remember-me"> Remember me
        </label>
      -->
        <button class="btn btn-lg btn-primary btn-block" type="submit">确认注册</button>
        <button name="quxiao" type="reset"  class="btn btn-lg btn-primary btn-block" >重置 </button>
        	<div id="info" class="container"> 	
                <code>${error_msg}</code>
		</div>
        
      </form>
  	
    </div> 
    <!-- /container -->
            
    <!-- Bootstrap core JavaScript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
      <script>
              function check() { if(document.form1.username.value=="" || document.form1.email.value=="" || 
		document.form1.blogName==""||document.form1.blogDescription==""||document.form1.blogDescription==""
		||document.form1."password"==""
		)
{ alert("请填写完整信息！"); this.form1.username.focus(); return false; }
else if(document.form1.password.value!=document.form1.password2.value!)
{ alert("两次密码输入不一致！");
this.form1.username.focus();
return false; } 
else form1.submit();
}
</script>  
  </body>

</html>
