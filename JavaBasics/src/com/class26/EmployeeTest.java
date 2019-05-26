package com.class26;

public class EmployeeTest {

	public static void main(String[] args) {
		Tester tester=new Tester("John", "Snow",105000);
		
		tester.displayDetails();
		
		Tester tester2=new Tester("Mehmet", "Yuser",110000);
		
		tester2.displayDetails();
	}
}