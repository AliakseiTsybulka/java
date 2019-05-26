package com.class26;

public class SuperWithConstructor {

	SuperWithConstructor() {
		System.out.println("I am a parent class constructor");
	}
	SuperWithConstructor(String str) {
		System.out.println("I am a parent class constructor with 1 parameter");
	}
	
}

class ChildOfSuperWithConstructor extends SuperWithConstructor {
	
	ChildOfSuperWithConstructor() {
		super("Hello");
		System.out.println("I am a child class constructor");
	}
}