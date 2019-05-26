package com.class24;

public class Testing {
	public static void main(String[] args) {
		String a;
		a = "10";
		
		double d=12;
		
		Parent parent=new Parent();
		parent.love();
		parent.work();
		
		Child child=new Child();
		child.love();
		child.cry();
		child.work();
		
		//Child obj1=new Parent();not possible
		//type casting
		//achieving run time polymorphism
		Parent obj=new Child();
		obj.work();//Parents work
		obj.love();//Child love--common method
		//obj.cry();not accessible
	}
}