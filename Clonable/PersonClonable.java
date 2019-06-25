package com.bob.hms.admin.common.pract;

public class PersonClonable implements Cloneable {
	
	private String name;
	
	public PersonClonable() {

	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Object clone() throws CloneNotSupportedException {
		return (PersonClonable) super.clone();
	}
	
	
	public static void main(String[] args) {
		PersonClonable pc = new PersonClonable();
		try {
			pc.setName("Kiran");
			PersonClonable pc2 = (PersonClonable) pc.clone();
			System.out.println("Main Person Name: "+pc.getName());
			System.out.println("Cloned Person Name: "+pc2.getName());
			
			pc.setName("Bharat");
			
			System.out.println("Main Person Name After Set: "+pc.getName());
			System.out.println("Cloned Person Name After set: "+pc2.getName());
			
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}
}

/*
 * Output 
 * Main Person Name: Kiran 
 * Cloned Person Name: Kiran 
 * Main Person Name After Set: Bharat 
 * Cloned Person Name After set: Kiran
 */
//Description:
/* 
 * Does clone object and original object point to the same location in memory ??
 * The answer is no. The clone object has its own space in the memory where it
 * copies the content of the original object. That’s why when we change the
 * content of original object after cloning, the changes does not reflect in the
 * clone object.
 */

