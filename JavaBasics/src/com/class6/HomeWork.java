package com.class6;
import java.util.Scanner;
public class HomeWork {

	private static Scanner scan;

	public static void main(String[] args) {
		/*HomeWork: Using scanner class create calculator.
		 *  Allow user to enter 2 numbers and operator(+,-,*,/).
		Based on operator provide the result to user.
*/
		Scanner scan,scan1 = null;
		scan=new Scanner(System.in);
		double a,b,result;
		char operator;
		
		System.out.println("Enter first number");
		a=scan.nextDouble();
		System.out.println("Enter second number");
		b=scan.nextDouble();
		System.out.println("Chose an operator (+,-,*,/)");
		operator=scan.next().charAt(0);
		switch(operator) {
		case '+':
			result=a+b;
			System.out.println("Result: "+a+"+"+b+"="+result);
			break;
		case '-':
			result=a-b;
			System.out.println("Result: "+a+"-"+b+"="+result);
			break;
		case '*':
			result=a*b;
			System.out.println("Result: "+a+"*"+b+"="+result);
			break;
		case '/':
			result=a/b;
			System.out.println("Result: "+a+"/"+b+"="+result);
			break;
			default:
				System.out.println("Please enter another numbers");
		}
	}

}
