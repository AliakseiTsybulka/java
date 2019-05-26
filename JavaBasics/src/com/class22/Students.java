package com.class22;
/*2. Write a java program of Class Students that takes students name and 3 subject grades. 
 * Inside your class also have a method to Calculate Average Grade. 
 * Test Student class for 5 different students with different marks. 
 * Your program should print an average mark of each students name.
NOTE: please male different names for instance and local variables. (edited) */
public class Students {
public String name;
public int math, physics, chemistry;

public Students (String n, int m, int p, int c) {
	name=n;
	math=m;
	physics=p;
	chemistry=c;
}

public void average() {
	int result=(math+physics+chemistry)/3;
	System.out.println("The average grade for the student "+name+" is: "+result);
}
}
