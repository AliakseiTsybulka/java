package com.class6;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Grades {

	public static void main(String[] args) {
		/* Allow user to enter grade and then provide explanation: 
		A-Excellent, B-Good, C-Average, D-Bad, any other grade --> Not Acceptable.
		 At the end your program should print which grade was entered by a user with explanation.
*/
		Scanner scan;
		char grade;
		String expl;
		scan=new Scanner (System.in);
		System.out.println("Please enter your grade");
		grade=scan.next().charAt(0);
		switch (grade) {
			case 'A':
				expl="Excellent";
				break;
			case 'B':
				expl="Good";
				break;
			case 'C':
				expl="Average";
				break;
			case 'D':
				expl="Bad";
				break;
			default:
				expl="Not Acceptable";
				break;
		}
		System.out.println(expl);
	}
}
