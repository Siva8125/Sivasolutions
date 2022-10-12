<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="com.dsk.bean.StudentBean"%>
<%@page import="java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Data</title>
</head>
<body>
<h2 align ="center">Student data</h2>
<table align="center">
<%
Object sessionObj = session.getAttribute("StudentBean");
if (sessionObj == null){
out.print("No Data Found");
} else {
List<StudentBean> elist = (ArrayList<StudentBean>)sessionObj;
%>

<tr>
<th>StudentId</th>
<th>FirstName</th>
<th>LastName</th>
<th>FatherName</th>
<th>Address</th>
</tr>
<%
for(StudentBean e : elist){
%>
<tr>
<td><%=e.getStudentId()%></td>
      <td><%=e.getFirstName() %></td>
      <td><%= e.getLastName()%></td>
      <td><%=e.getFatherName() %></td>
      <td><%=e.getAddress() %></td>

     </tr>
<%
}
}
%>
<tr>
<td><button>
<a href="index.html">Index</a></button></td>
</tr>
</table>


</body>
</html>