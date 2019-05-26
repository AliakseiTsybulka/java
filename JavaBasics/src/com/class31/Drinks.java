package com.class31;
import java.util.ArrayList;
import java.util.Iterator;

public class Drinks {

	public static void main(String[] args) {
		ArrayList<String> drinks = new ArrayList<String>();
		drinks.add("cola");
		drinks.add("7up");
		drinks.add("dr.pepper");
		drinks.add("ginger ale");
		drinks.add("red bull");
		System.out.println(drinks);
		String replace = "water";
		String word;
		for (int i=0; i<drinks.size(); i++) {
			word = drinks.get(i);
			if(word.contains("e") || word.contains("a")) {
				drinks.remove(i);
				drinks.set(i, replace);
			}
		}
		System.out.println(drinks);
		
	}

}
/*
3.Create an arrayList of drinks. If any drink has letter “a” or “e” replace it with water.
*/