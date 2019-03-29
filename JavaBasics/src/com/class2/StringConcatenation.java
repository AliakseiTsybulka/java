package com.class2;

public class StringConcatenation {

	public static void main(String[] args) {
		String name = " John";
		// My name is John;
		System.out.println("My name is" + name);
		String day = "Sunday";
		// Sunday is a coding day
		System.out.println(day + " is a coding day");
		// -------------------------------
		int num1 = 12;
		int num2 = 13;
		// The value of num1 is ____ and the value of num2 is ___ .
		System.out.println("The value of num1 is " + num1 + " and value of num2 is " + num2 + ".");
		//String name = "John";
		String lastName = "Smith";
		char grade = 'B';
		String city = "Fairfax";
		String state = "VA";
		long phoneNumber = 9234567890l;
		/*
		 * Print:My name is ___ and my last name is ____I am ___ studentI live in city
		 * of ___ in a state of ___My phone number is _____
		 */
		System.out.println("My name is "+name+" and my last name is "+lastName+". I am "+grade+" student.");
		System.out.println("I live in the city of "+city+" in a state of "+state+". My phone number is "+phoneNumber);
	}
}