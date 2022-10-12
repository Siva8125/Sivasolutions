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

public class StudentData extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public StudentData() {
		super();
		}

		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");

		HttpSession session = request.getSession();
		Object obj =session.getAttribute("StudentBean");
		StudentBean emp = null;
		if(obj!=null) {
		emp = (StudentBean)obj;
		}
		RequestDispatcher rd =request.getRequestDispatcher("/RegistrationServlet");
		session.setAttribute("StudentData", rd);
		PrintWriter out = response.getWriter();
		out.print("<html><body><table>");
		out.print("<tr><th>StudentId</th><th>FirstName</th><th>LastName</th><th>FatherName</th><th>Address</th></tr>");
		out.print("<tr><td>"+emp.getStudentId()+"</td>");
		out.print("<td>"+emp.getFirstName()+"</td>");
		out.print("<td>"+emp.getLastName()+"</td>");
		out.print("<td>"+emp.getFatherName()+"</td>");
		out.print("<td>"+emp.getAddress()+"</td></tr>");
		out.print("<tr><td><button><a href='index.html'>Home</a></td></tr>");
		
		out.print("</table></body></html>");
		}
		
		

}
