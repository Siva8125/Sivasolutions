package com.hrm.springmvc.entity.dao;

import java.util.List;


import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.ModelAndView;

import com.hrm.springmvc.entity.bean.EmployeeBean;
import com.hrm.springmvc.entity.bean.RequestBean;
import com.hrm.springmvc.entity.businesslogic.EmployeeIdGenerator;

public class DaoImplementation implements Dao {
	@Autowired
	SessionFactory sessionfactory;

	public String insertEmployeeData(EmployeeBean employeebean) {
		String result="";
		Session session=sessionfactory.openSession();
		String employeeId2 =employeebean.getEmployeeId();
		if(employeeId2==null) {
			employeeId2=EmployeeIdGenerator.employeeIdGenerator();
			employeebean.setEmployeeId(employeeId2);
		}
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.addObject("employeeIdObject",employeeId2);
		Object obj=session.save(employeebean);
		Transaction trans=session.beginTransaction();
		trans.commit();
		if(obj!=null) {
			result=(String) obj;
		}

		return result;
	}

	public boolean login(String username, long password) {
		boolean b1=false;
		Session session =sessionfactory.openSession();
		Query query=session.createQuery("from EmployeeBean emp where emp.employeeId='"+username+"' and emp.mobileNumber="+password);
		EmployeeBean empol = (EmployeeBean) query.uniqueResult();
		if(empol == null) {
			b1 = false;
		}else {
			b1 = true;
		}
		return b1;
	}

	public List<EmployeeBean> listOfAllEmployees() {
		Session session=sessionfactory.openSession();
		List<EmployeeBean> listofEmployees=null;
		Object obj=session.createQuery("from EmployeeBean").list();
		if(obj !=null) {
			listofEmployees=(List<EmployeeBean>) obj;
		}
		
		return listofEmployees;
	}

	public List<EmployeeBean> searchEmployees(String param) {
		Session session=sessionfactory.openSession();
		List<EmployeeBean> listofEmployees=null;
		Object obj=session.createQuery("from EmployeeBean emp where emp.employeeId="+param).list();
		if(obj!=null) {
			listofEmployees=(List<EmployeeBean>) obj;
		}
		return listofEmployees;
	}

	public int responseUpdate(RequestBean requestBean) {
		int reqResponse = 0;
		Session session = sessionfactory.openSession();
		Query query2 = session.createQuery("update RequestBean req set req.status='"+requestBean.getStatus()+"',req.managerReason='"+requestBean.getManagerReason()+"',req.reAssignMailId='"+requestBean.getReAssignMailId()+"' where req.reasonId='"+requestBean.getReasonId()+"'");
		Transaction trans = session.beginTransaction();
		reqResponse = query2.executeUpdate();
		trans.commit();
		return reqResponse;
	}

	public int closeStatus(RequestBean requestBean) {
		int reqClose = 0;
		Session session = sessionfactory.openSession();
		Query query1 = session.createQuery("update RequestBean req set req.status='"+requestBean.getStatus()+"',req.managerReason='"+requestBean.getManagerReason()+"' where req.reasonId='"+requestBean.getReasonId()+"'");
		Transaction trans = session.beginTransaction();
		reqClose = query1.executeUpdate();
		trans.commit();
		return reqClose;
	}

	public List<RequestBean> responseRequestData() {
		Session session = sessionfactory.openSession();
		List<RequestBean> requestList = null;
		Object obj = session.createQuery("from RequestBean").list();
		if(obj != null) {
			requestList = (List<RequestBean>) obj;
		}
		return requestList;
	}

	public int employeeUpdate(EmployeeBean employee) {
		int result = 0;
		Session session = sessionfactory.openSession();
		Query query = session.createQuery("update EmployeeBean emp set emp.firstName='"+employee.getFirstName()+"',emp.lastName='"+employee.getLastName()+"',emp.fatherName='"+employee.getFatherName()+"',emp.gender='"+employee.getGender()+"',emp.dob='"+employee.getDob()+"',emp.emailId='"+employee.getEmailId()+"',emp.mobileNumber="+employee.getMobileNumber()+",emp.alternateMobileNumber="+employee.getAlternateMobileNumber()+",emp.aadharNo="+employee.getAadharNo()+",emp.panNumber='"+employee.getPanNumber()+"',emp.passportNumber='"+employee.getPassportNumber()+"',emp.permanentAddress='"+employee.getPermanentAddress()+"',emp.localAddress='"+employee.getLocalAddress()+"',emp.schoolName='"+employee.getSchoolName()+"',emp.tenthPassedOut="+employee.getTenthPassedOut()+",emp.intermediateCollegeName='"+employee.getIntermediateCollegeName()+"',emp.interPassedOut="+employee.getInterPassedOut()+",emp.graduationDetails='"+employee.getGraduationDetails()+"',emp.graduationPassedOut="+employee.getGraduationPassedOut()+",emp.branch='"+employee.getBranch()+"',emp.university='"+employee.getUniversity()+"',emp.companyName='"+employee.getCompanyName()+"',emp.role='"+employee.getRole()+"',emp.location='"+employee.getLocation()+"',emp.experience='"+employee.getExperience()+"',emp.currentCTC="+employee.getCurrentCTC()+",emp.bankname='"+employee.getBankname()+"',emp.bankAccNo="+employee.getBankAccNo()+",emp.ifscCode='"+employee.getIfscCode()+"' where emp.employeeId='"+employee.getEmployeeId()+"'");
		Transaction trans = session.beginTransaction();
		result = query.executeUpdate();
		trans.commit();
		return result;
	}

	public boolean adminLogin(String adminId, String password) {
		boolean b = false;
		Session session = sessionfactory.openSession();
		List list = session.createQuery("from AdminBean admin where admin.adminid='"+adminId+"' and admin.password='"+password+"'").list();
		if(list != null) {
			b = true;
		}
		return b;
	}

	public List<EmployeeBean> search() {
		Session session = sessionfactory.openSession();
		List<EmployeeBean> listOfEmployees = null;
		Object obj = session.createQuery("from EmployeeBean").list();
		if(obj != null) {
			listOfEmployees = (List<EmployeeBean>) obj;
		}
		return listOfEmployees;
	}

	public List<EmployeeBean> search(String employeeId2) {
		Session session = sessionfactory.openSession();
		List<EmployeeBean> listOfEmployeeDetails = null;
		Object obj = session.createQuery("from EmployeeBean emp where emp.employeeId='"+employeeId2+"'").list();
		if(obj != null) {
			listOfEmployeeDetails = (List<EmployeeBean>) obj;
		}
		return listOfEmployeeDetails;
	}

}
