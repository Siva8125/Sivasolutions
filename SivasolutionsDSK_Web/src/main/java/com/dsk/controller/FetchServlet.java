package com.dsk.controller;

import java.io.IOException;

import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dsk.bean.StudentBean;
import com.dsk.db.connection.DSKDaoImplementation;

public class FetchServlet extends HttpServlet{

	private static final long serialVersionUID = 1L;
	public FetchServlet() {
		super();
	}
	protected void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException{
		DSKDaoImplementation dao = new DSKDaoImplementation();
		List<StudentBean> result = dao.Fetch();

		HttpSession session = request.getSession();
		session.setAttribute("StudentBean", result);

		RequestDispatcher req = request.getRequestDispatcher("view.jsp");
		req.forward(request, response);
		}
	

}
