package com.dsk.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dsk.bean.Studentbean;
import com.dsk.db.connection.DSKDaoImplementation;

public class DeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Submitted on GET");
		String studentId=request.getParameter("StudentId");
		int id = 0;
		try {
			id = Integer.parseInt(studentId);
		}catch(Exception e) {
			id = 0;
		}
		/*String firstName = request.getParameter("firstName");
		String LastName = request.getParameter("lastName");
		String FatherName = request.getParameter("fatherName");
		String Gender = request.getParameter("gender");
		String Dob = request.getParameter("dob");
		String EmailId = request.getParameter("emailId");
		String MobileNumber = request.getParameter("mobileNumber");
			
		String Alternatemobilenumber = request.getParameter("alternatemobilenumber");
		String AadharNo = request.getParameter("aadharNo");
		String PermanentAddress = request.getParameter("permanentAddress");
		String Presentaddress = request.getParameter("presentaddress");
		String SchoolName = request.getParameter("schoolName");
		String TenthPassedOut = request.getParameter("tenthPassedOut");
		String IntermediateCollegeName = request.getParameter("intermediateCollegeName");
		String InterPassedOut = request.getParameter("interPassedOut");
		String Graduationdetails = request.getParameter("graduationdetails");
		String Graduationpassedout = request.getParameter("graduationpassedout");
		String Branch = request.getParameter("branch");
		String University = request.getParameter("university");
		String CourseName = request.getParameter("courseName");
		String Coursefee = request.getParameter("coursefee");
		String Bankname = request.getParameter("bankname");
		String BankaccNo = request.getParameter("bankaccNo");
		String Ifsccode = request.getParameter("ifsccode");
		String Paymentperiod = request.getParameter("paymentperiod");
		String Paymentstatus = request.getParameter("paymentstatus");
		String Academylocation = request.getParameter("Academylocation");*/
		
		Studentbean sb = new Studentbean();
		sb.setStudentId(studentId);
		/*sb.setFirstName(firstName);
		sb.setLastName(LastName);
		sb.setFatherName(FatherName);
		sb.setGender(Gender);
		sb.setDob(Dob);
		sb.setEmailId(EmailId);
		//sb.setMobileNumber(MobileNumber);
		try {
			sb.setMobileNumber(Long.parseLong(MobileNumber));
		}catch(Exception e) {
			MobileNumber=null;
		}
		//sb.setAlternatemobilenumber(alternatemobilenumber);
		//sb.setAadharNo(aadharNo);
		sb.setPermanentAddress(PermanentAddress);
		sb.setPresentaddress(Presentaddress);
		sb.setSchoolName(SchoolName);
		//sb.setTenthPassedOut(tenthPassedOut);
		sb.setIntermediateCollegeName(IntermediateCollegeName);
		//sb.setInterPassedOut(interPassedOut);
		sb.setGraduationdetails(Graduationdetails);
		//sb.setGraduationpassedout(graduationpassedout);
		sb.setBranch(Branch);
		sb.setUniversity(University);
		sb.setCourseName(CourseName);
		//sb.setCoursefee(coursefee);
		sb.setBankname(Bankname);
		//sb.setBankaccNo(bankaccNo);
		sb.setIfsccode(Ifsccode);
		//sb.setPaymentperiod(paymentperiod);
		//sb.setPaymentstatus(Paymentstatus);
		sb.setAcademylocation(Academylocation);*/
		
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
