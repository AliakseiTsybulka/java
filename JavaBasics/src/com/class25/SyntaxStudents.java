package com.class25;

public class SyntaxStudents extends Students {

	public void study() {
		System.out.println("Students must study HARD");
	}
	protected void doHomeWork() {
		System.out.println("Students must do REPL");
	}
	void attendClasses() {
		System.out.println("Students must ALL attend classes");
	}
	//can't be achieved because it's private
	private void doResearch() {
		System.out.println("Students must do make uncle Google as a BEST FRIEND");
	}
}
