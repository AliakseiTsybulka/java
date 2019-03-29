package com.class4;

import java.util.Scanner;

public class ScannerAndIf {

	private static Scanner scan;

	public static void main(String[] args) {
		int num1, num2;
		scan = new Scanner(System.in);
		System.out.println("Please enter first number");
		num1 = scan.nextInt();
		System.out.println("Please enter second  number");
		num2 = scan.nextInt();
		if (num1>num2) {
			System.out.println(num1+" is larger than "+num2);
		}else if(num2>num1) {
			System.out.println(num1+" is smaller than "+num2);
		}else {
			System.out.println("The numbers are equal");
		}
		System.out.println("I am done");
	}
}