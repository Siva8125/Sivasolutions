<%@page import="com.hrm.springmvc.entity.bean.EmployeeBean"%>
<%@page import="com.hrm.springmvc.entity.service.DaoServiceImplementation"%>
<%@page import="com.hrm.springmvc.entity.service.DaoService"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@page import="java.util.List"%>
<%@page import="java.util.Iterator"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Display title here</title>
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
<style>
</style>

</head>
<body>

	<div id="nav">
		<h1>
			<a href="openingIndexPage">Dhatsol IT Solutions</a>
		</h1>

		<ul>
			<li><a href="openingIndexPage">Home</a></li>
			<li><a href="openingUser">LogOut</a></li>

			<div class="dropdown">
				<button class="dropbtn">
					Employee <i class="fa fa-caret-down" id="active"></i>
				</button>
				<div class="dropdown-content">
					<a href="openingEmployeeRegistration">New Registration</a> <a href="#">Response
						Approved</a> <a href="openingEmployeeViewDirection">Search Employee</a> <a
						href="openingUser">LogOut</a>
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
				<div class="panel panel-default">

					<h1 style="color: #33847c;">Employee Details</h1>
					<%!int count = 0;%>
					<% 
						Object obj = request.getAttribute("userId1");
						String emp=(String)obj;
					 %>

					<%

						Object obj1 = request.getAttribute("listOff");
						List<EmployeeBean> list = (List<EmployeeBean>) obj1;
						if(list != null){
						Iterator<EmployeeBean> itr = list.iterator();
						while(itr.hasNext()){       
						
						EmployeeBean bean=itr.next();
						String s1=bean.getEmployeeId();
							
						if (s1.equals(emp)) {
							count=1;
					%>

					<div class="table">
					<form:form modelAttribute="updateDetails" action="UpdateFormDetails">
							<table align="center">
								
								<tr>
									<td>Employee Id:</td>
									<td><input type="text" id="employeeId" name="employeeId" value="<%=bean.getEmployeeId()%>" /></td>
								</tr>
								<tr>
									<td>First Name:</td>
									<td><input type="text" id="firstName" name="firstName" value="<%=bean.getFirstName()%>" /></td>
								</tr>
								<tr>
									<td>Last Name:</td>
									<td><input type="text" id="lastName" name="lastName" value="<%=bean.getLastName()%>" /></td>
								</tr>
								<tr>
									<td>Father Name:</td>
									<td><input type="text" id="fatherName" name="fatherName" value="<%=bean.getFatherName()%>" /></td>
								</tr>
								<tr>
									<td>Gender:</td>
									<td><input type="text" id="gender" name="gender" value="<%=bean.getGender()%>" /></td>
								</tr>
								<tr>
									<td>Date Of Birth:</td>
									<td><input type="text" id="dob" name="dob" value="<%=bean.getDob()%>" /></td>
								</tr>
								<tr>
									<td>Email Id:</td>
									<td><input type="text" id="emailId" name="emailId" value="<%=bean.getEmailId()%>" /></td>
								</tr>
								<tr>
									<td>Mobile No:</td>
									<td><input type="text" id="mobileNumber" name="mobileNumber"
										value="<%=bean.getMobileNumber()%>" /></td>
								</tr>
								<tr>
									<td>Alternate MobileNumber:</td>
									<td><input type="text" id="alternateMobileNumber" name="alternateMobileNumber" value="<%=bean.getAlternateMobileNumber()%>" /></td>
								</tr>
								<tr>
									<td>Aadhar No:</td>
									<td><input type="text" id="aadharNo" name="aadharNo" value="<%=bean.getAadharNo()%> " /></td>
								</tr>
								<tr>
									<td>PAN Number:</td>
									<td><input type="text" id="panNumber" name="panNumber" value="<%=bean.getPanNumber() %>">
								</tr>
								<tr>
									<td>PassPort Number:</td>
									<td><input type="text" id="passportNumber" name="passportNumber" value="<%=bean.getPassportNumber() %>"></td>
								</tr>
								<tr>
									<td>Permanent Address:</td>
									<td><input type="text" id="permanentAddress" name="permanentAddress"
										value="<%=bean.getPermanentAddress()%>" /></td>
								</tr>
								<tr>
									<td>Local Address:</td>
									<td><input type="text" id="localAddress" name="localAddress" value="<%=bean.getLocalAddress()%>" /></td>
								</tr>

								<tr>
									<td>Board Of Secondary Education:</td>
									<td><input type="text" id="schoolName" name="schoolName" value="<%=bean.getSchoolName()%>" /></td>
								</tr>
								<tr>
									<td>TenthPassedOut:</td>
									<td><input type="text" id="tenthPassedOut" name="tenthPassedOut"
										value="<%=bean.getTenthPassedOut()%>" /></td>
								</tr>
								<tr>
									<td>Board Of Intermediate Education:</td>
									<td><input type="text" id="intermediateCollegeName" name="intermediateCollegeName"
										value="<%=bean.getIntermediateCollegeName()%>" /></td>
								</tr>
								<tr>
									<td>InterPassedOut:</td>
									<td><input type="text" id="interPassedOut" name="interPassedOut"
										value="<%=bean.getInterPassedOut()%> " /></td>
								</tr>
								<tr>
									<td>Graduation Details:</td>
									<td><input type="text" id="graduationDetails" name="graduationDetails"
										value="<%=bean.getGraduationDetails()%>" /></td>
								</tr>
								<tr>
									<td>GraduationPassedOut:</td>
									<td><input type="text" id="graduationPassedOut" name="graduationPassedOut"
										value="<%=bean.getGraduationPassedOut()%>" /></td>
								</tr>
								<tr>
									<td>Branch:</td>
									<td><input type="text" id="branch" name="branch" value="<%=bean.getBranch()%>" /></td>
								</tr>
								<tr>
									<td>University:</td>
									<td><input type="text" id="university" name="university" value="<%=bean.getUniversity()%>" /></td>
								</tr>
								<tr>
									<td>CompanyName:</td>
									<td><input type="text" id="companyName" name="companyName"
										value="<%=bean.getCompanyName()%>" /></td>
								</tr>
								<tr>
									<td>Role:</td>
									<td><input type="text" id="role" name="role" value="<%=bean.getRole()%>" /></td>
								</tr>
								<tr>
									<td>Location:</td>
									<td><input type="text" id="location" name="location" value="<%=bean.getLocation()%>" /></td>
								</tr>
								<tr>
									<td>Experience:</td>
									<td><input type="text" id="experience" name="experience" value="<%=bean.getExperience()%>" /></td>
								</tr>
								<tr>
									<td>CurrentCTC:</td>
									<td><input type="text" id="currentCTC" name="currentCTC" value="<%=bean.getCurrentCTC()%>" /></td>
								</tr>
								<tr>
									<td>Bank Name:</td>
									<td><input type="text" id="bankname" name="bankname" value="<%=bean.getBankname() %>"></td>
								</tr>
								<tr>
									<td>Bank Account No:</td>
									<td><input type="text" id="bankAccNo" name="bankAccNo" value="<%=bean.getBankAccNo() %>"></td>
								</tr>
								<tr>
									<td>IFSC Code:</td>
									<td><input type="text" id="ifscCode" name="ifscCode" value="<%=bean.getIfscCode() %>"></td>
								</tr>

							</table>
							<br></br> <br> <input type=submit
								onclick="window.location='http://localhost:8080/DhatriHRM_Web/EmployeeViewDirection.jsp';"
								value="Back" class="button">
								<input type="submit" value="Update" class="button">

					</form:form>
						<hr>
						<% }
						}
		} %>
						<%
		if(count==0){
			%>
						<h1 style="color: red;">Please Enter valid EmployeeId or
							Employee Name</h1>

						<% }else{count=0;} %>
		

					</div>
			</center>
		</div>
		</div>
		
</body>
</html>