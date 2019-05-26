package com.class19;


class Main {
	public Main() {
		
	}
	public static String mixString(String s1, String s2)
	{
		String result="";
	for (int i=0;i<s1.length();i++) {
	result=result+s1.charAt(i)+s2.charAt(i);}
	return result;
	}
	//test case below (dont change):
	public static void main(String[] args){
		System.out.println(mixString("12345","abcde")); //should be 1a2b3c4d5e
		System.out.println(mixString("howdy","hello")); //should be hhoewldlyo
	}
}