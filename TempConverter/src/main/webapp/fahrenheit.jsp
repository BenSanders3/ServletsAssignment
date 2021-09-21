<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Fahrenheit</title>
</head>
<body>
<h1>Selected Temperature: Fahrenheit</h1>
<form action="ConvertToCelsius"method="post">
		Input temp in fahrenheit:
	<input type="text"name="userTemp"size="10">
	<input type="submit"value="Submit"/>
	</form>
</body>
</html>