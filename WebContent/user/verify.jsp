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
String username = request.getParameter("username");
String password = request.getParameter("password");
String sql = "SELECT * FROM user WHERE username='" + username + "' AND password='" + password + "'";
ADO ado = new ADO("root", "123321", "testsport");
try {
	ResultSet ret = ado.getRet(sql);
	if(ret.next()) {
		session.setAttribute("user", username);
		session.setAttribute("school", ret.getString("school"));
		response.sendRedirect("user.jsp");
	} else {
		response.sendRedirect("login.jsp");
	}
} catch (Exception e) {
	e.printStackTrace();
}
%>
</body>
</html>