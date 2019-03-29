package com.class10;
public class Main {
	/*Write a program that prints the following pattern
					1 2 3 4 5 6 7 8 9 10
                    2 4 6 8 10 12 14 16 18 20
                    3 6 9 12 15 18 21 24 27 30
                    4 8 12 16 20 24 28 32 36 40
                    5 10 15 20 25 30 35 40 45 50
	*/
	
	
		public static void main(String[] args)
		{
			int[][] a = {
				{-5,-2,-3,7},
				{1,-5,-2,2},
				{1,-2,3,-4}
			};
	int result=0;
			for (int[] i:a) {
				for (int j:i) {
					if (j%2==-1) {
						result++;}
				}
			}
			System.out.println(result);
		}
	}