package com.dsk.controller;

import java.io.IOException;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dsk.bean.StudentBean;
import com.dsk.db.connection.DSKDaoImplementation;
//@webServlet("/RegistrationServelet")
public class RegistrationServlet extends HttpServlet{
	private static final long serialVersionUID = 1L;
	

	 public RegistrationServlet() {
		 super();
	 }
		

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
	System.out.println("form submitted on GET");
	String StudentId = request.getParameter("StudentId");
	String FirstName = request.getParameter("FirstName");
	String LastName = request.getParameter("LastName");
	String FatherName = request.getParameter("FatherName");
	String Address = request.getParameter("Address");
	
	
	StudentBean sb = new StudentBean();
	sb.setStudentId(StudentId);
	sb.setFirstName(FirstName);
	sb.setLastName(LastName);
	sb.setFatherName(FatherName);
	sb.setAddress(Address);

	DSKDaoImplementation dao = new DSKDaoImplementation();
	
	int result = dao.InsertStudentData(sb);
	HttpSession session = request.getSession();
	session.setAttribute("StudentBean", sb);

	RequestDispatcher empservlet = request.getRequestDispatcher("/StudentData");
	RequestDispatcher failure = request.getRequestDispatcher("fail.html");
	if(result>0) {
	empservlet.forward(request, response);
	} else {
	failure.forward(request, response);
	}
	}
		

}
