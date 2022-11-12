package com.spring.web.mvc.AirlineProjectJava20.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "flight")
public class Flightbean {
	@Id
	@Column(name = "fromcity")
	private String fromcity;
	@Column(name = "tocity")
	private String tocity;
	@Column(name = "flightname")
	private String flightname;
	@Column(name = "airlines")
	private String airlines;
	@Column(name = "price")
	private String price;

	
	
	
	
	
	public String getFromcity() {
		return fromcity;
	}

	public void setFromcity(String fromcity) {
		this.fromcity = fromcity;
	}

	public String getTocity() {
		return tocity;
	}

	public void setTocity(String tocity) {
		this.tocity = tocity;
	}

	
	

	public String getFlightname() {
		return flightname;
	}

	public void setFlightname(String flightname) {
		this.flightname = flightname;
	}

	public String getAirlines() {
		return airlines;
	}

	public void setAirlines(String airlines) {
		this.airlines = airlines;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Flightbean [fromcity=" + fromcity + ", tocity=" + tocity + ", flightname=" + flightname + ", airlines="
				+ airlines + ", price=" + price + "]";
	}
	
	

}
