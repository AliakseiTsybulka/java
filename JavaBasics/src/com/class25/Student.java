package com.class25;

public class Student {

	public void study() {
		System.out.println("Students must study");
	}
	
	protected void doHomeWork() {
		System.out.println("Students must do homework");
	}
	
	void attendClasses(String str, int num) {
		System.out.println("Students must attend classes");
	}
	//PRIVATE METHOD CANNOT BE OVERRIDDEN
	private void doResearch() {
		System.out.println("Students must do research");
	}
}