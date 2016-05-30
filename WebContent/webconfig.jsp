<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ page import="com.eecn.*" %>
<%
Web web = new Web();
web.getInfo();
String webname = web.webname;
String weburl = web.weburl;
String h1title = web.h1title;
String h1content = web.h1content;
String h2title1 = web.h2title1;
String h2content1 = web.h2content1;
String h2title2 = web.h2title2;
String h2content2 = web.h2content2;
String h2title3 = web.h2title3;
String h2content3 = web.h2content3;
%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="icon" href="../../favicon.ico">

    <title><%=webname %></title>
    
    <!-- Bootstrap core CSS -->
    <link href="css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="css/jumbotron.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="css/starter-template.css" rel="stylesheet">

    <!-- Just for debugging purposes. Don't actually copy these 2 lines! -->
    <!--[if lt IE 9]><script src="js/ie8-responsive-file-warning.js"></script><![endif]-->
    <script src="js/ie-emulation-modes-warning.js"></script>

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
  </head>

  <body>

    <nav class="navbar navbar-inverse navbar-fixed-top">
      <div class="container">
        <div class="navbar-header">
          <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
            <span class="sr-only">Toggle navigation</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
          <a class="navbar-brand" href="<%=weburl %>"><%=webname %></a>
        </div>
        <div id="navbar" class="collapse navbar-collapse">
          <ul class="nav navbar-nav">
            <li><a href="admin.jsp">后台首页</a></li>
            <li class="active"><a href="webconfig.jsp">网站设置</a></li>
            <li><a href="game.jsp">比赛管理</a></li>
            <li><a href="school.jsp">学校管理</a></li>
            <li><a href="#contact">其他</a></li>
          </ul>
        </div><!--/.nav-collapse -->
      </div>
    </nav>

    <div class="container">


	
      <div class="starter-template">
      <form method=post action="updateWeb.jsp">
        <div class="form-group">
              网站名称：<input type="text" value="<%=webname %>" class="form-control halfwidth" name="webname">
        </div>
        <div class="form-group">
              网站地址：<input type="text" value="<%=weburl %>" class="form-control halfwidth" name="weburl">
        </div>
        <div class="form-group">
              首页标题一：<input type="text" value="<%=h1title %>" class="form-control halfwidth" name="h1title">
        </div>
        <div class="form-group">
              首页内容一：<textarea class="form-control halfwidth" rows="4" name="h1content"><%=h1content %></textarea>
        </div>
        <div class="form-group">
              首页标题二：<input type="text" value="<%=h2title1 %>" class="form-control halfwidth" name="h2title1">
        </div>
        <div class="form-group">
              首页内容二：<textarea class="form-control halfwidth" rows="4" name="h2content1"><%=h2content1 %></textarea>
        </div>
        <div class="form-group">
              首页标题三：<input type="text" value="<%=h2title2 %>" class="form-control halfwidth" name="h2title2">
        </div>
        <div class="form-group">
              首页内容三：<textarea class="form-control halfwidth" rows="4" name="h2content2"><%=h2content2 %></textarea>
        </div>
        <div class="form-group">
              首页标题四：<input type="text" value="<%=h2title3 %>" class="form-control halfwidth" name="h2title3">
        </div>
        <div class="form-group">
              首页内容四：<textarea class="form-control halfwidth" rows="4" name="h2content3"><%=h2content3 %></textarea>
        </div>
        <button type="submit" class="btn btn-success">保存信息</button>
        </form>
      </div>
    </div><!-- /.container -->


    <!-- Bootstrap core JavaScript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
    <script src="../../dist/js/bootstrap.min.js"></script>
    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
    <script src="../../assets/js/ie10-viewport-bug-workaround.js"></script>
  </body>
</html>
