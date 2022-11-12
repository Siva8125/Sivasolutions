package com.spring.web.mvc.AirlineProjectJava20.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity 
@Table(name= "Loginbean")
public class Loginbean {
@Id 
@Column(name = "name")
private String name;
@Column(name = "password")
private String password;
@Column(name = "mobileno")
private long mobile;
@Column(name= "idproof")
private String idproof;
@Column(name= "idproofno")
private String idproofno;


public String getIdproofno() {
	return idproofno;
}
public void setIdproofno(String idproofno) {
	this.idproofno = idproofno;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public long getMobile() {
	return mobile;
}
public void setMobile(long mobile) {
	this.mobile = mobile;
}
public String getIdproof() {
	return idproof;
}
public void setIdproof(String idproof) {
	this.idproof = idproof;
}

}
