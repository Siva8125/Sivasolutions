package com.dsk.controller;

import java.io.IOException;



import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dsk.bean.StudentBean;
import com.dsk.db.connection.DSKDaoImplementation;

public class DeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public DeleteServlet() {
		super();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Submitted on GET");
		String StudentId=request.getParameter("StudentId");
						
		StudentBean sb = new StudentBean();
		sb.setStudentId(StudentId);
				
		DSKDaoImplementation we = new DSKDaoImplementation();
		int result = we.DeleteData(sb);
		
		RequestDispatcher success = request.getRequestDispatcher("success.html");
		RequestDispatcher failure = request.getRequestDispatcher("fail.html");
		if(result>0) {
		success.forward(request, response);
		} else {
		failure.forward(request, response);
		}
		
	}

}
