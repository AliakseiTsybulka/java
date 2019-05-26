package com.class20;

import java.util.Random;

public class InetTask {

	public static void main(String[] args) {
		int[] a = { 2, 6, 3, 9, 5, 7, 8, 4 };
		int newPlace;
		Random rand = new Random();
		for (int b = 0; b < a.length; b++) {
			int temp = rand.nextInt(a.length);
			if (b != temp) {
				newPlace = a[temp];
				a[temp] = a[b];
				a[b] = newPlace;
			} else {
				newPlace = a[b];
				a[b] = a[b + 1];
				a[b + 1] = newPlace;
			}
		}
		for (int c : a)
			System.out.print(c+" ");
	}
}
