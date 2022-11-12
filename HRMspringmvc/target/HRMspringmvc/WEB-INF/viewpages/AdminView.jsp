<%@page import="org.springframework.web.servlet.ModelAndView"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Dhatsol</title>

<link href="font-awesome-4.7.0/css/font-awesome.min.css"
	rel="stylesheet">
<link
	href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css"
	rel="stylesheet">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<link rel="stylesheet" media="all" href="stylesheets/animate.css" />
<script type="text/javascript">  
</script>

</head>
<body>

	<div id="nav">
		<h1>
			<a href="openingIndexPage">Dhatsol IT Solutions</a>
		</h1>

		<nav>
		<ul>
			<li><a href="openingIndexPage">Home</a></li>




			<div class="dropdown">
				<button class="dropbtn">
					Employee <em class="fa fa-caret-down" id="active"></em>
				</button>
				<div class="dropdown-content">
					<a href="openingEmployeeRegistration">New Registration</a> <a href="#">Response
						Approved</a> <a href="openingEmployeeViewDirection">Search Employee</a>


				</div>
			</div>
			<li><a href="openingUserUpdate">UPDATE Employee</a></li>

			<li><a href="openingAboutUs">about us</a></li>
		</ul>
	</div>

	</div>
	<div id="#mainform">


		<div class="container" style="background-image: url(blue.jpg)";>
			<center>
				<h1 style="color: red padding:50% margin-top:50% height:20%";>

				</h1>
				<hr>
				<br>
				<div class="panel panel-default"></div>
			</center>

			<h1>AdminView..</h1>
			<form action="LogOutServlet" method="post">
				<input type="submit" value="LogOut">
			</form>
			<%
Object obj=request.getAttribute("EmployeeId");
String userId="";
if(null != obj){
	userId=(String)obj;
	ModelAndView model = new ModelAndView();
	model.addObject("EmployeeId11", userId);
}
%>
			<div>
				<div>
					Login As:
					<%=userId %>
				</div>
			</div>
			<br> <br>
			<table border="5" bordercolor="red">
				<tr>
					<th><a href="openingUpdateProfile">Update Profile</a></th>
					<th><a href="openingPaySlip">Pay Slip</a></th>
					<th><a href="openingCreateRequest">CreateRequest</a></th>
				</tr>
			</table>

			</center>
</body>
</html>
