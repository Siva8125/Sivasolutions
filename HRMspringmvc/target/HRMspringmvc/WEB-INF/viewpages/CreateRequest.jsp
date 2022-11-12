<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
 pageEncoding="ISO-8859-1"%>
 <%@page import="com.hrm.springmvc.controller.ModuleController"%>
 <%@page import="com.hrm.springmvc.entity.dao.DaoImplementation"%>
<%@page import="com.hrm.springmvc.entity.bean.RequestBean"%>
 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Dhatsol</title>
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
 
<meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
<script type="text/javascript" src="jsFiles\dropDownAjax.js">
</script>
<style>
#reason{
height:30px;
width:180px;
}
#textArea{
width:280px;
height:60px;
}
</style>
<style>
  span {
    display: inline-block;
    width: 600px;
    height: 500px;
    margin: 6px;
    background-color: lightblue;
  }
  </style>

</head>
<body>
 
<%
		Object obj = SharedObject
				.getFromSession(EmployeeConstants.EMPLOYEE_ID);
		String userId = "";
		if (null != obj) {
			userId = (String) obj;
		}
		DaoImplementation hrmserv=new DaoImplementation();
		EmployeeBean empEmail=hrmserv.searchLoggerEmail(userId);
		String IdEmail=empEmail.getEmailId();
		SharedObject.putInToSession("LoginMailId",IdEmail);
			
	%>

<%SharedObject.setSession(request.getSession()); %>


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
  
  <a href="openingUserUpdate" class="btn btn-info" role="button">UpdateProfile</a>
  <a href="openingPaySlip" class="btn btn-info" role="button">DownloadPayslip</a>
  <a href="openingCreateRequest" class="btn btn-info" role="button">CreateRequest</a>
  
  </div>
 <div id="#mainform">
  <br> <br>

  <div align="center" class="container">
   <br> <br>
   <span class="rounded-lg">
<div class="loginbox">
<br> <br>
   <form action="CreateRequestServlet" method="post">
<div class=emailTo>
<div id="EmailTo"> Email To: <select id="emailTo" name="emailTo" onchange="getManagerList(this.value)">
<option>Select manager</option>
<option value="Project Manager">Projectmanager</option>
<option value="HR Manager">HrManager</option>
<option value="Admin">Admin</option>
</select> <br>
</div><br>
<div id="managerOptions">
Manager : <select>
<option>Select name</option>
</select>
</div><br>
ReasonId:
<input type="text" id="reasonId" name="reasonId"><br><br>
Reason: <textarea type="text" name="reason" id="reason" onkeydown="reason(this.value)">
</textarea>
<br><br>
TextArea: <textarea type="text" rows="5" name="textArea" id="textArea" placeholder="Enter text here..." onkeydown="reason(this.value)">
</textarea>
<br><br>
<button>Send</button>
<button>Cancel</button>
  </div>
 </div>
</div>
</form>
</span>
</body>
</html>