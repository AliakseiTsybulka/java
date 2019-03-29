package com.class10;

public class Task2 {

	public static void main(String[] args) {
		// Create an array of names and store all names of your group. Then print your name from that array. (use 2 different ways of creating an array).
		String[] names=new String[5];
		names[0]="Dzianis";
		names[1]="Vital";
		names[2]="Mr.Lepinskyi";
		names[3]="Aliaksei";
		names[4]="Toly";
		System.out.println(names[3]);
		
		String[] newNames= new String [] {"Dzianis","Vital","Mr.Lepinskyi","Aliaksei","Toly"};
		System.out.println(newNames[3]);
	}

}
