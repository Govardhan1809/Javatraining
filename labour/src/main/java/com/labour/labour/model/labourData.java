package com.labour.labour.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="elabour")
public class labourData {

@Id
@GeneratedValue
private int id;
private String name;
private String pancard;
private String jobrole;
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
public String getPancard() {
	return pancard;
}
public void setPancard(String pancard) {
	this.pancard = pancard;
}
public String getJobrole() {
	return jobrole;
}
public void setJobrole(String jobrole) {
	this.jobrole = jobrole;
}
public labourData(int id, String name, String pancard, String jobrole) {
	super();
	this.id = id;
	this.name = name;
	this.pancard = pancard;
	this.jobrole = jobrole;
}
public labourData() {
	super();
	// TODO Auto-generated constructor stub
}
public static labourData save(labourData data) {
	// TODO Auto-generated method stub
	return null;
}

}
