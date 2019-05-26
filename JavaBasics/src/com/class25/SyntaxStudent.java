package com.class25;

public class SyntaxStudent extends Student{
	
//	public boolean study() { not possible
//		
//		System.out.println("Syntax students must study HARD");
//		return true;
//	}

	public void doHomeWork() {
		System.out.println("Syntax students must do REPL");
	}
	
	public void attendClasses(String str, int num) {
		System.out.println("Syntax students must attend ALL classes and take notes");
	}
	//creating child specific private method doResearch() 
	private void doResearch() {
		System.out.println("Syntax students must make uncle Google as best friend");
	}
}