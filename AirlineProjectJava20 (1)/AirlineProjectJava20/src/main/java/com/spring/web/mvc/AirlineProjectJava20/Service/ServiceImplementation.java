package com.spring.web.mvc.AirlineProjectJava20.Service;

import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;

import com.spring.web.mvc.AirlineProjectJava20.DAO.DAO;
import com.spring.web.mvc.AirlineProjectJava20.bean.Flightbean;
import com.spring.web.mvc.AirlineProjectJava20.bean.Loginbean;
import com.spring.web.mvc.AirlineProjectJava20.bean.Ticketbookingbean;

public class ServiceImplementation implements Service {

	@Autowired
	DAO dao;
	
	public String SignUp(Loginbean loginbean) {
		return dao.SignUp(loginbean);
	}

	public List<Flightbean> Flightsearch(String from,String to) {
		return dao.Flightsearch(from, to);
	}

	

	public boolean Logindetails(String name, String password) {
		return dao.logindetails(name, password);
	}

	@Override
	public String Admin(Flightbean loginbean) {
		
		return dao.Admin(loginbean);
	}

	@Override
	public List<Ticketbookingbean> ticketBooking(Ticketbookingbean lb) {
		Random r=new Random();
		int t=r.nextInt(1000);
		lb.setTicketno(t);
		return dao.ticketBooking(lb);
	}
	
public List<Ticketbookingbean> cancelBooking(Ticketbookingbean lb) {
		
		return dao.cancelBooking(lb);
	}

@Override
public List<Flightbean> airlineDetails(Flightbean fb) {
	
	return dao.airlineDetails(fb);
}

}
