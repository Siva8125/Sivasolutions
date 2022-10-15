package com.dsk.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dsk.bean.Patients;

public class OPData extends HttpServlet{
	private static final long serialVersionUID = 1L;

	public OPData() {
		super();
		}

		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");

		HttpSession session = request.getSession();
		Object obj =session.getAttribute("Patients");
		Patients emp = null;
		if(obj!=null) {
		emp = (Patients)obj;
		}
		RequestDispatcher rd =request.getRequestDispatcher("/Registration");
		session.setAttribute("Patients", rd);
		PrintWriter out = response.getWriter();
		out.print("<html><body><table>");
		out.print("<tr><th>PatientNumber</th><th>PatientName</th></tr>");
		out.print("<tr><td>"+emp.getPatientNumber()+"</td>");
		out.print("<td>"+emp.getPatientName()+"</td></tr>");
		
		out.print("<tr><td><button><a href='index.html'>Home</a></td></tr>");
		
		out.print("</table></body></html>");
		}
		

}
