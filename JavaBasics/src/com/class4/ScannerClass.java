package com.class4;

import java.util.Scanner;

public class ScannerClass {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Enter your name");
	String name = input.nextLine();
	System.out.println(name+" you will become a QA engineer");
}
}