package com.class26;

public class TestBank {

	public static void main(String[] args) {
		Bank balance1 = new BankA();
		Bank balance2 = new BankB();
		Bank balance3 = new BankC();
		System.out.println(balance1.getBalance());
		System.out.println(balance2.getBalance());
		System.out.println(balance3.getBalance());
		
	}

}
