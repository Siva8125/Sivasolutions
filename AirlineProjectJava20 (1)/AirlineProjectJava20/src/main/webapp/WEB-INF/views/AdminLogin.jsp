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

.loginbox {
width: 500px;
height: 400px;
background: transparent;
color: #fff;
top: 20%;
left: 5%;
position: absolute;
box-sizing: border-box;
padding: 0px 30px;
margin-left: 900px;
}

.loginbox p {
margin-left: 220px;
padding: 0;
font-size: bold;
color: black;
}

.loginbox input {
width: 100px;
margin-bottom: 20px;
}

.loginbox input[type="Password"], input[type="Name"] {
border: none;
border-bottom: 1px solid #fff;
border-bottom-color: black;
background: transparent;
outline: none;
height: 40px;
color: #fff;
font-size: 16px;
width: 100%;
}

.loginbox input[type="button"] {
margin-left: 220px;
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
</style>
</head>
<body class="bg-info"
style="background-image: url('http://www.sfdcpoint.com/wp-content/uploads/2019/01/Salesforce-Admin-Interview-questions.png'); background-position: cover; background-repeat: no-repeat">
<ul>
<li class="logo"><a class="logo1" href="homepageopening">hi</a></li>
<li class="main">VTALENT FLIGHT BOOKING</li>
<li><a href="aboutuspageopening">About</a></li>
<li><a href="homepageopening">Home</a></li>
<li><a href="loginpageopening">Login</a></li>

</ul>
<br>
<div class="loginbox">
<h1>Admin Login</h1>
<form>
<label for="name">Admin Name:</label> <input type="Name"
onkeypress="clearForm()" id="Name" name="name"
placeholder="Enter Name" required><br> <label
for="Password">Password:</label> <input type="password"
onkeypress="clearForm()" id="Password" name="password"
placeholder="Enter password" required><br>

<button id="submitButton" type="submit"><a href="adminpageopening">Submit</button>
<button id="reset" type="reset">Refresh</button>






</form>

</div>

</body>
</html>

