package com.hrm.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ModuleController {
	@RequestMapping(value="openingIndexPage")
	public String openIndexPage() {
		String viewpage="index";
		return viewpage;
	}
	@RequestMapping(value="openingAboutUs")
	public String openAboutUs() {
		String viewpages="Aboutus";
		return viewpages;
	}
	@RequestMapping(value="openingEmployeeRegistration")
	public String openEmployeeRegistration() {
		String viewpages="EmployeeRegistration";
		return viewpages;
	}
	@RequestMapping(value="openingEmployeeViewDirection")
	public String openEmployeeViewDirection() {
		String viewpages="EmployeeViewDirection";
		return viewpages;
	}
	@RequestMapping(value="openingLoginPage")
	public String openLoginPage() {
		String viewpages="Login";
		return viewpages;
	}
	@RequestMapping(value="openingUserUpdate")
	public String openUserUpdate() {
		String viewpages="userupdate";
		return viewpages;
	}

	/*
	 * @RequestMapping(value="openingUpdateProfile") public String
	 * openUpdateProfile() { String viewpages="UpdateProfile"; return viewpages; }
	 */
	@RequestMapping(value="openingPaySlip")
	public String openPaySlip() {
		String viewpages="Payslip";
		return viewpages;
	}
	@RequestMapping(value="openingCreateRequest")
	public String openCreateRequest() {
		String viewpages="CreateRequest";
		return viewpages;
	}
	@RequestMapping(value="openinguserPage")
	public String openuserPage() {
		String viewpages="user";
		return viewpages;
	}
	@RequestMapping(value="openingEmployeeView")
	public String openEmployeeView() {
		String viewpages="EmployeeView";
		return viewpages;
	}
	@RequestMapping(value="openingSingleEmployeeView")
	public String openSingleEmployeeView() {
		String viewpages="SingleEmployeeView";
		return viewpages;
	}
	@RequestMapping(value="openingViewManagerEmpData")
	public String openViewManagerEmpData() {
		String viewpages="ViewManagerEmpData";
		return viewpages;
	}

	/*
	 * @RequestMapping(value="openingResponseApproved") public String
	 * openResponseApproved() { String viewpages="ResponseApproved"; return
	 * viewpages; }
	 */
	@RequestMapping(value="openingSearchEmployeeView")
	public String openSearchEmployeeView() {
		String viewpages="SearchEmployeeView";
		return viewpages;
	}
	@RequestMapping(value="openingHomePage")
	public String openHomePage() {
		String viewpages="Home";
		return viewpages;
	}
	@RequestMapping(value="openinglogout")
	public String openlogout() {
		String viewpages="logout";
		return viewpages;
	}
	@RequestMapping(value="openingsearchemployeeajax")
	public String opensearchemployeeajax() {
		String viewpages="searchemployeeajax";
		return viewpages;
	}

}
