package com.spring.web.mvc.AirlineProjectJava20.controller;

import java.util.*;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.spring.web.mvc.AirlineProjectJava20.Service.Service;
import com.spring.web.mvc.AirlineProjectJava20.bean.Flightbean;
import com.spring.web.mvc.AirlineProjectJava20.bean.Loginbean;
import com.spring.web.mvc.AirlineProjectJava20.bean.Ticketbookingbean;

@Controller
public class ServiceController {
	@Autowired
	Service service;
@RequestMapping(value = "UserLoginRequest",method = RequestMethod.POST)
public ModelAndView readLogin(@ModelAttribute("UserObj")Loginbean lb) {
	
	//String result = null;
	ModelAndView mav = new ModelAndView();
	String name = lb.getName();
	String password = lb.getPassword();
	boolean flag = service.Logindetails(name,password);
	if(flag) {
		mav.setViewName("Loginsuccess");
		mav.addObject("insertresponsevalue",flag);
		
	}else {
		mav.setViewName("Loginfail");
	}
	return mav;
}

@RequestMapping(value = "UserRegisterRequest",method = RequestMethod.GET)
public ModelAndView readRegister(@ModelAttribute("Userregister")Loginbean lb) {
	
	String result = "";
	ModelAndView mav = new ModelAndView();
	result = service.SignUp(lb);
	List<Loginbean> al = new ArrayList<Loginbean>();
	if(result!="") {
		mav.setViewName("Registersuccess");
		mav.addObject("insertregisteration",result);
	}else {
		mav.setViewName("Registerfail");
	}
	return mav;
}

@RequestMapping(value = "SearchFlightRequest",method = RequestMethod.GET)
public ModelAndView readFlight(@ModelAttribute("FlightObj")Flightbean lb) {
	
	List<Flightbean> result = null;
	ModelAndView mav = new ModelAndView();
	String from = lb.getFromcity();
	String to = lb.getTocity();
	result = service.Flightsearch(from,to);
	result.stream().forEach(bean->System.out.println(bean));
	if(result!=null) {
		mav.setViewName("Bookflight");
		mav.addObject("flightresponse",result);
				
	}else {
		mav.setViewName("Registerfail");
	}
	return mav;
}
@RequestMapping(value = "AdminFlight",method = RequestMethod.POST)
public ModelAndView readAdmin(@ModelAttribute("AdminObj")Flightbean lb) {
	
	String result = "";
	ModelAndView mav = new ModelAndView();
	result = service.Admin(lb);

	if(result!="") {
		mav.setViewName("success");
	
	}else {
		mav.setViewName("Registerfail");
	}
	return mav;
}
@RequestMapping(value = "UserBookingRequest",method = RequestMethod.GET)
public ModelAndView readUserBooking(@ModelAttribute("BookObj")Ticketbookingbean lb) {
	
	List<Ticketbookingbean> result = null;
	ModelAndView mav = new ModelAndView();
	result = service.ticketBooking(lb);
	
	if(result!=null) {
		mav.setViewName("ViewBookedTicket");
		mav.addObject("bookingdetails",result);
	}else {
		mav.setViewName("Registerfail");
	}
	return mav;
}

@RequestMapping(value = "UserCancelRequest",method = RequestMethod.GET)
public ModelAndView readUserCancel(@ModelAttribute("CancelObj")Ticketbookingbean lb) {
	
	List<Ticketbookingbean> result = null;
	ModelAndView mav = new ModelAndView();
	
	result = service.cancelBooking(lb);
	
	if(result!=null) {
		mav.setViewName("ViewCancelDetails");
		mav.addObject("ticketcancel",result);
	}else {
		mav.setViewName("Registerfail");
	}
	return mav;
}

@RequestMapping(value = "AirlineDetailsRequest",method = RequestMethod.GET)
public ModelAndView readAirline(@ModelAttribute("AirlineObj")Flightbean lb) {
	
	List<Flightbean> result = null;
	ModelAndView mav = new ModelAndView();
	String name=lb.getAirlines();
	result = service.airlineDetails(lb);
	
	if(result!=null) {
		mav.setViewName("airlinesdetails");
		mav.addObject("airlineresponse",result);
		mav.addObject("airline",name);
	}else {
		mav.setViewName("Registerfail");
	}
	return mav;
}

}
