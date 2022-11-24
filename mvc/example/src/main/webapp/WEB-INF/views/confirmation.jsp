<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<p>Your reservation is confirmed successfully. Please, re-check the
		details.</p>
	First Name : ${reservation.firstName}
	<br> Last Name : ${reservation.lastName}
	<br> Gender : ${reservation.gender}
	<br> Meals:
	<c:forEach var="meal" items="${reservation.food}">
		<li>${meal}</li>
	</c:forEach>
	Leaving From : ${reservation.cityFrom}
	<br> Going To : ${reservation.cityTo}
</body>
</html>