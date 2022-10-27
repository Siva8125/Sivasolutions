<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="java.util.List"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script type="text/javascript">
function callPopUpMethod(gender,dob){
	var w = window.open('', '', 'width=400,height=400,resizeable,scrollbars');
    w.document.write("Gender: "+gender +"\n"+"DOB:" +dob);
    w.document.close(); // needed for chrome and safari
}
</script>
<style>
.scroll1{
transform: rotateX(180deg);
margin-bottom: -160px;
}
.displaytable1{
overflow-y: auto;
    transform: rotateX(180deg);
    width:100%;
    }
</style>


<meta name="viewport" content="width=device-width, initial-scale=1">
 
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
	<link rel="stylesheet" media="all" href="stylesheets/mybootstrap.css"/> 
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>


<title>employee</title>
<style>
h1 {
	text-align: center;
}

h4 {
	animation: blinkingText 0.8s infinite;
}

@
keyframes blinkingText { 0%{
	color: Black;
}

50%{
color


:

 

red


;
}
99%{
color


:

 

black


;
}
100%{
color


:

 

Black


;
}
}
table {
	font-family: Constantia;
	font-
}

a {
	text-decoration: none;
}

input[type="text"] {
	border: None;
	border-bottom: 1px solid silver;
	background: transparent;
	outline: none;
	height: 30px;
	color: Black;
	font-size: 16px;
}

input[type="submit"] {
	background: blue;
	color: white;
	font-size: 20px;
	font-family: Constantia;
}

input[type="submit"]:hover {
	Color: Blue;
	background: White;
}

ul {
	margin: 0px;
	padding: 0px;
	list-style: none;
}

ul li {
	float: left;
	width: 200px;
	height: 40px;
	background-color: black;
	opacity: .8;
	text-align: center;
	line-height: 40px;
	margin-right: 2px;
}

ul li  {
	text-decoration: none;
	color: white;
	display: block;
}

ul li a:hover {
	background-color: Blue;
}

ul li ul li {
	display: none;
}

ul li:hover ul li {
	display: block;
}
}
</style>
 </head>
<body>
<%
		Object obj = request.getAttribute("SearchId");
		String userId = "";
		if (null != obj) {
			userId = (String) obj;
		}
	%>

<nav class="navbar navbar-inverse">
	<div class="container-fluid">
		<div class="navbar-header">
			<a class="navbar-link" href="openingIndexPage"><h2>Dhatsol IT Solutions</h2></a>
			
		</div>
		<ul class="nav navbar-nav navbar-right">
			<li class="active"><a href="openingIndexPage">Home</a></li> 
					<li class="active"><a href="openingAboutUs">AboutUs</a></li>
					<li class="active"><a href="openinguserPage">Logout</a></li>	
				
				<li><p align="right"><b>Login As:</b>
					<%=userId%></p></li>	
				</ul>

	</div>
	</nav>

	<div class="container">

  <center>
  <a href="openingUserUpdate" class="btn btn-info" role="button">UpdateProfile</a>
 <a href="openingPaySlip" class="btn btn-info" role="button">DownloadPayslip</a>
  <a href="openingCreateRequest" class="btn btn-info" role="button">CreateRequest</a></center>
 
			
 </div>
 
</body>
</html>
