package com.dsk.servlet;

import java.io.IOException;

import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import com.dsk.bean.Studentbean;
import javax.servlet.RequestDispatcher;

public class EmployeeData extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public EmployeeData() {
		super();
		}

		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");

		HttpSession session = (HttpSession) request.getSession();
		Object obj =session.getAttribute("EmployeeObject");
		Studentbean emp = null;
		if(obj!=null) {
		emp = (Studentbean)obj;
		}
		RequestDispatcher rd =request.getRequestDispatcher("/RegistrationServlet");
		session.setAttribute("StudentData", rd);
		PrintWriter out = response.getWriter();
		out.print("<html><body><table>");
		out.print("<tr><th>StudentId</th></tr>");
		out.print("<td>"+emp.getStudentId()+"</td>");
		out.print("<button>");
		out.print("<a herf='RegistrationServlet'>Data</a>");
		out.print("</button>");
		out.print("</table></body></html>");
		}

}
