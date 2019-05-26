package com.class22;
/*Write a program that will have a constructor: 
 * one with parameters and second without any parameters. 
 * Create a separate Test class 
 * where you will execute both of the constructors.*/
public class Task {
public int numberOfDay;
public String dayOfWeek;
		public Task() {
			System.out.println("I'm a default constructor");
		}	
		public Task(int day, String name) {
			System.out.println("I'm a parametrized constructor");
			numberOfDay=day;
			dayOfWeek=name;
		}
		public void saying() {
			String result = "It's a "+numberOfDay+" day of week which is "+dayOfWeek;
			System.out.println(result);
		}
}