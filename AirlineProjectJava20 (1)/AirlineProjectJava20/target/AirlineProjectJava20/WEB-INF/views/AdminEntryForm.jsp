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
overflow: hidden;
background-color: #333;
Width: 100%;
position: fixed;
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

.audi {
margin-left: 650px;
}

label {
display: inline-block;
width: 150px;
margin-bottom: 15px;
}



select {
width: 330px;
}
</style>
</head>
<body class="bg-info"
style="background-image: url('https://miro.medium.com/max/1400/1*yBW3ELIDyF-iPFQ9Rb9NTA.jpeg')">
<ul>
<li class="logo"><a class="logo1" href="homepageopening">hi</a></li>
<li class="main">VTALENT FLIGHT BOOKING</li>
<li><a href="aboutuspageopening">About</a></li>
<li><a class="active" href="homepageopening">Home</a></li>
<li><a href="loginpageopening">Login</a></li>

</ul>
<br>
<br>
<br>
<br>
<br>
<br>
<h2 align="left" style="font-size: 40px; font-style: italic">Enter 
Flights Details</h2>

<div class="audi">
<form modelAttribute="AdminObj" action="AdminFlight"
			method="post">

<label for="From City">From City:</label> <select
name="fromcity" id="fromcity">
<option value="Select City">Select City</option>
<option value="hyderabad">Hyderabad</option>
<option value="tirupathi">Tirupati</option>
<option value="Mumbai">Mumbai</option>
<option value="Delhi">Delhi</option>
<option value="Chennai">Chennai</option>
<option value="Pune">Pune</option>

<option value="Bangalore">Bangalore</option>

</select> <br> <label for="Destination City">Destination City:</label> <select
name="tocity" id="tocity">
<option value="Select City">Select City</option>
<option value="hyderabad">Hyderabad</option>


<option value="tirupathi">Tirupati</option>
<option value="Mumbai">Mumbai</option>
<option value="Delhi">Delhi</option>
<option value="Chennai">Chennai</option>
<option value="Pune">Pune</option>

<option value="Bangalore">Bangalore</option>
</select> <br> <label for="Select Class">Select Airlines:</label> <select
name="airlines" id="Select Class">
<option value="">Select Airlines</option>
<option value="Indigo">Indigo</option>
<option value="Spicejet">Spicejet</option>
<option value="Air India">Air India</option>
<option value="Vistara">Vistara</option>
</select> <br> <label for="flight type">Flight Type:</label> <input
type="flightname" name="flightname" placeholder="Flight Type" required> <br>
  <label
				for="Selected ID No">Price:</label> <input
				type="price" id="price" name="price"
				placeholder="Price" required>
<br>
 <input type="submit" value="Submit">
<input type="reset" value="Reset">
<a href="airlinespage">nextpage</a>
</form>
</div>
</body>
</html>
