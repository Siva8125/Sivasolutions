
<%@page import="com.hrm.session.SharedObject"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="com.hrm.springmvc.entity.bean.EmployeeBean"%>
<%@page import="java.util.List"%>
<%@page import="java.util.Iterator"%>
<%@page import="com.hrm.springmvc.entity.service.DaoServiceImplementation"%>
<%@page import="com.hrm.springmvc.entity.service.DaoService"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<script type="text/javascript">
 </script>
<body>
<% String str1=null;%>
<%
str1=request.getParameter("m"); 
SharedObject.setSession(request.getSession());
DaoService hrmService=new DaoServiceImplementation();
EmployeeBean bean=hrmService.searchGmailId(str1);
%>
email-id<input type="text" name="email" value=<%=bean.getEmailId()%>>
</body>
</html>