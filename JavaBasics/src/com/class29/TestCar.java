package com.class29;

public class TestCar {

	public static void main(String[] args) {
		Car car;
		car = new Sedan(22);
				car.regularPrice = 10000;
			car.calculateSalePrice();
		car = new Truck(2200);
				car.regularPrice = 20000;
				car.calculateSalePrice();
	}
}
