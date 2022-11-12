<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="java.util.*"%>
<%@page import="com.spring.web.mvc.AirlineProjectJava20.bean.Flightbean"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form>
	<%
	Object obj = request.getAttribute("flightresponse");
	if (obj == null) {
		out.print("no flights available");
	} else {
		Collection<Flightbean> list = (Collection<Flightbean>) obj;
	%>
	<br> Available Flights are:
	<br>
	<%
	for (Flightbean f : list) {
	%>
   
	<table>

		<tr>
			<th>Fromcity:</th>
			<th>Tocity:</th>
			<th>Flightname:</th>
			<th>airlines:</th>
			<th>price:</th>
		</tr>

		<tr>
			<td><%=f.getFromcity()%></td>
			<td><%=f.getTocity()%></td>
			<td><%=f.getFlightname()%></td>
			<td><%=f.getAirlines()%></td>
			<td><%=f.getPrice()%></td>
			<td><button>
					<a href="TicketDetailsEntry">Book</a>
				</button></td>
</tr>
</table>


<% } }
%>
</form>
			</body>
</html>