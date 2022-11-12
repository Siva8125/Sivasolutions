package com.spring.web.mvc.AirlineProjectJava20.bean;

	import javax.persistence.Column;
	import javax.persistence.Entity;
	import javax.persistence.GeneratedValue;
	import javax.persistence.Id;
	import javax.persistence.Table;

	@Entity
	@Table(name = "Ticketbookingbean")

	public class Ticketbookingbean {
		
	@Id
	@Column (name = "ticketno")
	private int ticketno;
	
	@Column (name = "name")
	private String name;
	
	
	@Column (name = "mailphno")
	private String mailphno;
	
	
	
	@Column (name = "idProofno")
	private String idproofno;
	
	@Column (name = "age")
	private int age;
	
	
	
	@Column (name = "gender")
	private String gender;



	public int getTicketno() {
		return ticketno;
	}



	public void setTicketno(int ticketno) {
		this.ticketno = ticketno;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getMailphno() {
		return mailphno;
	}



	public void setMailphno(String mailphno) {
		this.mailphno = mailphno;
	}



	public String getIdproofno() {
		return idproofno;
	}



	public void setIdproofno(String idproofno) {
		this.idproofno = idproofno;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	public String getGender() {
		return gender;
	}



	public void setGender(String gender) {
		this.gender = gender;
	}
	
	
	

}

