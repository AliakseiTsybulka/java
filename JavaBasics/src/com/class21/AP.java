package com.class21;
import java.util.Scanner;
/*
* Write a Java method to display the middle character of a string.
* Note: a) If the length of the string is odd there will be two middle characters.b)
* If the length of the string is even there will be one middle character.
* Test Data:Input a string: 350Expected Output:
* The middle character in the string: 5*/
public class AP {
public void execution() {
    Scanner scan = new Scanner(System.in);
    String s=scan.nextLine();
    String result=s.substring(s.length()/2, s.length()/2+1);
    if (s.length()%2==0) {
        result=s.substring(s.length()/2-1, s.length()/2+1);}
    System.out.println(result);
}
    public static void main(String[] args) {    
    AP output = new AP();
    output.execution();
    }
}