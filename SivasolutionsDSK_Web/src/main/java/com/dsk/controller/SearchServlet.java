package com.dsk.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dsk.bean.Studentbean;
import com.dsk.db.connection.DSKDaoImplementation;

public class SearchServlet extends HttpServlet{

	private static final long serialVersionUID = 1L;
	public SearchServlet() {
		super();
	}
	
	protected void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
		System.out.println("Submitted on GET");
		String studentId=request.getParameter("studentId");
		/*String firstName=request.getParameter("FirstName");
		String lastName=request.getParameter("LastName");*/
		
		
		Studentbean sb = new Studentbean();
		sb.setStudentId(studentId);
		/*sb.setFirstName(firstName);
		sb.setLastName(lastName);*/
		
		
		
		DSKDaoImplementation we = new DSKDaoImplementation();
		Studentbean ss = we.SearchData(studentId);
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
		out.print("<tr><th>StudentId</th><th>FirstName</th><th>LastName</th></tr>");
		out.print("<tr><td>"+ss.getStudentId()+"</td>"+"<td>"+ss.getFirstName()+"</td>"+"<td>"+ss.getLastName()+"</td></tr>");
		out.print("<button>");
		out.print("<a href='index.html'>Data</a>");
		out.print("</button>");
		out.print("</table></body></html>");
	}
	
	
	

}
