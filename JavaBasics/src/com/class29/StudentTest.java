package com.class29;

public class StudentTest {

	public static void main(String[] args) {
		Student obj=new Student();

		obj.setName("Alex");
		obj.setAge(17);
		
		System.out.println(obj.getName()+" is "+obj.getAge());
	}
}