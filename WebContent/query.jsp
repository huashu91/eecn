<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8" %>
<%@ page import="com.eecn.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
<%
String show = "";
queryStudent qs = new queryStudent();
qs.queryByGender("boy");
for(int i = 0; i < qs.element; i++) {
	show += qs.name.elementAt(i);
	show += "<br />";
}
%>
<%=show %>
</body>
</html>