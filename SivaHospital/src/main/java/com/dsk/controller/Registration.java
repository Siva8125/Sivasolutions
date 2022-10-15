package com.dsk.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dsk.bean.Patients;
import com.dsk.dbconnection.DSKDaoImplementation;

public class Registration extends HttpServlet {
	private static final long serialVersionUID = 1L;
	

	 public Registration() {
		 super();
	 }
		

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
	System.out.println("form submitted on GET");
	String PatientNumber = request.getParameter("PatientNumber");
	int num = 0;
	try {
		num = Integer.parseInt(PatientNumber);
	}catch(Exception e) {
		num=0;
	}
	String PatientName = request.getParameter("PatientName");
		
	Patients pa = new Patients();
	pa.setPatientNumber(num);
	pa.setPatientName(PatientName);
	
	DSKDaoImplementation dao = new DSKDaoImplementation();
	
	int result = dao.InsertOPData(pa);
	HttpSession session = request.getSession();
	session.setAttribute("Patients", pa);

	RequestDispatcher empservlet = request.getRequestDispatcher("/OPData");
	RequestDispatcher failure = request.getRequestDispatcher("fail.html");
	if(result>0) {
	empservlet.forward(request, response);
	} else {
	failure.forward(request, response);
	}
	}
		


}
