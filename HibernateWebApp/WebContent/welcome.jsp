<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome Page</title>
</head>
<body>
	<%@ include file="header.html" %>
	
	<c:set var="uname" value="${param.username }" scope="session"></c:set>
	<c:url var="productUrlEnc" value="product.jsp"></c:url>

	<%-- Expressions --%>
	
	<p> Dear ${param.username} Welcome to the Online Shopping Center for Infinity!</p>
	<p> Yours session timeout period is ${pageContext.session.maxInactiveInterval } seconds.
	<p> To view and purchase products <a href="${productUrlEnc }">Click here!</a>
	
	<%@ include file="footer.html" %>
</body>
</html>