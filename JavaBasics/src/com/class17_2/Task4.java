package com.class17_2;

public abstract class Task4 {

	public static void main(String[] args) {
		/* 4. Print the following pattern:
		*
		**
		***
		****
		*****
		****
		***
		**
		*/

		for (int a=1;a<6;a++) {
			for(int b=0;b<a;b++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int c=1;c<=4;c++) {
			for (int d=4;d>=c;d--) {
			System.out.print("*");
		}
			System.out.println();
		}
	}
	}
