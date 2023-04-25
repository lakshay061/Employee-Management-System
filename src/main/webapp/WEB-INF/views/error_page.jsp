<%@page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
	<title>Error Page</title>
	<style>
		body {
	  		background-color: #FF4136; /* awesome background color */
			color: #FFFFFF; /* awesome font color */
			text-align: center;
			font-family: Arial, sans-serif;
		}
		h1 {
			font-size: 3em;
			margin-top: 100px;
		}
		p {
			font-size: 1.5em;
			margin-bottom: 50px;
		}
	</style>
</head>
<body>
	<h1>OOPS!! Something went wrong</h1>
	<h2>${msg}</h2>
	<p>Please try again later.</p>
</body>
</html>