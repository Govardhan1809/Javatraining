package com.consumer.Consumer.model;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="User")
public class UserData {
	
	@Id
	@GeneratedValue
	private int id;
	private String name;
	private String email;
	private String address;
	private String jobrole;
	private Date Fromdate;
	private Date Todate;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getJobrole() {
		return jobrole;
	}
	public void setJobrole(String jobrole) {
		this.jobrole = jobrole;
	}
	public Date getFromdate() {
		return Fromdate;
	}
	public void setFromdate(Date fromdate) {
		Fromdate = fromdate;
	}
	public Date getTodate() {
		return Todate;
	}
	public void setTodate(Date todate) {
		Todate = todate;
	}
	public UserData(int id, String name, String email, String address, String jobrole, Date fromdate, Date todate) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.address = address;
		this.jobrole = jobrole;
		Fromdate = fromdate;
		Todate = todate;
	}
	public UserData() {
		//super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	

}
