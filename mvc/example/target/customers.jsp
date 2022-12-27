<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor="lightblue">
	<h1>Add New Costumer</h1>
	<form action="customers" method="post">
		PolicyNumber:<input type="text" name="PolicyNumber">
		Fullname:<input type="text" name="Fullname"> Age:<input
			type="text" name="Age"> Policyamount:<input type="text"
			name="Policyamount"> Tenure:<input type="number"
			name="Tenure"> Percentage:<input type="number"
			name="Percentage"> <input type="submit" name="Submit">
	</form>
	<h1>Search Costumers Data</h1>
	<form action="searchdetails" method="get">
		Enter PolicyNumber:<input type="number" name="PolicyNumber">
		<input type="submit" name="Search">
	</form>
	<h1>Search All Costumers Data</h1>
	<form action="fetchdetails" method="get">
		<input type="submit" name="Search">
	</form>
	<h1>Delete Costumers Data</h1>
	<form action="deletedata" method="post">
	PolicyNumber:<input type="text" name="PolicyNumber">
		<input type="submit" name="Search">
	</form>
</body>
</html>