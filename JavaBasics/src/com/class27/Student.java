package com.class27;

public class Student {
String name, address;
Student(String name, String address) {
	this.name=name;
	this.address=address;
}
void displayInfo() {
	System.out.println(name+" "+address);
}
public static void main(String[] args) {
	Student obj = new Student("Alex", "255 Bay Ridge");
	obj.displayInfo();
}
}
/*
1. Write program as a student class   that has instance variables name and address. 
Create a constructor that will initialize those variables. 
Print name & address of given  student by the displayInfo method.
2. Write program: user class  has a constructor that takes name and mobile number. 
Extend this class  by userInfo that will have user address variable. 
Print users name, mobile number and address in userDetails method. Test your code. (edited) 
*/