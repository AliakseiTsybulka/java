package com.class12;

public class StringManipulations {
    public static void main(String[] args) {
        //length() function/or method - returns number of character in the String
        String str="Syntax";
        
        int lengthOfString=str.length();
        System.out.println(lengthOfString);
        
        String str1="Syntax Technologies";
        
        int lengthOf2String=str1.length();
        System.out.println(lengthOf2String);
        
        String str2="Welcome, students!";
        System.out.println(str2.length());
        //toUpperCase()-> convert all character to UpperCase
        //toLowerCase()-> convert all character to LowerCase
        String str3="Hello";
        
        String newString=str3.toUpperCase();
        System.out.println(newString);
        
        String lowerCaseString=newString.toLowerCase();
        System.out.println(lowerCaseString);
        
        //equals() - compares 2 strings, if strings are equal--> true, else --> false
        String str4="Hello";
        String str5="hello";
        
        boolean equality=str4.equals(str5);
        System.out.println(equality);
        //equalsIgnoreCase() - compares 2 strings but ignores case
        String expectedBrowser="chrome";
        String actualBrowser="CHROME";
        
        boolean equals=expectedBrowser.equalsIgnoreCase(actualBrowser);
        System.out.println(equals);
        
    }
}
