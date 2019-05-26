package com.class20;
/*Create a method that will take 1 parameter as a String and return reversed String. 
 * Method should be visibly only within same package.*/
public class Task1 {
	static String result="";
	protected String returnString(String s) {
		for (int i=s.length()-1;i>=0;i--) {
		result+=s.charAt(i);}
		return result;
	}
	public static void main(String[] args) {
		Task1 output = new Task1();
		output.returnString("online students");
		System.out.println(result);
	}

}
