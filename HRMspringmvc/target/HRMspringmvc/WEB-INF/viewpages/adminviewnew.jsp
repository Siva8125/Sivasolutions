<%@page import="com.hrm.springmvc.entity.bean.EmployeeBean"%>
<%@page import="java.util.List"%>
<%@page import="org.springframework.web.servlet.ModelAndView"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Dhatsol</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
<script type="text/javascript">
	
</script>

<style>
th {
	background-color: white;
}
</style>

</head>
<body class="container" style="background-image: url(adminmage.jpg)";>
	<%

		Object obj = request.getAttribute("EmployeeId");
		String adminid = "";
		if (null != obj) {
			adminid = (String) obj;
		}
	%>

	<nav class="navbar navbar-expand-sm bg-light justify">
	<table>
		<tr>
			<h1>
				<ul href="openingIndexPage" style="color: white">Dhatsol It
					Solutions
				</ul>
			</h1>
			<th style="font-size: 20px">Login As: <%=adminid%></th>
		</tr>

		<div align="right">

			<form action="AdminLogOutServlet">
				<input type="submit" class="btn btn-danger" value="LogOut">
			</form>
		</div>
	</table>
	</nav>

	<div id="#mainform">

		<div class="center">

			<center>
				<h1 style="color: white">AdminView..</h1>

				<div></div>
				<br> <br>
				<table>
					<tr>

						<td><a href="openingUpdateProfile?<%=adminid %>" class="btn btn-danger"
							style="margin-right: 16px">Update Profile</a></td>

						<td><a href="openingPaySlip" class="btn btn-danger"
							style="margin-right: 16px">Pay Slip</a></td>
						<td><a href="openingCreateRequest" class="btn btn-danger" style="margin-right: 16px">CreateRequest</a></td>
						<td><a href="openingEmployeeRegistration" class="btn btn-danger">Employee Registration</a></td>
					</tr>
				</table>

			</center>
		</div>
	</div>
</body>
</html>
