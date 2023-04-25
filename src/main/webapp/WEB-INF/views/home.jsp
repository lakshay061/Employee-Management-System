<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Employee Management System</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.0/css/all.min.css" integrity="sha512-iecdLmaskl7CVkqkXNQ/ZH/XLlvWZOJyj7Yy7tcenmpD1ypASozpmT/E0iPtmFIB46ZmdtAc9eNBvH0H/ZpiBw==" crossorigin="anonymous" referrerpolicy="no-referrer" />
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.4/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
<style>



.table
{
	margin: auto;
	width: 60%;
}

.table thead th {
	text-align: center;
	background-color: #333;
	color: #fff;
}

.table tbody td {
	text-align: center;
}

.center {
	display: flex;
	justify-content: center;
	align-items: center;
	height: 13vh;
}

.button {
	padding: 10px 20px;
	font-size: 1.1 em;
	border: none;
	border-radius: 10px;
	background-color: #28a745; /* primary green success */
	color: #FFFFFF;
	cursor: pointer;
	transition: transform 0.5s ease;
}

.button:hover {
	transform: scale(1.1);
}

.fa-trash {
		font-size: 2em;
		color: red;
		cursor: pointer;
	}
.fa-trash:hover {
		animation: bounce 0.5s ease infinite;
	}
.fa-pen-nib {
		font-size: 2em;
		color: blue;
		cursor: pointer;
	}
.fa-pen-nib:hover {
		animation: bounce 0.5s ease infinite;
	}
@keyframes bounce {
		0% { transform: translateY(0); }
		50% { transform: translateY(-10px); }
		100% { transform: translateY(0); }
	}
		
</style>
</head>
<body>
	<h1 style="text-align: center;">Employee Management System</h1>
	<br>
	<table class="table">
		<thead class="thead-dark">
			<tr>
				<th scope="col">Employee ID</th>
				<th scope="col">Employee Name</th>
				<th scope="col">Employee Email Address</th>
				<th scope="col">Employee Contact Number</th>
				<th scope="col">Actions</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${emp}" var="e">
				<tr>
					<th scope="row">EMS-2023-${e.eid}</th>
					<td>${e.empName}</td>
					<td>${e.empMail}</td>
					<td>${e.empContactNumber}</td>
					<td>
					<a href="update-employee/${e.eid}"><i class="fa-solid fa-pen-nib fa-md"></i></a>&nbsp&nbsp
					<a href="delete-employee/${e.eid}"><i class="fa-solid fa-trash fa-md"></i></a>
					</td>
				</tr>
			</c:forEach>

		</tbody>
	</table>
	<div class="center">
		<a href="add-employee"><button class="button">Add More Employees</button></a>
	</div>
</body>
</html>