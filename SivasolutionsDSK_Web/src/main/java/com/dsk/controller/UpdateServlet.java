package com.dsk.controller;

import java.io.IOException;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dsk.bean.StudentBean;
import com.dsk.db.connection.DSKDaoImplementation;

public class UpdateServlet extends HttpServlet{

	private static final long serialVersionUID = 1L;
	public UpdateServlet() {
		super();
	}
	
	protected void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
		System.out.println("Submitted on GET");
		String StudentId=request.getParameter("StudentId");
		String FirstName=request.getParameter("FirstName");
		String LastName=request.getParameter("LastName");
		String FatherName=request.getParameter("FatherName");
		String Address=request.getParameter("Address");
		
		StudentBean sb = new StudentBean();
		sb.setStudentId(StudentId);
		sb.setFirstName(FirstName);
		sb.setLastName(LastName);
		sb.setFatherName(FatherName);
		sb.setAddress(Address);
		
		
		DSKDaoImplementation we = new DSKDaoImplementation();
		int result = we.UpdateData(sb);
		
		RequestDispatcher success = request.getRequestDispatcher("/UpdateData");
		RequestDispatcher failure = request.getRequestDispatcher("update fail.html");
		if(result>0) {
		success.forward(request, response);
		} else {
		failure.forward(request, response);
		}
	}
	

}
