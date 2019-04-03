package com.class14;

public class StringManipulations1 {

	public static void main(String[] args) {
		String str= "Today is java class";
		String reverse="";
		for (int i=str.length()-1;i>=0;i--) {
		reverse+=str.substring(i,i+1);
		}
		System.out.println(reverse);
		//2 replaceAll() - will replace all that matches specified pattern[regex];
		
				String str1="12Hello 3234 World 465%^%";
				String replacedNoNumbers=str1.replaceAll("[0-9]", "");
				System.out.println(replacedNoNumbers);
				
				String newString=replacedNoNumbers.replaceAll("[^A-Z a-z]", "");
				System.out.println(newString);
				
//				String replacedNoCharacter=replacedNoNumbers.replaceAll("[A-Za-z]", "");
//				System.out.println(replacedNoCharacter);
				
				String str2="1Hello123";
				System.out.println(str2.replaceAll("[^0-9]", ""));
	}

}
