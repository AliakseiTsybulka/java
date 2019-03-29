package com.class5;
import java.util.Scanner;
public class HomeWork1 {
	public static void main(String[] args) {
		// Write a program to find largest of three double values using if-else..if
		//provided by a user (numbers must bedistinct)
		double a,b,c;
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter first double number: ");
		a=scan.nextDouble();
		System.out.println("Please enter second double number: ");
		b=scan.nextDouble();
		System.out.println("Please enter third double number: ");
		c=scan.nextDouble();
		if (a>b&&a>c) {
			System.out.println("The largest number is "+a);
		}else if (b>a&&b>c) {
			System.out.println("The largest number is: "+b);
		}else {
			System.out.println("The largest number is: "+c);
		}
	}

}
