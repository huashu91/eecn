<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ page import="com.eecn.*" %>
<%
request.setCharacterEncoding("utf-8");
String name = request.getParameter("name");
String group1 = request.getParameter("group1");
String group2 = request.getParameter("group2");
String event = request.getParameter("event");
String status = request.getParameter("status");
String other = request.getParameter("other");
if(name != null) {
	Game game = new Game();
	game.insertGame(name, group1, group2, event, status, other);
	response.sendRedirect("game.jsp");
}
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>

<!-- Bootstrap core CSS -->
    <link href="css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="css/jumbotron.css" rel="stylesheet">

    <!-- Just for debugging purposes. Don't actually copy these 2 lines! -->
    <!--[if lt IE 9]><script src="../../assets/js/ie8-responsive-file-warning.js"></script><![endif]-->
    <script src="js/ie-emulation-modes-warning.js"></script>

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>
<body style="width:60%; margin:0 auto;">
<form method=post action="">
<h2>添加比赛</h2>
<div class="form-group">
	<input type="text" placeholder="比赛名称" class="form-control" name="name">
</div>
<div class="form-group">
	<select name="group1">
		<option value="boy">男子组</option>
		<option value="girl">女子组</option>
	</select>
</div>
<div class="form-group">
	<select name="group2">
		<option value="primary">小学组</option>
		<option value="junior">初中组</option>
		<option value="extjunior">职中组</option>
		<option value="senior">高中组</option>
		<option value="extsenior">职高组</option>
	</select>
</div>
<div class="form-group">
	<select name="event">
	<%
		Event ev = new Event();
		ev.queryEvent();
		for(int i = 0; i < ev.element; i++) {
			out.print("<option value='" + ev.name.elementAt(i) + "'>" + ev.name.elementAt(i) + "</option>");
		}
	%>
	</select>
</div>
<div class="form-group">
	<select name="status">
		<option value="未开放">未开放</option>
		<option value="报名阶段">报名阶段</option>
		<option value="比赛阶段">比赛阶段</option>
		<option value="已结束">已结束</option>
	</select>
</div>
<div class="form-group">
	<input type="text" placeholder="其他" class="form-control" name="other">
</div>
<button type="submit" class="btn btn-success center">添加赛事</button>
</form>
<!-- Bootstrap core JavaScript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
    <script src="../../dist/js/bootstrap.min.js"></script>
    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
    <script src="../../assets/js/ie10-viewport-bug-workaround.js"></script>
</body>
</html>