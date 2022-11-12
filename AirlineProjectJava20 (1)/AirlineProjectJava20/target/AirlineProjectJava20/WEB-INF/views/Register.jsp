<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript">
    function Validate() {
        var password = document.getElementById("Password").value;
        var confirmPassword = document.getElementById("Re-Enter Password").value;
        if (password != confirmPassword) {
            alert("Passwords do not match.");
            return false;
        }
        return true;
    }
    function Validate1(){
    	var selectid = document.getElementById("Select ID").value;
    	if(selectid == ""){
    		alert("please select a id proof");
    		return false;
    	}
    	return true;
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
	width: 500px;
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
	border-bottom: 1px solid #fff;
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
	style="background-image: url('https://www.webintravel.com/wp-content/uploads/2020/05/den-belitsky-GettyImages-854673918-scaled.jpg'); background-position: cover; background-repeat: no-repeat">
	<ul>
		<li class="logo"><a class="logo1" href="homepageopening">hi</a></li>
		<li class="main">VTALENT FLIGHT BOOKING</li>
		<li><a href="aboutuspageopening">About</a></li>
		<li><a href="homepageopening">Home</a></li>
		<li><a href="loginpageopening">Login</a></li>

	</ul>
	<br>
	<div class="loginbox">
		<h1>New User Registration</h1>
		<form modelAttribute="UserObj" action="UserRegisterRequest"
			method="get">
			<label for="Name"><span style="color: red">*</span>Name:</label> <input type="name" id="Name"
				name="Name" placeholder="Enter Name" required><br> <label
				for="Password"><span style="color: red">*</span>Password:</label> <input type="password"
				id="Password" name="password" placeholder="Enter Password" required>
			<br> <label for="name"><span style="color: red">*</span>Re-Enter Password:</label> <input
				type="password" id="Re-Enter Password" name="Re-Enter Password"
				placeholder="Re-Enter Password"  onchange="return Validate()" required> <br> <label
				for="Mobile Number"><span style="color: red">*</span>Mobile Number:</label> <input
				type="Mobile Number" id="Mobile Number" name="mobile"
				placeholder="Enter Mobile Number" required> <br> <label
				for="Select Class"><span style="color: red">*</span>Select ID:</label> <select name="idproof" id="Select ID" onblur="return Validate1()">
				<option value="" >Select ID</option>
				<option value="Aadhaar Card">Aadhaar Card</option>
				<option value="Passport">Passport</option>
				<option value="Pan Card">Pan Card</option>
			
			</select> <br><br>
			 <label
				for="Selected ID No"><span style="color: red">*</span>Selected ID No:</label> <input
				type="idproofno" id="Selected ID No" name="idproofno"
				placeholder="Selected ID No" required> <br>
			
			<br> <button id="submitButton" type="submit" onsubmit="return Validate()">Submit</button>
			<button id="reset" type="reset">Refresh</button> <br>
			<p>Existing User?</p>
			<button
				style="height: 30px; width: 75px; font-style: italic; margin-left: 220px">
				<a href="loginpageopening">Login</a>
			</button>

		</form>
	</div>
</body>
</html>