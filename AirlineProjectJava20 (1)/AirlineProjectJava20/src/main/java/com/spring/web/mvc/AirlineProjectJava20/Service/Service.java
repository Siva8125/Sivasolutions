package com.spring.web.mvc.AirlineProjectJava20.Service;

import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import com.spring.web.mvc.AirlineProjectJava20.bean.Flightbean;
import com.spring.web.mvc.AirlineProjectJava20.bean.Loginbean;
import com.spring.web.mvc.AirlineProjectJava20.bean.Ticketbookingbean;

@Component
public interface Service {
@Bean
	public String SignUp(Loginbean loginbean);
	
	public boolean Logindetails(String name , String password);
	
	public String Admin(Flightbean loginbean);
	public List<Flightbean> Flightsearch(String from,String to);

	public List<Ticketbookingbean> ticketBooking(Ticketbookingbean lb);
	public List<Ticketbookingbean> cancelBooking(Ticketbookingbean lb);
	public List<Flightbean> airlineDetails(Flightbean fb );

}

