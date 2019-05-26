package com.class17;

import java.util.Scanner;

public class TestClass {

	public static void main(String[] args) {
		
		//Scanner class, String
		
		String str=new String("Hello");
		
		str.isEmpty();//built-in method that comes with String class
		str.charAt(4);
		Scanner scan=new Scanner(System.in);
		
		scan.hasNextInt();
		
		//Methods are 2 types:
		//Built-in: String/Scanner class methods, --> limited & read only
		//User defined: we create them --> unlimited & modifiable
		
	}
}