package com.class7;

public class Task1 {

	public static void main(String[] args) {
		boolean workDay=true;
		int day=1;
		while (workDay) {
			if (day>=1&&day<6) {
				System.out.println("I need a day off");
				day++;
			}else {
				workDay=false;
			}
		}
	}

}
