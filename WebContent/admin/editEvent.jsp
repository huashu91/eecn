<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ page import="com.eecn.*" %>
<%
request.setCharacterEncoding("utf-8");
String id = request.getParameter("id");
Event ev = new Event();
ev.queryByID(id);
String name = request.getParameter("name");
String host = request.getParameter("host");
String time = request.getParameter("time");
String other = request.getParameter("other");
if(name != null && time != null) {
	ev.editEvent(id, name, host, time, other);
	response.sendRedirect("event.jsp");
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
<h2>编辑赛事</h2>
<div class="form-group">
	<input type="text" value="<%=ev.name.elementAt(0) %>" class="form-control" name="name">
</div>
<div class="form-group">
	<input type="text" value="<%=ev.host.elementAt(0) %>" class="form-control" name="host">
</div>
<div class="form-group">
	<input type="text" value="<%=ev.time.elementAt(0) %>" class="form-control" name="time">
</div>
<div class="form-group">
	<input type="text" value="<%=ev.other.elementAt(0) %>" class="form-control" name="other">
</div>
<button type="submit" class="btn btn-success center">保存赛事</button>
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