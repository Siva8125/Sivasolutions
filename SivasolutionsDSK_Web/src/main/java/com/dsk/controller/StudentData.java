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

public class StudentData extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public StudentData() {
		super();
		}

		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");

		HttpSession session = request.getSession();
		Object obj =session.getAttribute("Studentbean");
		Studentbean emp = null;
		if(obj!=null) {
		emp = (Studentbean)obj;
		}
		RequestDispatcher rd =request.getRequestDispatcher("/RegistrationServlet");
		session.setAttribute("StudentData", rd);
		PrintWriter out = response.getWriter();
		out.print("<html><body><table>");
		out.print("<tr><th>StudentId</th><th>FirstName</th><th>LastName</th></tr>");
		out.print("<tr><td>"+emp.getStudentId()+"</td>"+"<td>"+emp.getFirstName()+"</td>"+"<td>"+emp.getLastName()+"</td></tr>");
		out.print("<button>");
		out.print("<a href='index.html'>Home</a>");
		out.print("</button>");
		out.print("</table></body></html>");
		}
		
		

}
