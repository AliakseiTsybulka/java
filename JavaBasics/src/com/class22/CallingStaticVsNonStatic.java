package com.class22;

public class CallingStaticVsNonStatic {
public static void main(String[] args) {
		
		StaticVsNonStatic obj=new StaticVsNonStatic();
		//accessing non static members
		System.out.println(obj.name);
		obj.getInfo();
		//access static members by using className they belong to
		System.out.println(StaticVsNonStatic.lastName);
		StaticVsNonStatic.getInfo1();
	}
}