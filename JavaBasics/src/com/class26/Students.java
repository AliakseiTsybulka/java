package com.class26;

public class Students {

	String fullName;
	int age;
	
	//this is used to differentiate b/w local and instance variables
	public Students(String fullName, int age) {
		this.fullName=fullName;
		this.age=age;
	}
	
	public void displayDetails() {
		System.out.println("Student full name is "+fullName+" and age="+age);
	}
	
	public static void main(String[] args) {
		
		Students obj=new Students("John Snow", 30);
		obj.displayDetails();
	}
}