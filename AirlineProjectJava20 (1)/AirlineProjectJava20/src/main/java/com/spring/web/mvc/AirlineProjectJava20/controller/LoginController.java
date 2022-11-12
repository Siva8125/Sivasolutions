package com.spring.web.mvc.AirlineProjectJava20.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {
	@RequestMapping(value="loginpageopening")
	public String openLoginPage() {
	String views="Login";
	return views;
	}
	@RequestMapping(value="homepageopening")
	public String OpenHomepage() {
		String views = "home";
		return views;
	
	}
	@RequestMapping(value="searchflightpageopening")
	public String openBookingPage() {
	String views="Searchflight";
	return views;
	}
	@RequestMapping(value="registerpageopening")
	public String openRegisterPage() {
	String views="Register";
	return views;
	}
	
	@RequestMapping(value="aboutuspageopening")
	public String openAboutPage() {
	String views="AboutUs";
	return views;
	}
	@RequestMapping(value="offerspageopening")
	public String openOffersPage() {
	String views="Offers";
	return views;
	}
	@RequestMapping(value="membershippageopening")
	public String openMembershipPage() {
	String views="Membership";
	return views;
	}
	@RequestMapping(value="adminloginpageopening")
	public String openAdminLoginPage() {
	String views="AdminLogin";
	return views;
	}
	
	@RequestMapping(value="userhomepageopening")
	public String userHomePage() {
	String views="UserHome";
	return views;
	}
	@RequestMapping(value="usersearchflightopening")
	public String userSearchflightPage() {
	String views="userselectflight";
	return views;
	}
	
	@RequestMapping(value="adminpageopening")
	public String adminflightPage() {
	String views="AdminEntryForm";
	return views;
	}
	@RequestMapping(value="viewticketdetials")
	public String viewTicketPage() {
	String views="ViewBookedTicket";
	return views;
	}
	@RequestMapping(value="cancelticketdetials")
	public String cancelTicketPage() {
	String views="EnterCancelTicket";
	return views;
	}
	@RequestMapping(value="enterdetails")
	public String entryTicketDetailsPage() {
	String views="TicketDetailsEntry";
	return views;
	}
	@RequestMapping(value="airlinespage")
	public String airlineDetailsPage() {
	String views="airlinesform";
	return views;
	}
}
