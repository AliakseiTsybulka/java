package com.class17_2;

public class Task3 {

	public static void main(String[] args) {
		/* 3. Print the following pattern:
		1
		12
		123
		1234
		12345
*/
		for (int a=2;a<7;a++) {
			for (int b=1;b<a;b++) {
				System.out.print(b);
			}
			System.out.println();
		}
	}

}
