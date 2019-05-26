package com.class31;
import java.util.Iterator;
import java.util.ArrayList;

public class Cars {
	public static void main(String[] args) {
		ArrayList<String> cars = new ArrayList<String>();
		cars.add("audi");
		cars.add("bmw");
		cars.add("mercedes");
		cars.add("toyota");
		cars.add("ford");
		
		for (int i=0; i<cars.size(); i++) {
			System.out.println(cars.get(i));
		}
		System.out.println("---------------------------------------------");
		for (Object obj: cars) {
			System.out.println(obj);
		}
		System.out.println("---------------------------------------------");
		Iterator<String> it=cars.iterator();
		while(it.hasNext()) {
			String car=it.next();
			System.out.println(car);
		}
		System.out.println("---------------------------------------------");
		int c=0;
		while(cars.size()>c) {
			String str=cars.get(c);
			System.out.println(str);
			c++;
		}
	}
}
/*
1.Create an arraylist of cars and retrieve all the values using 4 different ways.
*/