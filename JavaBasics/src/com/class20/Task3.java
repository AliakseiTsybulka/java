package com.class20;
/*Create a method that will take a string and return array of words from that string. 
 * Method should be available only within same class.*/
public class Task3 {
private String[] getWordsFromString (String s) {
	String arr[]=s.split(" ");
	return arr;
}
	public static void main(String[] args) {
		Task3 obj = new Task3();
		String[] array=obj.getWordsFromString("Hello to all syntax people");
		for (String a:array)
			System.out.println(a);
	}

}
