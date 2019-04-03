package com.class14;
public class Task {
	public static void main(String[] args) {
		String str="Weekend is too short";
		String result=str.replace(" ", "");
		System.out.println(result);
		
		String str1 ="alex.tsybulka@gmail.com 1$ mY Em@1L";
		String result1=str1.replaceAll("[A-Za-z 0-9]","");
		System.out.println(result1.length());
		
		String a= "Is it saturday! Is it raining! Do we have a Java Class today?";
		String[] array = a.split("!");
		System.out.println(array.length);
	}
}