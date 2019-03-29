package com.class6;
import java.util.Scanner;
public class Practice {

	public static void main(String[] args) {
		Scanner scan;
		String act;
			System.out.println("Please enter the temperature");
			scan=new Scanner(System.in);
			int temp=scan.nextInt();
			if (temp>=40&&temp<=80) {
			System.out.println("Is it raining?");
			String rain=scan.nextLine();
			if (rain.equals("yes")) {
				act="Stay at home";
			}else {
				act="Go for hiking";
			}
			}else if (temp<40&&temp>=20) {
				System.out.println("Is it snowing?");
				String snow=scan.nextLine();
				if (snow.equals("yes")) {
					act="Go to snowboarding";
				}else {
					act="Do coding at home";
				}
			}else if (temp>80) {
				System.out.println("Is it sunny?");
				String sunny=scan.nextLine();
				if (sunny.equals("yes")) {
					act="Go to the beach";
				}else {
					act="Stay at home and do more coding";
				}
			}
	}
}
