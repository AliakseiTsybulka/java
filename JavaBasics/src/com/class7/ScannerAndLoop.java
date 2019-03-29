package com.class7;
import java.util.Scanner;
public class ScannerAndLoop {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String name;
		int a=3;	
		do {
			System.out.println("Enter your name:");
			name=scan.nextLine();
			System.out.println("You are doing great "+name);
			a--;
		}while (a>0);
	}
}
