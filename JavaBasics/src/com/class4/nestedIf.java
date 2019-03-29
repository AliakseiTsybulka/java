package com.class4;

public class nestedIf {

	public static void main(String[] args) {
		double gpa = 3.4;
		double expectedGpa = 3.5;
		boolean hasDiploma = true;
		if (hasDiploma ==true) {
			System.out.println("Congratulations!");
			if (gpa>expectedGpa) {
				System.out.println("We are hire you");
			}else {
				System.out.println("Sorry! We are not hire you");
			}
		}else {
			System.out.println("Please get your degree");
		}
	}
}