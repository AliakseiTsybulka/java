package com.class22;

public class Test {

	public static void main(String[] args) {
		Task obj = new Task();
		obj.numberOfDay=6;
		obj.dayOfWeek="Saturday";
		obj.saying();
		Task obj2= new Task(7,"Sunday");
		obj2.saying();
		System.out.println("----------Task 2----------");
		Students stud1 = new Students("Peter",75,65,90);
		stud1.average();
		Students stud2 = new Students("Michael",69,96,66);
		stud2.average();
		Students stud3 = new Students("Jessica",78,90,76);
		stud3.average();
		Students stud4 = new Students("Patrick",58,91,81);
		stud4.average();
		Students stud5 = new Students("Jennifer",91,81,51);
		stud5.average();
	}
}