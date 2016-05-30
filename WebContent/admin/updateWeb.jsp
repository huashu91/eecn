<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ page import="com.eecn.*" %>
<%@ page import="java.sql.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
<%
request.setCharacterEncoding("utf-8");
String webname = request.getParameter("webname");
String weburl = request.getParameter("weburl");
String h1title = request.getParameter("h1title");
String h1content = request.getParameter("h1content");
String h2titlel = request.getParameter("h2title1");
String h2contentl = request.getParameter("h2content1");
String h2titlem = request.getParameter("h2title2");
String h2contentm = request.getParameter("h2content2");
String h2titler = request.getParameter("h2title3");
String h2contentr = request.getParameter("h2content3");
Web web = new Web();
web.updateName(webname);
web.updateURL(weburl);
web.updateH1(h1title, h1content);
web.updateH2l(h2titlel, h2contentl);
web.updateH2m(h2titlem, h2contentm);
web.updateH2r(h2titler, h2contentr);
response.sendRedirect("webconfig.jsp");
%>
</body>
</html>