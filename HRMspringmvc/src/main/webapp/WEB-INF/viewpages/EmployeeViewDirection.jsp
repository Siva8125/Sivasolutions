<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@page import="java.util.List"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link href="font-awesome-4.7.0/css/font-awesome.min.css"
	rel="stylesheet">
<link
	href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css"
	rel="stylesheet">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<link rel="stylesheet" media="all" href="stylesheets/animate.css" />
<script type="text/javascript" src="employeeValidation.js">
	
</script>
<script type="text/javascript" src="jsFiles/searchAjax.js"></script>
<style>
table, th, td {
	border: 1px solid black;
}
</style>

</head>
<body>

	<div id="nav">
		<h1>
			<a href="openingIndexPage">Dhatsol IT Solutions</a>
		</h1>


		<ul>
			<li><a href="openingIndexPage">Home</a></li>
			<li><a href="openingLoginPage">Login</a></li>



			<div class="dropdown">
				<button class="dropbtn">
					Employee <em class="fa fa-caret-down" id="active"></em>
				</button>
				<div class="dropdown-content">
					<a href="openingEmployeeRegistration">New Registration</a> <a
						href="#">Response Approved</a> <a
						href="openingEmployeeViewDirection">Search Employee</a> <a
						href="openingLoginPage">Login</a>

				</div>
			</div>

			<li><a href="openingAboutUs">about us</a></li>
		</ul>
	</div>

	<div id="#mainform">
		<br> <br>

		<div class="container" style="background-color: #ddd";>
			<center>
				<h1 style="color: black";"padding:50%"; "margin-top:50%"; "height:20%";>

				</h1>
				<hr>




				<a href="openingEmployeeView">Display All Employees Data</a> <br>
				<br> <br> <br>
				<form:form action="openingSingleEmployeeView">

					EnterEmployeeId:<input type="text" name="employeeId" id="empId"
						style="color: black";> <input type="submit" value="submit"
						onclick="sendInfo()">
					<div id="searchResults"></div>
				</form:form>
			</center>
		</div>
	</div>
</body>
</html>
