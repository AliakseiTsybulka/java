package com.class21;

public class Employee {
public static String CEO="Sumair";
int eID, salary;
	public static void main(String[] args) {
		Employee obj1 = new Employee();
		Employee obj2 = new Employee();
		obj1.eID = 50789;
		obj1.salary=70000;
		obj2.eID=201090;
		obj2.salary=69000;
		obj1.print();
		obj2.print();
	}
	void print() {
		System.out.println(CEO+" is CEO. "+"Employee ID is: "+eID+" and salary is "+salary);
	}
}
