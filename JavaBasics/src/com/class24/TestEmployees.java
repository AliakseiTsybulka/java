package com.class24;

public class TestEmployees {

	public static void main(String[] args) {
		Employees emp=new Employees();
		FullTimeEmployee ft=new FullTimeEmployee();
		Contractor contractor=new Contractor();
		
		emp.getPaid();//Employee gets paid salary
		ft.getPaid();//Full time employee gets paid salary + bonus
		contractor.getPaid();//Contractor gets paid hourly
	}
}