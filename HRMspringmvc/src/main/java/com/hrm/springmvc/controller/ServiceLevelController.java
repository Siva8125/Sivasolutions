package com.hrm.springmvc.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.hrm.springmvc.entity.bean.AdminBean;
import com.hrm.springmvc.entity.bean.EmployeeBean;
import com.hrm.springmvc.entity.bean.PaySlipBean;
import com.hrm.springmvc.entity.bean.RequestBean;
import com.hrm.springmvc.entity.businesslogic.EmployeeIdGenerator;
import com.hrm.springmvc.entity.service.DaoService;

@Controller
public class ServiceLevelController {
	
	@Autowired
	DaoService service;
	
	@RequestMapping(value = "EmployeeFormRequest")
	public ModelAndView readEmployeeRegistration(@ModelAttribute("employeeObj")EmployeeBean employeebean) {
		String result="";
		ModelAndView modelAndViewRef=new ModelAndView();
	String employeeId2 = employeebean.getEmployeeId();
		if(employeeId2 == null) {
			employeeId2 = EmployeeIdGenerator.employeeIdGenerator();
			employeebean.setEmployeeId(employeeId2);
		}
		result = service.insertEmployeeData(employeebean);
		List<EmployeeBean> employeeResults = service.search(employeeId2);
		if(result!="") {
			modelAndViewRef.setViewName("userupdate");
			modelAndViewRef.addObject("employeeId", employeeId2);
			modelAndViewRef.addObject("employeeIdObj", employeeResults);
		}else {
			modelAndViewRef.setViewName("EmployeeRegistration");
			
		}
		return modelAndViewRef;
	}
	@RequestMapping(value="LoginServlet")
	public ModelAndView readLogin(@ModelAttribute("loginObj")EmployeeBean employeeBean) {
		
		ModelAndView modelAndViewRef=new ModelAndView();
		String username=employeeBean.getEmployeeId();
		
		long password=employeeBean.getMobileNumber();
		String type=employeeBean.getRole();
		
		boolean flag=service.login(username,password);
		if(flag) {
			if (type.equals("admin")) {
				modelAndViewRef.setViewName("AdminView");
                modelAndViewRef.addObject("EmployeeId",username);
			}else if(type.equals("employee")) {
				modelAndViewRef.setViewName("EmployeeView");
			}else if(type.equals("employeer")) {
				modelAndViewRef.setViewName("employeerview");
			}else if(type.equals("hr")) {
				modelAndViewRef.setViewName("hrview");
			}else if(type.equals("manager")) {
				modelAndViewRef.setViewName("managerHomepage");
                modelAndViewRef.addObject("EmployeeId",username);
			}
			
		}else {
			modelAndViewRef.setViewName("user");
		}
		return modelAndViewRef;
	}
	
    	@RequestMapping(value="PaySlipFormRequest")
	public ModelAndView readPaySlipDetails(@ModelAttribute("paySlipObj") PaySlipBean paySlip) {
		ModelAndView modelAndViewRef =new ModelAndView();
		modelAndViewRef.setViewName("payslip2");
		modelAndViewRef.addObject("PaySlipObj123",paySlip);
		return modelAndViewRef;
	}
	
	@RequestMapping(value = "openingUpdateProfile")
	public ModelAndView updateProfile(HttpServletRequest request,HttpServletResponse response) {
		
		ModelAndView model1 = new ModelAndView();
		String userId = request.getQueryString();
		List<EmployeeBean> list1 = service.search();
		model1.setViewName("UpdateProfile");
		model1.addObject("userId1", userId);
		model1.addObject("listOff", list1);
		return model1;		
	}
	
	@RequestMapping(value = "AdminLogInForm")
	public ModelAndView readAdminLogin(@ModelAttribute("adminLoginObj") AdminBean admin) {
		
		ModelAndView model = new ModelAndView();
		String adminId = admin.getAdminid();
		String password = admin.getPassword();
		
		boolean flag = service.adminLogin(adminId,password);
		if(flag) {
			model.setViewName("adminviewnew");
		}else {
			model.setViewName("adminlogin");
		}
		return model;
	}
	
	@RequestMapping(value = "openingResponseApproved")
	public ModelAndView responseApproved(HttpServletRequest request,HttpServletResponse response) {
		
		ModelAndView mode = new ModelAndView();
		String userId = request.getQueryString();
		List<RequestBean> response1 = service.responseRequestData();
		mode.setViewName("ResponseApproved");
		mode.addObject("responseList",response1);
		mode.addObject("userId", userId);
		return mode;
	}
	
	@RequestMapping(value = "UpdateFormDetails")
	public ModelAndView updateDetails(@ModelAttribute("updateDetails") EmployeeBean employee) {
		
		int result = 0;
		String employeId = employee.getEmployeeId();
		ModelAndView model2 = new ModelAndView();
		result = service.employeeUpdate(employee);
		List<EmployeeBean> employeeResults = service.search(employeId);
		if(result>0) {
			model2.setViewName("SucessPage");
			model2.addObject("employeeId", employeId);
		}else {
			model2.setViewName("userupdate");
			model2.addObject("employeeId",employeId);
			model2.addObject("employeeIdObj", employeeResults);
		}
		return model2 ;
	}
	
	@RequestMapping(value = "ManagerEmpData")
	public ModelAndView managerData(HttpServletRequest request,HttpServletResponse response) {
		
		ModelAndView model = new ModelAndView();
		String employeeId = request.getQueryString();
		List<EmployeeBean> managerResults = service.search(employeeId);
		model.setViewName("ViewManagerEmpData");
		model.addObject("ManagerData", managerResults);
		return model;
	}
	
	@RequestMapping(value = "ResponseDataStatus")
	public ModelAndView responseData(@ModelAttribute("responseFormData") RequestBean requestBean) {
		
		ModelAndView modelAndView = new ModelAndView();
		String status = requestBean.getStatus();
		if(status == "closed") {
			int reqClose = service.closeStatus(requestBean);
			List<RequestBean> response2 = service.responseRequestData();
			if(reqClose>0) {
				modelAndView.setViewName("ResponseApproved");
				modelAndView.addObject("responseList",response2);
			}else {
				modelAndView.setViewName("ResponseApproved");
				modelAndView.addObject("responseList",response2);
			}
		}else {
			int reqResponse = service.responseUpdate(requestBean);
			List<RequestBean> response3 = service.responseRequestData();
			if(reqResponse>0) {
				modelAndView.setViewName("ResponseApproved");
				modelAndView.addObject("responseList",response3);
			}else {
				modelAndView.setViewName("ResponseApproved");
				modelAndView.addObject("responseList",response3);
			}
		}
		return modelAndView;
	}
		public ModelAndView searchEmployee(@ModelAttribute("searchparam") String param) {
		ModelAndView modelAndViewRef = new ModelAndView();
		List<EmployeeBean> listofEmployees=null;
		if(param==null||(param!=null && param.isEmpty())) {
			listofEmployees=service.listOfAllEmployees();
		}else {
			listofEmployees=service.searchEmployees(param);
		}
		modelAndViewRef.setViewName("Search");
		modelAndViewRef.addObject("AllEmployees",listofEmployees);
		return modelAndViewRef;
		
	}

}
