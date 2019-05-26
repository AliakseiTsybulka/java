package com.class30;

import java.util.ArrayList;

public class Task {
public static void main(String[] args) {
	ArrayList <String> names = new ArrayList <String>();
	names.add("dzianis");
	names.add("alex");
	names.add("max");
	names.add("valery");
	names.add("mouse");
	System.out.println("Is it empty? -" +names.isEmpty());
	
	System.out.println("Length is "+names.size());
	
	for (String str : names) {
		System.out.println(str);
	}
}
}
/*
Create a generic ArrayList that will store 5 names into it.
Find out whether the given ArrayList is empty or not?
Check whether the specific name is present in an ArrayList or not?
Find the size of your arrayList and print all values from that
*/