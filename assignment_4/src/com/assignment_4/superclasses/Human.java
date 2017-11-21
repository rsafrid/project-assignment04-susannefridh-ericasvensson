/**
 * @author Susanne och Erica
 * @version 1.0
 * 
 * This is one of our super class Human. Subclass is BankCustomer.
 */


package com.assignment_4.superclasses;

public class Human {
	private String name = "";
	private int age = 0;
	
	public Human(String name, int age) {
		this.name = name;
		this.age = age;
	}

	/**
	 * Här kommer getters and setters för name och age.
	 * @return name 
	 * @return age
	 */
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
	
	

}
