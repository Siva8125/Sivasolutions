package com.spring.web.mvc.AirlineProjectJava20.DAO;

import java.util.*;

import com.spring.web.mvc.AirlineProjectJava20.bean.Flightbean;
import com.spring.web.mvc.AirlineProjectJava20.bean.Loginbean;
import com.spring.web.mvc.AirlineProjectJava20.bean.Ticketbookingbean;

public interface DAO {

	public String SignUp(Loginbean loginbean);
	
	public boolean logindetails(String username, String password);
	
	public String Admin(Flightbean loginbean);

	public List<Flightbean> Flightsearch(String from,String to);

	public List<Ticketbookingbean> ticketBooking(Ticketbookingbean lb);
	public List<Ticketbookingbean> cancelBooking(Ticketbookingbean lb);
	public List<Flightbean> airlineDetails(Flightbean fb );
}
