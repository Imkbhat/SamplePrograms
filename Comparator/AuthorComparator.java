package com.bob.hms.admin.common.pract;

//Sorting based on Second Name
public class AuthorComparator implements Comparable<AuthorComparator> {
	
	private String fname;
	private String lname;
	private int age;
	
	public AuthorComparator(String fname, String lname, int age) {
		this.fname = fname;
		this.lname = lname;
		this.age = age;
	}
	
	public String getFname() {
		return fname;
	}



	public void setFname(String fname) {
		this.fname = fname;
	}



	public String getLname() {
		return lname;
	}



	public void setLname(String lname) {
		this.lname = lname;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public int compareTo(AuthorComparator o) {
		return this.fname.compareTo(o.fname);
	}

}
