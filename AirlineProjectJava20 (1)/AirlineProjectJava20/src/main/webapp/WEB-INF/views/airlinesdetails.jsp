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
<%
Object obj = request.getAttribute("airlineresponse");
Object obj1 = request.getAttribute("airline");

if(obj==null){
	out.print("no flights available");
}else{
	List<Flightbean> list = (ArrayList<Flightbean>) obj;


%>
Available Flights of <%=obj1 %> are:
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

</tr>
</table>


<% } }%>
</body>
</html>