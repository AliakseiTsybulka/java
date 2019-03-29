package com.class2;

public class TaskStringConcatenation {

	public static void main(String[] args) {
		String name = "Mike";
		String lastName = "Jordan";
		char grade = 'A';
		String city = "Fairfax";
		String state = "VA";
		long phoneNumber = 1234567890l;
		// My name is ___ and my last name is ____
		System.out.println("My name is " + name + " and my last name is " + lastName);
		// I am ___ student
		System.out.println("I am " + grade + " student");
		// I live in city of ___ in a state of ___
		System.out.println("I live in city of " + city + " in a state of " + state);
		// My phone number is _____
		System.out.println("My phone number is " + phoneNumber);
		}
	}