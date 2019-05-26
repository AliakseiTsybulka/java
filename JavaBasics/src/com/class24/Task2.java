package com.class24;

public class Task2 {
	static String task(String s) {
	String output = "I am overloaded by ";
	return output+s;
	}
	static String task(int a) {
		String output = "I am overloaded by ";
		return output+a;
		}
	static String task(String s, int a) {
		String output = "I am overloaded by ";
		return output+a+s;
		}
public static void main(String[] args) {
		System.out.println(Task2.task("String"));
		System.out.println(Task2.task("12345"));
		System.out.println(Task2.task("String",12345));
}
}
