package com.class3;

public class RelationOperators {

	public static void main(String[] args) {
		int a = 198;
		int b = 501;
		boolean result = a>b;
		boolean result1 = a==b;
		
		System.out.println(result);
		System.out.println(result1);
		if (a==b) {
			System.out.println("a is smaller than b");
		} else {
			System.out.println("b is smaller than a");
		}
		
		double shoesPrice = 29.99;
		double allowedPrice=31.99;
        if (shoesPrice<=allowedPrice) {
            System.out.println("I am buying those shoes");
        }else {
            System.out.println("I am buying NOT those shoes");
        }
        System.out.println("I am continue code");
        System.out.println("I am continue code");
        System.out.println("I am continue code");
		
	}
}
