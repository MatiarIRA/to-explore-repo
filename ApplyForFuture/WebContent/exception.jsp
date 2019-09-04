<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Error Handling</title>
</head>
<body>
	<h3><font color=red>Error Page : </font></h3>
	<p><%out.println("statusCode: " + request.getAttribute("statusCode"));%></p>
	<p><%out.println("errorMessage: " + request.getAttribute("errorMessage"));%></p>
	<p><%out.println("requestURI: " + request.getAttribute("requestURI"));%></p>
	<p><%out.println("servletName: " + request.getAttribute("servletName"));%></p>
</body>
</html>