package com.class6;
import java.util.Scanner;
public class Task {

	public static void main(String[] args) {
		Scanner scan,scan1;
		scan=new Scanner(System.in);
			System.out.println("Please enter the temperature");
			int temp=scan.nextInt();
			String activity = null,rain,snow,sunny;
			scan1=new Scanner(System.in);
			if (temp>=40&&temp<=80) {
				
			System.out.println("Is it raining?");
			rain=scan1.nextLine();
			switch (rain) {
			case "yes":
					activity = "Stay at home";
					break;
			default:
				activity = "Go for hiking";
				}
				}else if (temp<40&&temp>=20) {
				System.out.println("Is it snowing?");
				snow=scan1.nextLine();
				switch (snow) {
				case "yes":
					activity = "Go to snowboarding";
					break;
				default:
					activity = "Do coding at home";
				}
				}else if (temp>80) {
				System.out.println("Is it sunny?");
				sunny=scan1.nextLine();
				switch (sunny) {
				case "yes":
					activity = "Go to the beach";
					break;
				default:
					activity = "Stay at home and do more coding";
				}
			}
			System.out.println(activity);
	}
}