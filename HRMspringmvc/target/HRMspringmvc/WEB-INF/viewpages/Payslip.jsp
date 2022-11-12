<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
	<%@page import="java.util.List"%>
	<%@ page import="java.text.SimpleDateFormat" %>
<%@page import="java.util.Iterator"%>
<%@ page import = "java.io.*,java.util.*"%>
	
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
 <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
  <link rel="stylesheet" media="all" href="stylesheets/mybootstrap.css"/>
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
  
<title>EmployeePayslip</title>
<style>
div.headtext {
	margin-left: 25px;
	margin-right: 25px;
	align: center;
}

div.backgrouondColor {
	background-color: AliceBlue;
	margin-left: 25px;
	margin-right: 25px;
}

div.backgrouondColor1 {
	background-color: DimGrey;
	margin-left: 25px;
	margin-right: 25px;
}

p.alignleft {
	float: left;
}

p.alignright {
	float: right;
}

p.aligncenter {
	text-align: center;;
}

div.backgrouondColor2 {
	background-color: HoneyDew;
	margin-left: 25px;
	margin-right: 25px;
}

div.backgrouondColor3 {
	background-color: LightGray;
	margin-left: 25px;
	margin-right: 25px;
}

td.padding {
	padding-left: 2cm;
}

td.padding2 {
	padding-left: 45%;
}

td.padding3 {
	padding-left: 366%;
}

td.padding4 {
	padding-left: 30%;
}

td.padding5 {
	padding-left: 190%;
}

td.padding0 {
	padding-left: 20cm;
}

p.parapadding {
	padding-left: 2cm;
}

div.imgpadding {
	padding-left: 17cm;
}

td.padding6 {
	padding-left: 12.2cm;
	color: white;
	font-size: 20px;
}

td.padding7 {
	font-size: 20px;
	color: white;
}
page {  
  width: 21cm;
  height: 29.7cm; 
  border-style: solid;
  border-width: 5px; 
}

</style>
</head>
<body>
<form:form modelAttribute="paySlipObj" action="PaySlipFormRequest">

<div class = "page">
	<div class="imgpadding">
		<img src="logo.png" alt="logo" width="210" height="100" align="center">
	</div>

	<div class="headtext" id="date">
		<table>
			<tr>
<td align="right">Payslip for the month of: <%= new SimpleDateFormat("dd-MM-yyyy").format(new java.util.Date())%></td>
 
				<td class="padding0">No.of working Days:31</td>
			</tr>
		</table>

	</div>
	<div class="backgrouondColor">
		<table>
			<tr>
				<td><br>EmpName:<br>
				<br></td>
				<br>
				<br>
				<td><input type="text" name="employeeName" <%-- value=<%=name %> --%>>
				<td class="padding2">EmpID:<br></td>
				<td class="padding2"><input type="text" name="employeeId" <%-- value=<%=userId %> --%>>
			</tr>
			<tr>
				<td>Designation:<br>
				<br></td>
				<td><input type="text" name="employeeDesignation" <%-- value=<%=role %> --%>>
				<td class="padding2">Bank:<br></td>
				<td class="padding2"><input type="text" name="bank">
			</tr>
			<tr>
				<td><br>Date of Joining:<br>
				<br></td>
				<td><input type="date" name="doj" <%-- value=<%=ctc%> --%>>
				<td class="padding2">BankAccountNo:<br></td>
				<td class="padding2"><input type="text" name="bankAccountno">
			</tr>
		</table>
	</div>
	<div class="backgrouondColor1">
		<table>
			<tr>
				<td class="padding7">Earnings</td>
				<br>
				<td class="padding6">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Deductions</td>
			</tr>
		</table>
	</div>

	<div class="backgrouondColor2">
		<table>
		<tr>
		<td><br>Basic Salary:<br>
				<br></td>
				<td><input type="text" name="basicSalary" ></td>		
		</tr>
		

		</table>
	</div>

	<div>
		<p class="parapadding">
			@as applicable based on savings declaration by employee.<br>

			*MedicalReimbursement, CityCompensatory& Income Tax have not been
			deducted as per the request of the employee.
		</p>

		<p class="parapadding">
			If any questions, mail to accounts@dhatriinfo.com <br> Note:
			This is system generated mail.Signature not required.
		</p>
		
		<center>
				<input type="submit" class="btn-btn-primary" value="Generate" />

			</center>
			<br>
			<br>
	</div>
</form:form>
	<footer>
	<p class="aligncenter">DHATRI INFO SOLUTIONS PVT.LTD.</p>
	<p style="padding-left :2cm;">_______________________________________________________________________________________________________________________________________________________________________________________</p>
	<p class="aligncenter">
		Manjeera Trinity Corporate, Suite #406, KPHB Phase 3, Kukatpally,
		Hyderabad: 500 072, Telangana, India<br> Phone: +91 40 6591 3555,
		6555 7888 website: <a href="www.dhatriinfo.com">
			www.dhatriinfo.com</a>.
	</p>
	</footer>
	
</body>

</html>