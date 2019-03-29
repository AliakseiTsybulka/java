package com.class5;

public class NestedIfPractice {
	public static void main(String[] args) { 
		boolean creditCard=true;
		int balance=1000;
		if (creditCard) {
			System.out.println("Let's check the balance");
			if (balance>=1000) {
				System.out.println("Pay off now");
			}else {
				System.out.println("You are good");
			}
		}else {
			System.out.println("Do you want credit card?");
		}
	}
}