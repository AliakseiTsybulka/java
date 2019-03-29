package com.class11;

public class Largest {

	public static void main(String[] args) {
		int a[] = {1,2,3,4,5,6,7,8,9};
		int max=a[0];
		for (int b:a) {
			if (b>max) {
				max=b;
			}
		}
		System.out.println(max);
	}
}
