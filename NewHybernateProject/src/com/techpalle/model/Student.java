package com.techpalle.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Student {
@Id
@GeneratedValue

@Column(name="SID")
private int id;	
@Column(name="SNAME")
private String name;
@Column(name="COURCE")
private String cource;
public Student(String name, String cource) {
	super();
	this.name = name;
	this.cource = cource;
}
public Student(int id, String name, String cource) {
	super();
	this.id = id;
	this.name = name;
	this.cource = cource;
}
public Student() {
	super();
	// TODO Auto-generated constructor stub
}
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
public String getCource() {
	return cource;
}
public void setCource(String cource) {
	this.cource = cource;
}


}
