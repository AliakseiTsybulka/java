package com.class2;

public class VariableChange {

	public static void main(String[] args) {
		String name = "Jane";
		String lastName = "Smith";
		System.out.println(name);
		System.out.println(lastName);
		lastName = "Johson";
		char grade = 'B';
		// char grade='A'; do not work grade = 'A';
		// creating a variable & assigning the value
		System.out.println(grade);
		String city = "Fairfax";
		// printing value of city
		System.out.println(city);
		// changing value of city from Fairfax to NY
		city = "New York";
		System.out.println(lastName);
		System.out.println(city);
		}
		}