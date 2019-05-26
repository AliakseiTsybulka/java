package homework;

public class Employee {
	String name, lastName, startDate;
	int employeeId, salary;
	Employee() {
	}
	Employee(String n, String l, int e, String sd, int s) {
		name = n;
		lastName = l;
		employeeId = e;
		startDate = sd;
		salary = s;
	}
	public void output(Employee obj1) {
		// TODO Auto-generated method stub
		
	}
}
/*
 * 1. Complete the Employee.java class:
 * 
 * Include the following class variables: name(String) lastName(String)
 * employeeId(int) startDate(String) salary(int)
 * 
 * 
 * Write two constructors:
 * 
 * default constructor The main constructor( with all parameters)
 * 
 * Create two different objects of the Employee class using both constructors
 * and print the values of the properties inline using a print method.
 * 
 * 
 * Output:
 * 
 * null null 0 null 0 Joe Smith 12345 01/01/1970 35000
 */