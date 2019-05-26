package com.class17;

public class Task3 {
	void check(String str) {
		String empty="";
		for (int a=str.length()-1;a>=0;a--) {
		empty+=str.charAt(a);}
		if (str.equalsIgnoreCase(empty)) {
			System.out.println("This is palindrome");
		}	else {
			System.out.println("This is not palindrome");
		}	
}
	public static void main(String[] args) {
		Task3 obj=new Task3();
		obj.check("hannah");
	}
}