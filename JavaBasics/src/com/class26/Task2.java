package com.class26;

public class Task2 {
public static void main(String[] args) {
	Task2 obj = new Task2();
}
}
class A {
	final void display() {
		System.out.println("This is final method with no parameters");
	}
	final void display(String s) {
		System.out.println("This is final method String parameter");
	}
	final void display(int a) {
		System.out.println("This is final method int parameter");
	}
	final void display(boolean b) {
		System.out.println("This is final method boolean parameter");
	}
}

