<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ page import="com.eecn.*" %>
<%
if(session.getAttribute("username") == null || session.getAttribute("username").toString().isEmpty()) response.sendRedirect("../index.jsp");
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
<%
Game qg = new Game();
qg.queryGame();
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
            <li><a href="webconfig.jsp">网站设置</a></li>
            <li><a href="event.jsp">赛事管理</a></li>
            <li class="active"><a href="game.jsp">比赛管理</a></li>
            <li><a href="school.jsp">学校管理</a></li>
            <li><a href="#contact">其他</a></li>
          </ul>
        </div><!--/.nav-collapse -->
      </div>
    </nav>

    <div class="container">

      <div class="starter-template">
      <form>
      <input type="text" placeholder="输入赛事名称进行查找" class="form-control halfwidth" name="h2title3">
      <button type="submit" class="btn btn-success">查找比赛</button>
      <button class="btn btn-success" onclick="javascript:window.open('newGame.jsp')">添加比赛</button>
      </form>
      <hr />
      	<%
      	String group1 = null;
  		String group2 = null;
      	out.print("<table class='info_table'>");
      	out.print("<tr><th>比赛ID</th><th>比赛名称</th><th>性别组别</th><th>年级组别</th><th>所属赛事</th><th>比赛状态</th><th>其他</th></tr>");
      	for(int i = 0; i < qg.element; i++) {
      		if(qg.group1.elementAt(i).equals("girl")) group1 = "女子组";
      		if(qg.group1.elementAt(i).equals("boy")) group1 = "男子组";
      		if(qg.group2.elementAt(i).equals("primary")) group2 = "小学组";
      		if(qg.group2.elementAt(i).equals("junior")) group2 = "初中组";
      		if(qg.group2.elementAt(i).equals("extjunior")) group2 = "职中组";
      		if(qg.group2.elementAt(i).equals("senior")) group2 = "高中组";
      		if(qg.group2.elementAt(i).equals("extsenior")) group2 = "职高组";
      		out.print("<tr>");
      		out.print("<td>" + qg.id.elementAt(i) + "</td>");
      		out.print("<td><a href='editEvent.jsp?id=" + qg.id.elementAt(i) + "'>" + qg.name.elementAt(i) + "</a></td>");
      		out.print("<td>" + group1 + "</td>");
      		out.print("<td>" + group2 + "</td>");
      		out.print("<td>" + qg.event.elementAt(i) + "</td>");
      		out.print("<td>" + qg.status.elementAt(i) + "</td>");
      		out.print("<td>" + qg.other.elementAt(i) + "</td>");
      		out.print("<td><a href='delete.jsp?action=game&id=" + qg.id.elementAt(i) + "'>删除</a></td>");
      		out.print("</tr>");
      	}
      	out.print("</table>");
      	%>
      </div>

    </div><!-- /.container -->


    <!-- Bootstrap core JavaScript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
    <script src="../../dist/js/bootstrap.min.js"></script>
    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
    <script src="../../assets/js/ie10-viewport-bug-workaround.js"></script>
     <script type="text/javascript">
    
    <!--
    function newWindow() {
    	window.location.href('newEvent.jsp');
    }
    
    -->
    
    </script> 
  </body>
</html>
