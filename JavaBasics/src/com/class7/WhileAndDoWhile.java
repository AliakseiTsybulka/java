package com.class7;

public class WhileAndDoWhile {

    public static void main(String[] args) {
    
        int a=10;
        do {//execute first and then check condition
            System.out.println("Hello");//will print at least once
            a++;
            
        }while(a>15);
        //--------------------------------------
        
        int b=10;
        while (b<15) {//check condition and then execute
            System.out.println("Bye");
            b++;
        }
    }
}