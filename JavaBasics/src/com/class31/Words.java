package com.class31;
import java.util.Iterator;
import java.util.ArrayList;

public class Words {

	public static void main(String[] args) {
		ArrayList<String> words = new ArrayList<String>();
		words.add("hello");
		words.add("bye");
		words.add("have");
		words.add("nice");
		words.add("day");
		System.out.println(words);
		Iterator<String> iterator=words.iterator();
		while(iterator.hasNext()) {
			String str=iterator.next();
			if(str.contains("e")) {
				iterator.remove();
			}
		}
		System.out.println(words);
	}

}
/*

2.Create an arrayList of words. Remove every word that ends with “e”.
*/