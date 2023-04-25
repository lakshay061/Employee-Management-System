<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page isELIgnored="false"%>
	
<!DOCTYPE html>
<html>
<head>
<title>Employee Management System</title>
<style>
body {
	background-color: #3498DB; /* awesome background color */
	color: #FFFFFF; /* awesome font color */
	text-align: center;
	font-family: Arial, sans-serif;
}

h1 {
	font-size: 3em;
	margin-top: 100px;
	margin-bottom: 50px;
	font-weight: bold;
}

@
keyframes rotate {from { transform:rotateY(0deg);
	
}

to {
	transform: rotateY(360deg);
}

}

input[type="text"] {
	padding: 10px;
	font-size: 1.2em;
	border: none;
	border-radius: 5px;
	margin-bottom: 20px;
	width: 300px;
	max-width: 100%;
}

input[type="submit"] {
	padding: 10px 20px;
	font-size: 1.5em;
	border: none;
	border-radius: 10px;
	color: #FFFFFF; /* awesome font color */
	cursor: pointer;
	transition: transform 0.5s ease; /* 2D transform on hover */
}

input[type="submit"]:hover {
	transform: scale(1.1); /* 2D scale effect on hover */
}
</style>
</head>
<body>
	<h1>Employee Management System</h1>
	<h2 style="color: Black;">!! Update Employees Details !!</h2>
	<form action="${pageContext.request.contextPath}/update-employee" method="post">
	<input type="hidden" placeholder="Employee ID" name="eid" value="${emp.eid}">
	<br>
		<input type="text" placeholder="Employee Name" name="empName" value="${emp.empName}">
		<br> <input type="text" placeholder="Employee E-mail Address"
			name="empMail" value="${emp.empMail}"> <br> <input type="text"
			placeholder="Employee Contact No." name="empContactNumber" value="${emp.empContactNumber}">
		<br> <input style="background-color: green;" type="submit" value="Update">
	</form>
	<br>
	<form method="get" action="${pageContext.request.contextPath}/back">
		<input style="background-color: red;" type="submit" value="Back">
	</form>
</body>
</html>
