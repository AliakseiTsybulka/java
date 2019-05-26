package com.class22;

public class Child2 extends Parent{
	public static void main(String[] args) {
	Child2 obj = new Child2();
	System.out.println("Child 2 eye color "+obj.eyeColor);
	System.out.println("Child 2 hair color "+obj.hairColor);
	System.out.println("Child 2 has "+obj+" nose");
	obj.sing();
	obj.swim();
	}
	public void swim() {
		System.out.println("Child 2 can swim");
	}
}
