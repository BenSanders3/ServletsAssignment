<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Temp Converter</title>
</head>
<body>
	<h1>Temperature Converter</h1>
	<form action="getTempServlet"method="post">
		Do you want to convert FROM F or C? (Only type F or C):
	<input type="text"name="userTemp"size="10">
	<input type="submit"value="Submit"/>
	</form>
</body>
</html>