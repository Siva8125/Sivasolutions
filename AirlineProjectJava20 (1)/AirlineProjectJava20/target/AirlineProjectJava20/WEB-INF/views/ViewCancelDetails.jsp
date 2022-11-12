<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@page import="java.util.*"%>
    <%@page import="com.spring.web.mvc.AirlineProjectJava20.bean.Ticketbookingbean"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<style type="text/css">
ul {
	list-style-type: none;
	margin: auto;
	padding: 0;
	overflow: hidden;
	background-color: #333;
	Width: 100%;
	position: auto;
}

li {
	float: right;
	border-left: 1px solid #bbb;
}

li[class="main"] {
	float: left;
	margin-left: 400px;
	color: white;
	border-left: none;
	font-size: 30px;
	margin-top: 6px;
}

li[class="logo"] {
	height: 45px;
	background:
		url('https://thumbs.dreamstime.com/z/v-letter-logo-wings-shadow-simple-vector-logo-v-letter-logo-wings-shadow-191135064.jpg');
	background-repeat: no-repeat;
	background-size: cover;
	float: left;
	width: 50px;
	font-size: 0px;
}

li a {
	display: block;
	color: white;
	text-align: center;
	padding: 14px 16px;
	text-decoration: none;
}

li a:hover {
	background-color: #111;
}

li a[class="logo1"]:hover {
	background: none;
}
</style>
</head>
<body>
<ul>
<li class="logo"><a class="logo1" href="homepageopening">hi</a></li>
<li class="main">VTALENT FLIGHT BOOKING</li>
<li><a href="homepageopening">Logout</a></li>
<li><a href="aboutuspageopening">Tickets Booked</a></li>
<li><a class="active" href="homepageopening">Home</a></li>
   <li><a href="aboutuspageopening">Profile</a></li>
</ul>
<br>
<%
Object obj = request.getAttribute("ticketcancel");

if(obj==null){
	out.print("no details available");
}else{
	List<Ticketbookingbean> list = (ArrayList<Ticketbookingbean>) obj;


%>
<%
		for (Ticketbookingbean f : list) {
		%>


Cancelled Ticket Details are:
<table>

<tr>
<th>Ticket No:</th>
<th>Name:</th>
<th>Age:</th>
<th>Gender:</th>
<th>MobileNumber:</th>

</tr>

<tr>
<td><%=f.getTicketno()%></td>
<td><%=f.getName()%></td>
<td><%=f.getAge()%></td>
<td><%=f.getGender()%></td>
<td><%=f.getMailphno()%></td>

</tr>
</table>


<% } }%>
</body>
</html>