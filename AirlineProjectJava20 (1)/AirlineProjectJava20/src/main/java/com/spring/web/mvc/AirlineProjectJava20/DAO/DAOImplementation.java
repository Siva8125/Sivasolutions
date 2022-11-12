package com.spring.web.mvc.AirlineProjectJava20.DAO;

import org.hibernate.Session;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import java.*;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import javax.transaction.Transactional;

import com.spring.web.mvc.AirlineProjectJava20.bean.Flightbean;
import com.spring.web.mvc.AirlineProjectJava20.bean.Loginbean;
import com.spring.web.mvc.AirlineProjectJava20.bean.Ticketbookingbean;



public class DAOImplementation implements DAO {
	@Autowired
	SessionFactory sessionfactory;
//LoginPage
	@Override
	public boolean logindetails(String name, String password) {
		boolean login=false;
		Session session =sessionfactory.openSession();
		//Query query=session.createQuery("from airline Loginbean where Loginbean.name='"+name+"' and Loginbean.password='"+password+"'");
	Query query=session.createQuery(" from Loginbean where name=:name and password=:password");
	query.setParameter("name",name);
	query.setParameter("password",password);
		Loginbean beanl = (Loginbean) query.uniqueResult();
		if(beanl == null) {
			login = false;
		}else {
			login = true;
		}

		return login;
		
	}
//Registration
	public String SignUp(Loginbean LB) {
		String result="";
		Session session=sessionfactory.openSession();
		
		Object obj=session.save(LB);
		Transaction trans=session.beginTransaction();
		trans.commit();
		if(obj!=null) {
			result=(String) obj;
		}
		return result;
	}
//Search Ticket
	public String Searchticket(Loginbean LB) {
		
		String result="";
		Session session=sessionfactory.openSession();
		Object obj=session.createQuery("from airline TicketBooking where TicketBooking.TicketNumber='"+LB+"'");
		if(obj!=null) {
			result=(String) obj;
		}
		return result;
	}
//Cancel Ticket
	public String Cancelticket(String ticketnumber) {
		String result="";
		Session session=sessionfactory.openSession();
		Object obj = session.createQuery("Upadte airline TicketBooking set TicketBooking.Status=Cancel where TicketBoking.TicketNumber='"+ticketnumber+"'");
		if(obj!=null) {
			result=(String) obj;
		}
		return result;
	}
@Override
public List<Flightbean> Flightsearch(String from,String to) {
	List<Flightbean> result=null;
	Session session=sessionfactory.openSession();
	Query query=session.createQuery("from Flightbean f where f.fromcity='"+from+ "' and f.tocity='"+to+"'");
	
//	  ((javax.persistence.Query) query).setParameter("name",name);
//	  ((javax.persistence.Query) query).setParameter("password",password);	
	
	if(query != null) {
		result =query.list();
	}
	
	return result;
}
public String Admin(Flightbean loginbean) {
	String result="";
	Session session=sessionfactory.openSession();
	
	Object obj=session.save(loginbean);
	Transaction trans=session.beginTransaction();
	trans.commit();
	if(obj!=null) {
		result=(String) obj;
	}
	return result;
}
@Override
public List<Ticketbookingbean> ticketBooking(Ticketbookingbean lb) {
	
	
	List<Ticketbookingbean> result=null;
	
	
	Session session=sessionfactory.openSession();
	Object obj=session.save(lb);
	Transaction trans=session.beginTransaction();
	trans.commit();
	
	if(obj==null) {
	return	result; 
	}
	
	int name=lb.getTicketno();
	Session session1=sessionfactory.openSession();
	Query query=session1.createQuery("from Ticketbookingbean f where f.ticketno='"+name+ "'");

	if(query != null) {
		result =query.list();
	}
	return result;
}
  
public List<Ticketbookingbean> cancelBooking(Ticketbookingbean lb) {
	
	
	List<Ticketbookingbean> result=null;
	
//	Random r=new Random();
//	int t=r.nextInt(1000);
//	lb.setTicketno(t);
//	Session session=sessionfactory.openSession();
//	Object obj=session.save(lb);
//	Transaction trans=session.beginTransaction();
//	trans.commit();
//	
//	if(obj==null) {
//	return	result; 
//	}
	
	int name=lb.getTicketno();
	Session session1=sessionfactory.openSession();
	Query query=session1.createQuery("from Ticketbookingbean f where f.ticketno='"+name+ "'");
	if(query != null)
	 {
	result =query.list();
}
	Session session=sessionfactory.openSession();
	Query query1=session.createQuery("delete from Ticketbookingbean f where f.ticketno='"+name+ "'");
	Transaction trans=session.beginTransaction();
	int res=query1.executeUpdate();

	trans.commit();
	
    if(res==0) {
    	return null;
    }
	return result;

}
@Override
public List<Flightbean> airlineDetails(Flightbean fb) {
	
	List<Flightbean> result=null;
	String name=fb.getAirlines();
	Session session=sessionfactory.openSession();
	Query query=session.createQuery("from Flightbean f where f.airlines='"+name+ "'");
	
//	  ((javax.persistence.Query) query).setParameter("name",name);
//	  ((javax.persistence.Query) query).setParameter("password",password);	
	
	if(query != null) {
		result =query.list();
	}
	
	return result;
}

}


