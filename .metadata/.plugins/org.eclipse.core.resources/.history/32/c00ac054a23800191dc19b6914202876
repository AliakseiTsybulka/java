package com.class4;
import java.util.Scanner;
public class Task2 {

	public static void main(String[] args) {
		/* Write a program to ask user to enter numbers of worked years and annual salary. 
		 * If user worked for more or equals to 5 years than user is eligible for the bonus,
		 *  otherwise he is not.
		 *  Once user is eligible and salary is larger than 50000 than bonus = 5000,
		 *   otherwise bonus=3000.
		 */
		Scanner scan = new Scanner(System.in);
		int years, salary,bonus1,bonus2;
		bonus1 = 5000;
		bonus2 = 3000;
		System.out.println("Please enter how many years you worked here");
		years = scan.nextInt();
		System.out.println("Please enter your annual salary");
		salary = scan.nextInt();
		if (years>=5) {
			System.out.println("Congratulations! You will have a bonus to your salary");
			if (salary>50000) {
				System.out.println("The amount of bonus is "+bonus1);
			}else {
				System.out.println("The amount of bonus is "+bonus2);
			}
		}else {
			System.out.println("After 5 years of work in our company you will receive a bonus.");
		}
	}

}
