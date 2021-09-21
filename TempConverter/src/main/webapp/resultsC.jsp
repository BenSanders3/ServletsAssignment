<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Final Fahrenheit Temp</title>
</head>
<h1>Celsius ----> Fahrenheit:</h1>
<body>
	<p>${calcTemp.getTemp()} degrees fahrenheit <br /></p>
	<a href="celsius.jsp">Select a different temperature</a>
	<p>OR</p>
	<a href="index.jsp">Chose different unit</a>
</body>
</html>