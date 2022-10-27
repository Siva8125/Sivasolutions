<%@page import="com.hrm.spring.entity.bean.EmployeeBean"%>
<%@page import="com.hrm.spring.entity.services.HRMServiceImplementation"%>
<%@page import="com.hrm.spring.entity.services.HRMService"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@page import="java.util.List"%>
<%@page import="java.util.Date"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.text.DateFormat"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Calendar"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<script type="text/javascript" src="userupdatevalidation.js"></script>

<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>

<title>userupdate</title>
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

ul li {
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
				Object obj = request.getAttribute("employeeIdObj");
				String userId = "";
				if (null != obj) {
					userId = (String) obj;
				}
				Object object = request.getAttribute("employeeIdObj");

		List<EmployeeBean> b = (List<EmployeeBean>) object;
				EmployeeBean bean = null;
				if(null!=b){
				bean=b.get(0);
		
			%>

<nav class="navbar navbar-inverse">
	<div class="container-fluid">
		<div class="navbar-header">
			<a class="navbar-link" href="openingIndexPage"><h2>Dhatsol IT Solutions</h2></a>
			
		</div>
		<ul class="nav navbar-nav navbar-right">
			<li class="active"><a href="openingIndexPage">Home</a></li> 
					<li class="active"><a href="openingAboutUs">AboutUs</a></li>
					<li class="active"><a href="openingUser">Logout</a></li>	
					
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
	<center>
		<form:form modelAttribute="UpdateServlet" action="UpdateFormDetails">
			<H4>Update Your Profile Here</H4>
			<a name="top"> </a>
			
			
			
			<h1>Personal Informaion</h1>
			<table>
				<tr>
					<td>Employee Id</td> ${empid}
					<td><input type="text" name="empid"
						value="<%=userId %>"></td>
				</tr>
				<tr>
					<td>FirstName:*</td>
					<td><input type="text" onkeypress="clearForm()"
						name="Firstname" id="Firstname" value="<%=bean.getFirstName()%>"></td>
					<td><p id="errorMsg" style="color: red;"></p></td>
				</tr>

					<tr>
						<td>LastName:*</td>
						<td><input type="text" onkeypress="clearForm()"
							name="lastname" id="Lastname" value="<%=bean.getLastName()%>"></td>
						<td><p id="errorMsg1" style="color: red;"></p></td>
					</tr>
					<tr>
						<td>FatherName:*</td>
						<td><input type="text" onkeypress="clearForm()"
							name="fathername" id="Fathername"
							value="<%=bean.getFatherName()%>"></td>
						<td><p id="errorMsg1" style="color: red;"></p></td>
					</tr>
					
					
					<tr>
						<td>Gender:*</td>
						<td><input type="text" onkeypress="clearForm()"
							name="Gender" id="Gender" value="<%=bean.getGender()%>">
						<td><p id="errorMsg4" style="color: red;"></p></td>
					

					</tr>

					<tr>
						<td>Date Of Birthday:*</td>
						<td><input type="text" onkeypress="clearForm()" name="dob"
							id="dob" value="<%=bean.getDob()%>"></td>
						<td><p id="errorMsg	5" style="color: red;"></p></td>
					</tr>
					<tr>
						<td>Email Id:*</td>
						<td><input type="email"
							pattern="[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,3}$"
							onkeypress="clearForm()" name="EmailId" id="EmailId"
							value=<%=bean.getEmailId()%>></td>
						<td><p id="errorMsg6" style="color: red;"></p></td>
					</tr>
					<tr>
						<td>mobile Number:*</td>
						<td><input type="text" text-align:right; pattern="[0-9]{10}"
							title="Mobile number must be 10 digits" onkeypress="clearForm()"
							name="mobileNumber" id="mobileNumber"
							value=<%=bean.getMobileNumber()%>></td>
						<td><p id="errorMsg3" style="color: red;"></p></td>
					</tr>
					<tr>
						<td>Alternate MobileNumber:*</td>
						<td><input type="text" text-align:right; pattern="[0-9]{10}"
							title="Alternate MobileNumber must be 10 digits" onkeypress="clearForm()"
							name="Alternate MobileNumber" id="AlternateMobileNumber"
							value=<%=bean.getAlternateMobileNumber()%>></td>
						<td><p id="errorMsg3" style="color: red;"></p></td>
					</tr>
					<tr>
						<td>AdharcardNumber:*</td>
						<td><input type="text" pattern="[0-9]{12}"
							title="Aadhar Card Number must be 12 digits"
							onkeypress="clearForm()" name="Adharno" id="AdharcardNumber"
							value=<%=bean.getAadharNo()%>></td>
						<td><p id="errorMsg9" style="color: red;"></p></td>
						
					</tr>
					<tr>
						<td>PanNumber:*</td>
						<td><input type="text" text-align:right; pattern="[0-9]{10}"
							title="PanNumber must be 10 digits" onkeypress="clearForm()"
							name="panNumber" id="panNumber"
							value=<%=bean.getPanNumber()%>></td>
						<td><p id="errorMsg3" style="color: red;"></p></td>
					</tr>
					
					<tr>
						<td>PassportNumber:*</td>
						<td><input type="text" text-align:right; pattern="[0-9]{8}"
							title="passportNumber must be 8 digits" onkeypress="clearForm()"
							name="passportNumber" id="passportNumber"
							value=<%=bean.getPassportNumber()%>></td>
						<td><p id="errorMsg3" style="color: red;"></p></td>
					</tr>
					

					<tr>
						<td>PermanentaAddress:*</td>
						<td><textarea rows="2" onkeypress="clearForm()"
								name="PermanentAddress" id="PermanentaAddress"><%=bean.getPermanentAddress()%></td>
</textarea></td>
						<td><p id="errorMsg7" style="color: red;"></p></td>
						

					</tr>
					<tr>
						<td>localAdress:*</td>
						<td><textarea rows="2" onkeypress="clearForm()"
								name="LocalAdress" id="LocalAdress"><%=bean.getLocalAddress()%>
</textarea></td>
						<td><p id="errorMsg8" style="color: red;"></p></td>
					</tr>

				</table>
				<h2>Educational Information</h2>
				<br> <br>
				<table>
					<tr>
						<td>Board Of Secondary Education*:</td>
						<td><input type=text name="schoolName"
							onkeypress="clearForm()" id="schoolName"
							value=<%=bean.getSchoolName()%>><br> <br></td>
						<td><p id="errorMsg10" style="color: red;"></p></td>

						<td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Passedout*:</td>

						<td><input type=text name="tenthPassedOut"
							onkeypress="clearForm()" id="tenthPassedOut"
							value=<%=bean.getTenthPassedOut()%>></td>
						<td><p id="errorMsg11" style="color: red;"></p></td>

					</tr>
					<tr>
						<td>Board Of Intermediate Education*:</td>
						<td><input type=text name="intermediateCollegeName"
							onkeypress="clearForm()" id="intermediateCollegeName"
							value=<%=bean.getIntermediateCollegeName()%>><br> <br></td>
						<td><p id="errorMsg12" style="color: red;"></p></td>

						<td>&nbsp;&nbsp;&nbsp;&nbsp;Passedout*:</td>
						<td><input type=text name="interPassedOut"
							onkeypress="clearForm()" id="interPassedOut"
							value=<%=bean.getInterPassedOut()%>></td>
						<td><p id="errorMsg13" style="color: red;"></p></td>

					</tr>
					<tr>

						<td>Graduation Details*:</td>
						<td><input type="text" name="graduationDetails" value=<%=bean.getGraduationDetails()%>
							disabled="disabled"></td>
						<td><p id="errorMsg14" style="color: red;"></p></td>

						<td>&nbsp;&nbsp;&nbsp;&nbsp;Passedout*:</td>
						<td><input type=text name="graduationPassedOut"
							onkeypress="clearForm()" id="graduationPassedOut"
							value=<%=bean.getGraduationPassedOut()%>></td>
						<td><p id="errorMsg15" style="color: red;"></p></td>

					</tr>
					<tr>
						<td>Branch*:</td>
						<td><input type="text" name="branch" value=<%=bean.getBranch()%>></td>
						<td><p id="errorMsg16" style="color: red;"></p></td>

						<td>&nbsp;&nbsp;&nbsp;&nbsp;University*:</td>
						<td><input type=text name="university"
							onkeypress="clearForm()" id="university"
							value=<%=bean.getUniversity()%>></td>
						<td><p id="errorMsg17" style="color: red;"></p></td>

					</tr>
				</table>
				<table>

					<br>
					<h3>Job Experience Information:</h3>
					<br>
					<br>
					<tr>
						<td>Company Name:</td>
						<td><input type=text name="companyName"
							onkeypress="clearForm()" id="companyName"
							value=<%=bean.getCompanyName()%>><br> <br></td>
						<td><p id="errorMsg18" style="color: red;"></p></td>
					</tr>
					<tr>
						<td>Role:</td>
						<td><input type=text name="role"
							onkeypress="clearForm()" id="role"
							value=<%=bean.getRole()%>><br> <br></td>
						<td><p id="errorMsg18" style="color: red;"></p></td>
					</tr>
					<tr>
						<td>Location:</td>
						<td><input type=text name="location" onkeypress="clearForm()"
							id="location" value=<%=bean.getLocation()%>><br> <br></td>
						<td><p id="errorMsg21" style="color: red;"></p></td>
					</tr>
					<tr>
						<td>Experience:</td>
						<td><input type=text name="experience"
							onkeypress="clearForm()" id="experience"
							value=<%=bean.getExperience()%>><br> <br></td>
						<td><p id="errorMsg22" style="color: red;"></p></td>
					</tr>
					<tr>
						<td>Current CTC:</td>
						<td><input type=text name="currentCTC"
							onkeypress="clearForm()" id="currentCTC"
							value="<%=bean.getCurrentCTC()%>"><br> <br></td>
						<td><p id="errorMsg23" style="color: red;"></p></td>

					</tr>
					<tr>
						<td>Bank Name:</td>
						<td><input type=text name="bankname" onkeypress="clearForm()"
							id="bankname" value=<%=bean.getBankname()%>><br> <br></td>
						<td><p id="errorMsg24" style="color: red;"></p></td>

					</tr>
					<tr>
						<td>Bank AccountNumber:</td>
						<td><input type=text name="bankAccno"
							onkeypress="clearForm()" id="bankAccno"
							value=<%=bean.getBankAccNo()%>><br> <br></td>
						<td><p id="errorMsg24" style="color: red;"></p></td>

					</tr>
					<tr>
						<td>IFSC CODE:</td>
						<td><input type=text name="ifscCode" onkeypress="clearForm()"
							id="ifscCode" value=<%=bean.getIfscCode()%>><br> <br></td>
						<td><p id="errorMsg24" style="color: red;"></p></td>

					</tr>

				</table>
				<br>
				<center>
					<input type=submit onclick="return  userupdatevalidation()"
						value="update" class="button">
				</center>
				<p style="text-decoration: none; color: black; text-align: right;">
					<a href="#top"> Scroll top </a>
				</p>
		</form:form>
	</center>
	<%
		}
	%>
</body>
</html>