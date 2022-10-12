package com.dsk.controller;

import java.io.IOException;

import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dsk.bean.StudentBean;
import com.dsk.db.connection.DSKDaoImplementation;

public class SearchServlet extends HttpServlet{

	private static final long serialVersionUID = 1L;
	public SearchServlet() {
		super();
	}
	
	protected void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
		System.out.println("Submitted on GET");
		String StudentId=request.getParameter("StudentId");
				
		StudentBean sb = new StudentBean();
		sb.setStudentId(StudentId);
		
		DSKDaoImplementation we = new DSKDaoImplementation();
		StudentBean ss = we.SearchData(StudentId);
		HttpSession session = request.getSession();
		session.setAttribute("StudentData",ss);
		
		RequestDispatcher success = request.getRequestDispatcher("/StudentData");
		RequestDispatcher failure = request.getRequestDispatcher("fail.html");
		if(ss!=null) {
		success.forward(request, response);
		} else {
		failure.forward(request, response);
		}
		PrintWriter out = response.getWriter();
		out.print("<html><body><table>");
		out.print("<tr><th>StudentId</th><th>FirstName</th><th>LastName</th><th>FatherName</th><th>Address</th></tr>");
		out.print("<tr><td>"+ss.getStudentId()+"</td>");
		out.print("<td>"+ss.getFirstName()+"</td>");
		out.print("<td>"+ss.getLastName()+"</td>");
		out.print("<td>"+ss.getFatherName()+"</td>");
		out.print("<td>"+ss.getAddress()+"</td></tr>");
		out.print("<tr><td><button><a href='index.html'>Home</a></td></tr>");

		out.print("</table></body></html>");
	}
	
	
	

}
