package com.class20;
/*Create a method that will take a String and return whether String is palindrome or not. 
 * Method should available to all classes within your projects.*/
public class Task2 {
public boolean isPalindrome(String s) {
	boolean palindrome=false;
	String pal="";
	for (int i=s.length()-1;i>=0;i--) {
		pal+=s.charAt(i);}
	if (s.equalsIgnoreCase(pal)) {
		palindrome=true;}
	return palindrome;
}
	public static void main(String[] args) {
		Task2 output = new Task2();
		System.out.println(output.isPalindrome("hannah"));
	}

}
