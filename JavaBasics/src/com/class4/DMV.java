package com.class4;
import java.util.Scanner;
public class DMV {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int age;
		System.out.println("Please enter your age");
		age = scan.nextInt();
		if (age>=18) {
			System.out.println("You are able to get a driver license.");
		}else {
			System.out.println("Sorry! You have to get a learner permit.");
		}
		

	}

}
