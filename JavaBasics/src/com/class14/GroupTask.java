package com.class14;

public class GroupTask {
	public static void main(String[] args) {
		// 1. Write a program to swap 2 numbers without a temporary variable? Swap 2
		// strings without a temporary variable?
		System.out.println("1: ------------------------");
		int a = 10, b = 25;
		String c = "Saturday", d = "Java";
		System.out.println("A: " + a + " & B: " + b + " & C =" + c + " & D = " + d);
		int[] ab = { a, b };
		b = ab[0];
		a = ab[1];
		c = c + " " + d;
		String[] array = c.split(" ");
		d = array[0];
		c = array[1];
		System.out.println("After manipulations A = " + a + " and B = " + b + " C = " + c + " & D = " + d);
		System.out.println("2: ------------------------");
		// 2.Write a java program to find the second largest number in the array?
		// Maximum and minimum number in the array?
		int[] arr = { 2, 3, 4, 5, 6, 7, 8, 9, 1 };
		int max = arr[0], min = arr[0], secondLargest = arr[0];
		for (int i : arr) {
			if (i > max) {
				secondLargest = max;
				max = i;
			} else if (i > secondLargest) {
				secondLargest = i;
			} else if (i > max)
				max = i;
			else if (i <= min)
				min = i;
		}
		System.out.println(
				"Second largest number is: " + secondLargest + " and largest is: " + max + " and smallest is: " + min);
		System.out.println("3: ------------------------");
		// 3. Find out how many alpha characters present in a string?
		String aa = "SfN3n f3@nj Rd. 12@%k hn&n. njJbhK^$ %@33 4%*^))3";
		aa = aa.replaceAll("[A-Za-z 0-9]", "");
		System.out.println("The number of alpha characters is: " + aa.length());
		System.out.println("4: ------------------------");
		// 4.How to find out the part of the string from a string? What is substring?
		// Find number of words in string?
		String aaa = "I like to learn Java";
		String[] aaaa = aaa.split(" ");
		System.out.println("The number of words is: " + aaaa.length);
		System.out.println("5: ------------------------");
		// 5. Write a java program to reverse String? Reverse a string word by word?
		String original = "Today is Saturday and we are learning java";
		String reverse = "";
		String[] array1 = original.split(" ");
		for (int i = array1.length - 1; i >= 0; i--) {
			reverse += array1[i] + " ";
		}
		System.out.println("Reversed sentence is: " + reverse);
		System.out.println("6: ------------------------");
		// 6. Write a Java Program to find whether a String is palindrome or not?
		String str = "Hannah", str1 = "";
		for (int j = str.length() - 1; j >= 0; j--) {
			str1 += str.charAt(j);
		}
		if (str.equalsIgnoreCase(str1)) {
			System.out.println("This is palindrome");
		} else {
			System.out.println("This is not palindrome");
		}
		System.out.println("7: ------------------------");
		//7. Write a java program to check whether a given number is prime or not?
		int p = 4;
		boolean prime=true;
		for (int v=2;v<200;v++) {
			if (p%v!=0) {
				continue;}
			else if (p==v) {
				continue;
			}else {
				prime=false;}
			}
			System.out.println("Prime number? "+prime);
		System.out.println("8: ------------------------");
		//8. Write a Java Program to print first 10 numbers of Fibonacci series.
		int num1=0,num2=1;
		System.out.println("Fibonacci series of first 10 numbers:");
		for (int i=1;i<=10;++i) {
			System.out.print(num1+" ");
			int sum=num1+num2;
			num1=num2;
			num2=sum;
		}
	}
}