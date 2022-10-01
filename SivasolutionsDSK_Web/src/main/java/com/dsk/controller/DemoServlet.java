package com.dsk.controller;

import java.io.IOException;
import com.dsk.bean.Encapsulatedclass;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dsk.servlet.HttpSession;
import com.dsk.servlet.RequestDispatcher;
import com.dsk.dao.WebImplementation;
//@webServlet("/DemoServelet")

public class DemoServlet extends HttpServlet{
	private static final long serVersionUID =1L;

	public DemoServlet() {
	super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	System.out.println("form submitted on GET");
	String studentId = request.getParameter("studentId");
	String firstName = request.getParameter("firstName");
	
	
	Encapsulatedclass es = new Encapsulatedclass();
	es.setId(studentId);
	es.setName(firstName);
	

	WebImplementation we = new WebImplementation();
	int result = we.Insertwithprepst(es);
	HttpSession session = (HttpSession) request.getSession();
	session.setAttribute("EmployeObject", es);

	RequestDispatcher empservlet = (RequestDispatcher) request.getRequestDispatcher("/EmployeeData");
	RequestDispatcher failure = (RequestDispatcher) request.getRequestDispatcher("Fail.html");
	if(result>0) {
	empservlet.forward(request, response);
	} else {
	failure.forward(request, response);
	}


	}


}
