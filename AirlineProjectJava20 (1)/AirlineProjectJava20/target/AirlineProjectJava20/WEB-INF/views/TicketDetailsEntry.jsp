<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="font-awesome-4.7.0/css/font-awesome.min.css"
	rel="stylesheet">
<link
	href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css"
	rel="stylesheet">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<link rel="stylesheet" media="all" href="stylesheets/animate.css" />

<script type="text/javascript">
	function add_fields() {
		var d = document.getElementById("content");

		d.innerHTML += "<br /><span>Name: <input type='text'value='' /><span>Age: <input type='text'  value='' /></span><span>Gender: <input type='text'value='' />";
	}
</script>
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

.loginbox {
	width: 700px;
	height: 600px;
	background: transparent;
	color: black;
	top: 20%;
	left: 5%;
	position: absolute;
	box-sizing: border-box;
	padding: 0px 30px;
}

.loginbox p {
	margin-left: 220px;
	padding: 0;
	font-size: 20px;
	color: black;
}

.loginbox input {
	width: 100px;
	margin-bottom: 20px;
}

.loginbox input[type="Password"], input[type="Name"], input[type="Re-Enter Password"],
	input[type="Mobile Number"], input[type="idproofno"] {
	border: none;
	border-bottom: 1px solid #ccc;

	background: transparent;
	outline: none;
	height: 30px;
	color: black;
	font-size: 16px;
	width: 100%;
}

.loginbox input[value="Login"] {
	margin-left: 220px;
}

.loginbox input[type="button"] {
	marign-top: 10px;
}

label {
	color: black;
	marign-top: 10px;
	font-size: 20px;
}

h1 {
	color: black;
	text-align: center;
}

select[name="Select ID"] {
	border: none;
	border-bottom: 1px solid #fff;
	background: transparent;
	outline: none;
	height: 35px;
	color: black;
	font-size: 16px;
	width: 100%;
}

select {
	width: 330px;
}

button {
	marign-buttom: 10px;
}
</style>
</head>
<body class="bg-info"
	style="background-image: url('https://img.etimg.com/thumb/msid-65363150,width-640,resizemode-4,imgsize-162013/travel-right.jpg'); background-size: cover; background-repeat: no-repeat">
	<ul>
		<li class="logo"><a class="logo1" href="homepageopening">hi</a></li>
		<li class="main">VTALENT FLIGHT BOOKING</li>
		<li><a href="aboutuspageopening">About</a></li>
		<li><a href="homepageopening">Home</a></li>
		

	</ul>
	<br>
	<div class="loginbox">
		<h1>Enter Passenger Details</h1>
		<form modelAttribute="BookObj" action="UserBookingRequest"
			method="get">
			
<%-- 			<label for="Mobile Number">Ticket Number:</label> <input style="width: 270px;"  type="ticketno" id="ticketno"
				name="ticketno">--%>
				
			<label for="Mobile Number">Name: <input style="width: 270px;"  type="name" id="name"
				name="name">
							<label for="Mobile Number">Age: <input style="width: 270px;"  type="age" id="age"
				name="age">
							<label for="Mobile Number">Gender: <input style="width: 270px;"  type="gender" id="gender"
				name="gender">
		
			<br> <label for="Mobile Number"><span style="color: red">*</span>Mobile
				Number/EmailId:</label> <input type="mailphno" id="mailphno"
				name="mailphno" placeholder="Enter Mobile Number/Email ID"> <br>
			<label for="Select Class"><span style="color: red">*</span>Select
				Insurance:</label> <select name="idproof" id="Select ID"
				onblur="return Validate1()">
				<option value="">Select Insurance</option>
				<option value="Aadhaar Card">TATA AIG</option>
				<option value="Passport">ICICI LOMBARD</option>
				<option value="Pan Card">Pan Card</option>

			</select> <br>
			<p>Food Preference</p>
			<input type="checkbox" id="One-way"> <label for="One-way">Non-Veg</label>
			&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <input type="checkbox"
				id="One-way"> <label for="One-way">Veg</label> <br> <label
				for="Selected ID No"><span style="color: red">*</span>Enter
				ID No:</label> <input type="idproofno" id="Selected ID No" name="idproofno"
				placeholder="Selected ID No"> <br> <br>
			<button id="submitButton" type="submit" onsubmit="return Validate()">Submit</button>
			<button id="reset" type="reset">Refresh</button>
			<br>


		</form>
	</div>
</body>
</html>