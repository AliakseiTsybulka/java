package com.class4;
import java.util.Scanner;
public class CityAndTemperature {
	public static void main(String[] args) {

				String city;
				int temp,conv;
				Scanner scan = new Scanner(System.in);
				System.out.println("Please enter your city");
				city = scan.nextLine();
				System.out.println("Please enter a temperature in Farenheit");
				temp = scan.nextInt();
				conv = (temp-32)*5/9;
				System.out.println("The temperature in "+city+" is "+conv+" in Celcius");
	}
}