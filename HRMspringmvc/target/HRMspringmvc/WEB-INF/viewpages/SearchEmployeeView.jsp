<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="com.hrm.springmvc.entity.bean.EmployeeBean"%>
<%@page import="com.hrm.session.SharedObject"%>
<%@page import="java.util.List"%>
<%@page import="com.hrm.springmvc.entity.service.DaoServiceImplementation"%>
<%@page import="com.hrm.springmvc.entity.service.DaoService"%>
<%@page import="com.hrm.springmvc.entity.bean.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style>
.scroll1 {
	transform: rotateX(180deg);
	margin-bottom: -160px;
}

.displaytable1 {
	overflow-y: auto;
	transform: rotateX(180deg);
	width: 100%;
}

</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>employee</title>
<link rel="stylesheet"
href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
 <link rel="stylesheet" media="all" href="stylesheets/bootstrap.css"/>
<script
src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script
src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>

<script type="text/javascript" src="employeeValidation.js">
	
</script>
<script type="text/javascript">
	var request;
	function sendInfo() {
		var value = document.getElementById("searchEle").value;
		var url = "SingleEmployeeView.jsp?val=" + value;

		if (window.XMLHttpRequest) {
			request = new XMLHttpRequest();
		} else if (window.ActiveXObject) {
			request = new ActiveXObject("Microsoft.XMLHTTP");
		}

		try {
			request.onreadystatechange = getInfo;
			request.open("GET", url, true);
			request.send();
		} catch (e) {
			alert("Unable to connect to server");
		}
	}

	function getInfo() {
		if (request.readyState == 4) {
			var val = request.responseText;
			document.getElementById('result').innerHTML = val;
		}
	}
	function hideTable() {
		document.getElementById('resultTable').style.visibility = "hidden";
	}
</script>
</head>
<body>
	<%
		SharedObject.setSession(request.getSession());
	%>
	<nav class="navbar navbar-inverse">
	<div class="container-fluid">
		<div class="navbar-header">
			<h1>
				<a href="openingIndexPage">Dhatsol IT Solutions</a>
			</h1>
		</div>
		
		<div class="collapse navbar-collapse"
			id="bs-example-navbar-collapse-1">
			<br>

			<ul class="nav navbar-nav navbar-right">
				<li class="dropdown"><a href="#" data-toggle="dropdown"
					class="dropdown-toggle" id="active">Employee <b class="caret"></b></a>
					<ul class="dropdown-menu">
						<li><a href="openingEmployeeRegistration">New Registration</a></li>
						<li><a href="#">ResponseApproved</a></li>
						<li><a href="openingSearchEmployeeAjax">Search Employee</a></li>
					</ul></li>
				<li><a href="openingIndexPage">Home</a></li>
				<li><a href="openingLogin">Login</a></li>
				<li><a href="openingAboutUs">About Us</a></li>
			</ul>
		</div>
		
	</div>
	</nav>

	<div id="#mainform">

		<div class="container" style="background-color: #ddd";>
			<center>
				<h1 style="color: black";"padding:50%"; "margin-top:50%"; "height:20%";>

				</h1>
				<hr>
				<a href="openingSearchEmployeeView">Display All Employees Data</a> <br>
				<br> <br>
				<form action="openingSingleEmployeeView">
					Filter:<input type="text" name="searchElement" id="searchEle"
						onkeyup="return sendInfo()" onclick="hideTable()"
						placeholder="EmployeeId/Salary/EmailId">
				</form>
			</center>
			<div id="result"></div>

		</div>
	</div>

	<div class="container" id="resultTable" style="background-color: #ddd";>
		<center>
			<h1 style="padding: 50% margin-top:50% height:20%";></h1>
			<hr>

			<form>
				<div class="panel panel-default">
					<%
						DaoService service = new DaoServiceImplementation();
						List<EmployeeBean> employeeResponse = service.search();
						if (employeeResponse != null && !employeeResponse.isEmpty()) {
					%>

					<div class="table displaytable1">
						<div class="scroll1">
							<table align=center>

								<tr>
									<td id="header" colspan="24" align="center" class="bg-success"><h1>Display Information
											Of Employees</h1></td>
								</tr>
								<tr class="bg-success">
									<th>EmployeeId</th>
									<th>First Name</th>
									<th>Father Name</th>
									<th>Gender</th>
									<th>DOB</th>
									<th>Email Id</th>
									<th>Mobile No</th>
									<th>Aadhar No</th>
									<th>Permanent Address</th>
									<th>Local Address</th>
									<th>Board Of Secondary Education</th>
									<th>TenthPassedout</th>
									<th>Board Of Intermediate Education</th>
									<th>IntermediatePassedout</th>
									<th>Graduation Details</th>
									<th>Passedout</th>
									<th>Branch</th>
									<th>University</th>
									<th>Company Name</th>
									<th>Role</th>
									<th>Notice Period</th>
									<th>Location</th>
									<th>Experience</th>
									<th>Current CTC</th>
									<th>Excepted CTC</th>
								</tr>
								<%
									for (EmployeeBean employeeBean : employeeResponse) {
								%>
								<tr>
									<td><%=employeeBean.getEmployeeId()%></td>
									<td><%=employeeBean.getFirstName()%></td>
									<td><%=employeeBean.getFatherName()%></td>
									<td><%=employeeBean.getGender()%></td>
									<td><%=employeeBean.getDob()%></td>
									<td><%=employeeBean.getEmailId()%></td>
									<td><%=employeeBean.getMobileNumber()%></td>
									<td><%=employeeBean.getAadharNo()%></td>
									<td><%=employeeBean.getPermanentAddress()%></td>
									<td><%=employeeBean.getLocalAddress()%></td>
									<td><%=employeeBean.getSchoolName()%></td>
									<td><%=employeeBean.getTenthPassedOut()%></td>
									<td><%=employeeBean.getIntermediateCollegeName()%></td>
									<td><%=employeeBean.getInterPassedOut()%></td>
									<td><%=employeeBean.getGraduationDetails()%></td>
									<td><%=employeeBean.getGraduationPassedOut()%></td>
									<td><%=employeeBean.getBranch()%></td>
									<td><%=employeeBean.getUniversity()%></td>
									<td><%=employeeBean.getCompanyName()%></td>
									<td><%=employeeBean.getRole()%></td>
									<td><%=employeeBean.getLocation()%></td>
									<td><%=employeeBean.getExperience()%></td>
									<td><%=employeeBean.getCurrentCTC()%></td>
									

								</tr>
								<%
									}
								%>
							</table>
						</div>
						<br> <br> <br> <br> <br> <br> <br>
						<br> <br>

						<%
							} else {
								out.print("No Result Found");
							}
						%>
					</div>
				</div>
			</form>
		</center>
	</div>
</body>
</html>
