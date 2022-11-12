<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="com.dsk.bean.Patients"%>
<%@page import="java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Passengers Details</title>
</head>
<body>
<h2 align ="center">Passengers Details</h2>
<table align="center">
<%
Object sessionObj = session.getAttribute("Passengers");
if (sessionObj == null){
out.print("No Data Found");
} else {
List<Patients> elist = (ArrayList<Patients>)sessionObj;
%>

<tr>
<th>PatientNumber</th>
<th>PatientName</th>

</tr>
<%
for(Patients e : elist){
%>
<tr>
<td><%=e.getPatientNumber()%></td>
      <td><%=e.getPatientName() %></td>
           </tr>
<%
}
}
%>
<tr>
<td><button>
<a href="index.jsp">Index</a></button></td>
</tr>
</table>


</body>
</html>