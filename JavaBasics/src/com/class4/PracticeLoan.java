package com.class4;
import java.util.Scanner;
class PracticeLoan {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int amount;
	System.out.println("Please enter the requested amount");
	amount = scan.nextInt();
	if (amount<200000) {
		System.out.println("Congratulations! We will give you the money!");
	}else {
		System.out.println("Sorry! We are not able to help you.");
	}
}
}