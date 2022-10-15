package com.dsk.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dsk.bean.Patients;
import com.dsk.dbconnection.DSKDaoImplementation;

public class Fetch extends HttpServlet{
	private static final long serialVersionUID = 1L;
	public Fetch() {
		super();
	}
	protected void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException{
		DSKDaoImplementation dao = new DSKDaoImplementation();
		List<Patients> result = dao.Fetch();

		HttpSession session = request.getSession();
		session.setAttribute("Patients", result);

		RequestDispatcher req = request.getRequestDispatcher("patientsdata.jsp");
		req.forward(request, response);
		}

}
