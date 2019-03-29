package com.class5;
import java.util.Scanner;
public class Task1 {
	public static void main(String[] args) {
		int height;
        
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter your height in inches");
        height=scan.nextInt();
        
        if (height>0 && height<60) {
            System.out.println("You are a short");
        }else if(height>=60 && height<72) {
            System.out.println("You are a medium");
        }else if(height>=72) {
        	System.out.println("You are tall");
	}
	}
}
