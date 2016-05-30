<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ page import="com.eecn.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
<%
if(session.getAttribute("username") == null || session.getAttribute("username").toString().isEmpty()) response.sendRedirect("../index.jsp");
String action = request.getParameter("action");
String id = request.getParameter("id");
if(action.equals("game")) {
	Game game = new Game();
	game.deleteGame(id);
	response.sendRedirect("game.jsp");
}
if(action.equals("event")) {
	Event ev = new Event();
	ev.deleteEvent(id);
	response.sendRedirect("event.jsp");
}
%>
</body>
</html>