package com.class29;

public class TestRegistration {
	public static void main(String[] args) {
		
Registration obj = new Registration();
obj.setEmail("alex.tsybulka@gmail.com");
obj.setUserName("acibaaa");
obj.setPassword("MyPassword");

System.out.println(obj.getEmail()+" "+obj.getUserName()+" "+obj.getPassword());
}
}
