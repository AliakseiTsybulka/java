package com.class5;

import java.util.Scanner;

public class Task2 {
	public static void main(String[] args) {
		int quiz,midTerm,finalScore;
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter your quiz score");
        quiz=scan.nextInt();
        System.out.println("Please enter your mid term score");
        midTerm=scan.nextInt();
        System.out.println("Please enter your final score");
        finalScore=scan.nextInt();
        if ((quiz+midTerm+finalScore)/3>0 && (quiz+midTerm+finalScore)/3<50) {
            System.out.println("Your grade is F");
        }else if((quiz+midTerm+finalScore)/3>=50 && (quiz+midTerm+finalScore)/3<70) {
        	System.out.println("Your grade is C");
        	
        }else if((quiz+midTerm+finalScore)/3>=70 && (quiz+midTerm+finalScore)/3<90) {
        	System.out.println("Your grade is B");
        }else if((quiz+midTerm+finalScore)/3>=90) {
        	System.out.println("Your grade is A");
}
}
}