<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Landing Page</title>
<style type="text/css">
	body
	{
		background-color: black;
	}
	p
	{
		color: #39ff14;
		font-size: 30px;
		text-align: right;
	}
</style>
</head>
<body>
	<%@ include file="header.html" %>
	
	<p><a href = "login.jsp" style="color=rgb(0,0,192);">Login</a></p>
	<hr>
	<h1 style="color: #39ff14;">Welcome to Login Page!</h1>
	
	<%@ include file="footer.html" %>
</body>
</html>