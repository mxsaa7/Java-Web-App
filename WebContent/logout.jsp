<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
		
		session.invalidate();

%>
<div class="container">
	<h1>You have been logged out</h1>
	<a href="login.jsp">Please log in again</a>
</div>
	
</body>
</html>