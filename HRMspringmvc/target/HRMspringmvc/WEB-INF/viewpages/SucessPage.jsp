<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
Object obj=request.getAttribute("employeeId");
if(obj!=null){
	String employeeId=(String)obj;
%>
	<nav class="navbar navbar-expand-sm bg-dark navbar-dark fixed-top">
	<div class="container">
		<a class="navbar-brand" href="openingIndexPage"> Dhatsol It Solutions</a>
		<button class="navbar-toggler" type="button" data-toggle="collapse"
			data-target="#navbarResponsive" aria-controls="navbarResponsive"
			aria-expanded="false" aria-label="Toggle navigation"></button>
	</div>
	</nav>

	<h1>
		Updated Successfully EmployeeId :<%= employeeId%> &nbsp;&nbsp; check once...</h1>
 
	
	<h1 style="color: green">
		Registered Successfully EmployeeId :<%=employeeId%></h1>

<%
}
%>
<%-- <jsp:include page="openingHomePage"></jsp:include> --%>
</body>
</html>