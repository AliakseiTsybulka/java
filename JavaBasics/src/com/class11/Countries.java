package com.class11;

public class Countries {

	public static void main(String[] args) {
		String[] a = {"USA","Germany","France","Belarus","Japan"};
		for (String b:a) {
			System.out.print("Capital of "+b+" is ");
			if (b=="USA") {
				System.out.println("Washington");
			}else if (b=="France") {
				System.out.println("Paris");
			}else if (b=="Germany") {
				System.out.println("Berlin");
			}else if (b=="Belarus") {
				System.out.println("Minsk");
			}else if (b=="Japan") {
				System.out.println("Tokyo");
			}
				
		}
	}

}
