package com.class20;

public class TestAccessModifiers {

	public static void main(String[] args) {
		
		AccessModifiers obj=new AccessModifiers();
		obj.isPalindrome("madam");//accessing public method within same package
		obj.reverseString("hello");//accessing protected method within same package
		obj.sayHello();//accessing default method within same package
		//obj.getWordsFromString("Hello Students"); private method is not accessible
		
		System.out.println(obj.name1);//accessing default variable within same package
		System.out.println(obj.name2);//accessing protected variable within same package
		System.out.println(obj.name3);//accessing public variable within same package
	}
}