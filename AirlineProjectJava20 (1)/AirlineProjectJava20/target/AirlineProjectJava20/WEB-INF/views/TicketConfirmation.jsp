<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
overflow:hidden;
background-color: #333;
Width: 100%;
height: auto;
}


li {
float: right;
border-left: 1px solid #bbb;
}

li[class="main"] {
float: left;
margin-left: 225px;
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

li a[class="active"] {
background-color: green;
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
<h2>Ticket Booked Successfully</h2>
<button id="view" type="submit" ><a href="viewticketdetials"></a>View Details</button>
			<button id="submit" type="submit"><a href="cancelticketdetials"></a>Cancel Ticket</button>
</body>
</html>