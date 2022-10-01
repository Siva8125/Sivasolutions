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
	String employeeId = request.getParameter("employeeId");
	String employeeName = request.getParameter("employeeName");
	String employeeSalary = request.getParameter("employeeSalary");
	double employeesalary1 =0.0;
	try {
	employeesalary1 = Double.parseDouble(employeeSalary);
	} catch(Exception e) {
	employeesalary1 =0.0;
	}
	Encapsulatedclass es = new Encapsulatedclass();
	es.setId(Id);
	es.setName(Name);
	//es.setSalarybase(employeeSalary);

	WebImplementation we = new WebImplementation();
	int result = we.Insertwithprepst(es);
	HttpSession session = request.getSession();
	session.setAttribute("EmployeObject", es);

	RequestDispatcher empservlet = request.getRequestDispatcher("/EmployeeData");
	RequestDispatcher failure = request.getRequestDispatcher("Fail.html");
	if(result>0) {
	empservlet.forward(request, response);
	} else {
	failure.forward(request, response);
	}


	}


}
