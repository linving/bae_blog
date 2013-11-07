<%@ page language="java" import="java.util.*,java.net.URL" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="shortcut icon" href="../../assets/ico/favicon.png">

    <title>Linving Home</title>

    <!-- Bootstrap core CSS -->
    <link href="../../dist/css/bootstrap.css" rel="stylesheet">

    <!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
      <script src="../../assets/js/html5shiv.js"></script>
      <script src="../../assets/js/respond.min.js"></script>
    <![endif]-->

    <!-- Custom styles for this template -->
    <link href="../../css/carousel.css" rel="stylesheet">
  </head>
<!-- NAVBAR
================================================== -->
  <body>
    <div class="navbar-wrapper">
      <div class="container">

        <div class="navbar navbar-inverse navbar-static-top">
          <div class="container">
            <div class="navbar-header">
              <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
              </button>
              <a class="navbar-brand" href="#">Living</a>
            </div>
            <div class="navbar-collapse collapse">
              <ul class="nav navbar-nav">
                <li class="active"><a href="#">Home</a></li>               
                 <li><a href="../../jsp/about_me/about.jsp">关于我</a></li>
                <li class="dropdown">
                  <a href="#" class="dropdown-toggle" data-toggle="dropdown">更多 <b class="caret"></b></a>
                  <ul class="dropdown-menu">
                    <li><a href="#">我的产品</a></li>                  
                    <li class="divider"></li>
                    <li class="dropdown-header">Android</li>
                    <li><a href="#">One more separated link</a></li>
                      <li class="dropdown-header">Web</li>
                    <li><a href="user/register" target="_blank">Myblog</a></li>
                  </ul>
                </li>
              </ul>
            </div>
          </div>
        </div>

      </div>
    </div>


    <!-- Carousel
    ================================================== -->
    <div id="myCarousel" class="carousel slide">
      <!-- Indicators -->
      <ol class="carousel-indicators">
        <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
        <li data-target="#myCarousel" data-slide-to="1"></li>
        <li data-target="#myCarousel" data-slide-to="2"></li>
      </ol>
      <div class="carousel-inner">
        <div class="item active">
          <img src="data:image/png;base64," data-src="holder.js/100%x500/auto/#777:#7a7a7a/text:First slide" alt="First slide">
          <div class="container">
            <div class="carousel-caption">
              <h1>欢迎你的光临！</h1>
              <p>欢迎你的光临！你可能是我的同学，或者是我的亲戚，或者是我的朋友！或者是偶遇的路人！这都不是问题欢迎你的到来！</p>
              <p><a class="btn btn-large btn-primary" href="#">Learn more</a></p>
            </div>
          </div>
        </div>
        <div class="item">
          <img src="data:image/png;base64," data-src="holder.js/100%x500/auto/#777:#7a7a7a/text:Second slide" alt="Second slide">
          <div class="container">
            <div class="carousel-caption">
              <h1>我的基本资料</h1>
              <p>还没想到要写什么在这里填点信息来占个位置！</p>
              <p><a class="btn btn-large btn-primary" href="#">Learn more</a></p>
            </div>
          </div>
        </div>
        <div class="item">
          <img src="data:image/png;base64," data-src="holder.js/100%x500/auto/#777:#7a7a7a/text:Third slide" alt="Third slide">
          <div class="container">
            <div class="carousel-caption">
              <h1>求职意向</h1>
              <p>快毕业，看见每个同学都在忙着找工作，我也不列外！求带走！</p>
              <p><a class="btn btn-large btn-primary" href="#">Learn more</a></p>
            </div>
          </div>
        </div>
      </div>
      <a class="left carousel-control" href="#myCarousel" data-slide="prev"><span class="glyphicon glyphicon-chevron-left"></span></a>
      <a class="right carousel-control" href="#myCarousel" data-slide="next"><span class="glyphicon glyphicon-chevron-right"></span></a>
    </div><!-- /.carousel -->



    <!-- Marketing messaging and featurettes
    ================================================== -->
    <!-- Wrap the rest of the page in another container to center all the content. -->

    <div class="container marketing">

      <!-- Three columns of text below the carousel -->
      <div class="row">
        <div class="col-lg-4">
          <img class="img-circle" src="../../pic_files/home_1.png"  alt="Generic placeholder image">
          <h2>个人资料</h2>
          <p>来自美丽的广西玉林...</p>
          <p><a class="btn btn-default" target="_blank" href="../../jsp/about_me/my_info.jsp">View details &raquo;</a></p>
        </div><!-- /.col-lg-4 -->
        <div class="col-lg-4">
          <img class="img-circle" src="../../pic_files/home_2.png"  alt="Generic placeholder image">
          <h2>自我评价</h2>
          <p>我觉得我是一个...</p>
          <p><a class="btn btn-default" href="../../jsp/about_me/myself.jsp">View details &raquo;</a></p>
        </div><!-- /.col-lg-4 -->
        <div class="col-lg-4">
          <img class="img-circle" src="../../pic_files/home_3.png"  alt="Generic placeholder image">
          <h2>未来的我</h2>
          <p>我想未来的我会是...</p>
          <p><a class="btn btn-default" href="../../jsp/about_me/my_future.jsp">View details &raquo;</a></p>
        </div><!-- /.col-lg-4 -->
      </div><!-- /.row -->


      <!-- START THE FEATURETTES -->

      <hr class="featurette-divider">

      <div class="row featurette">
        <div class="col-md-7">
          <h2 class="featurette-heading">欢迎你的到来！<span class="text-muted">我是林勇</span></h2>
          <p class="lead">没错就是那个，又高又帅穷到掉渣的那个！如果有人说我长的丑， 我只是帅的很低调。上天是公平的-能做的只有站在自己的位置，扮演好各自的角色。</p>
        </div>
        <div class="col-md-5">
          <img class="featurette-image img-responsive" src="../../pic_files/home_4.png"  alt="Generic placeholder image">
        </div>
      </div>

      <hr class="featurette-divider">

      <div class="row featurette">
        <div class="col-md-5">
          <img class="featurette-image img-responsive" src="../../pic_files/home_6.png"  alt="Generic placeholder image">
        </div>
        <div class="col-md-7">
          <h2 class="featurette-heading">Oh yeah, <span class="text-muted">我就是我</span></h2>
          <p class="lead">本人性格开朗、稳重、有活力，待人热情、真诚；工作认真负责，积极主动，能吃苦耐劳，用于承受压力，勇于创新；有很强的组织能力和团队协作精神，具有较强的适应能力；纪律性强，工作积极配合；意志坚强，具有较强的无私奉献精神。</p>
          <p  class="lead">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
          --- 一口气说这么多很累的！</p>
        </div>
      </div>

      <hr class="featurette-divider">

      <div class="row featurette">
        <div class="col-md-7">
          <h2 class="featurette-heading">And lastly, this one. <span class="text-muted">感谢妈妈！</span></h2>
          <p class="lead">当代散文家余秋雨在一篇文章中写道：“一切远行者的出发点总是与妈妈告别……而他们的终点则是衰老……暮年的老者呼喊妈妈是不能不让人动容的，一声呼喊道尽了回归也道尽了漂泊”。</p>
        </div>
        <div class="col-md-5">
          <img class="featurette-image img-responsive" src="../../pic_files/home_5.png"  alt="Generic placeholder image">
        </div>
      </div>

      <hr class="featurette-divider">

      <!-- /END THE FEATURETTES -->


      <!-- FOOTER -->
      <footer>
        <p class="pull-right"><a href="#">Back to top</a></p>
        <p>&copy; 2013 Linving, Inc. &middot; <a href="http://weibo.com/0099lingyong/home?wvr=5&c=spr_web_sq_firefox_weibo_t001">新浪微博</a> &middot; <a href="http://user.qzone.qq.com/1013598664">QQ空间</a> &middot; <a href="https://github.com/linving">Github</a></p>
      </footer>

    </div><!-- /.container -->


    <!-- Bootstrap core JavaScript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
    <script src="../../asset/js/jquery.js"></script>
    <script src="../../dist/js/bootstrap.min.js"></script>
    <script src="../../asset/js/holder.js"></script>
  </body>
</html>
