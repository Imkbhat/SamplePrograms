package com.bob.hms.admin.common.pract;

import java.io.Serializable;

public class StudentSerialzation implements Serializable {
	
	private String rollNum;
	private String name;
	private int age;
	private transient String address;
	private transient String height;
	
	public String getRollNum() {
		return rollNum;
	}
	public void setRollNum(String rollNum) {
		this.rollNum = rollNum;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getHeight() {
		return height;
	}
	public void setHeight(String height) {
		this.height = height;
	}
	public StudentSerialzation(String rollNum, String name, int age, String address, String height) {
		this.rollNum = rollNum;
		this.name = name;
		this.age = age;
		this.address = address;
		this.height = height;
	}
}
