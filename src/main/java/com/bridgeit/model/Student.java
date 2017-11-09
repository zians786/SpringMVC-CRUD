package com.bridgeit.model;

import org.springframework.stereotype.Controller;

@Controller
public class Student {
private String name,id,dept,number;

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getId() {
	return id;
}

public void setId(String id) {
	this.id = id;
}

public String getDept() {
	return dept;
}

public void setDept(String dept) {
	this.dept = dept;
}

public String getNumber() {
	return number;
}

public void setNumber(String number) {
	this.number = number;
}
}
