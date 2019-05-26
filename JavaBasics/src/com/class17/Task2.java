package com.class17;

public class Task2 {
	void check(int a) {
		if (a%2==0) {
			System.out.println("The number is even");
		}	else {
			System.out.println("The number is odd");
		}
		}
public static void main(String[] args) {
	Task2 obj=new Task2();
	obj.check(34);
}	
}