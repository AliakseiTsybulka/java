package com.class13;
import java.util.Scanner;
public class Task {
	public static void main(String[] args) {
		/* Write a program that reads two people’s first names and if they expecting boy or girl? Based on the input suggests a name for a baby:
		Example Output:
			Mom’s first name? Mary
			Dad’s first name? Daniel
			Boy or Girl? boy
			Suggested baby name: DANRY

			Example Output:
			Mom’s first name? Mary
			Dad’s first name? Daniel
			Boy or Girl? girl
			Suggested baby name: MAIEL*/
		Scanner scan=new Scanner(System.in);
		String nameM,nameD,expSex;
		System.out.println("Mom’s first name?");
		nameM=scan.nextLine();
		System.out.println("Dad’s first name?");
		nameD=scan.nextLine();
		System.out.println("Boy or Girl?");
		expSex=scan.nextLine();
		if (expSex.equalsIgnoreCase("boy")) {
			for (int i=0;i<nameD.length()/2;i++) 
				System.out.print(nameD.charAt(i));
				for (int j=nameM.length()/2+1;j<nameM.length();j++) 
					System.out.print(nameM.charAt(j));
		} else if(expSex.equalsIgnoreCase("girl")) {
			for (int i=0;i<nameM.length()/2;i++) 
				System.out.print(nameM.charAt(i));
				for (int j=nameD.length()/2+1;j<nameD.length();j++) 
					System.out.print(nameD.charAt(j));
		}
			

	}
}