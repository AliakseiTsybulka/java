package com.class4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PracticeTolik {

	public static void main(String[] args) throws IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter your name and age:");
        
        String myName = input.readLine();
        String myAge = input.readLine();
        int myAge1 = Integer.parseInt(myAge);
        
        
        System.out.println(myName);
        System.out.println(myAge1);
	}
}
