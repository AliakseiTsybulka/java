package com.class7;
import java.util.Scanner;
public class HomeWork {
	public static void main(String[] args) {
		/* Ask user to pay for a soda
	     *keep asking user to pay for soda until entered price is not equal to 1.99
	     *after user got a write amount print "Please enjoy your soda"*/

		Scanner scan=new Scanner(System.in);
		double price,purchase=1.99,money;
		do {
		System.out.println("Please insert money for the soda");
		money=scan.nextDouble();
		price=money;
		if (purchase>price) {	
		}
		}while (price<purchase);
		System.out.println("Please enjoy your soda");
	}
}