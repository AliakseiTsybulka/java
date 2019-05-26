package com.class30;

public class Car {

	String color;
	double carPrice;
	
	public Car(String color, double carPrice) {
		this.color=color;
		this.carPrice=carPrice;
	}
	public double calculateSalePrice() {
		return carPrice;
	}
}
class Truck extends Car{
	
	int weight;
	
	public Truck(String color, double carPrice,int weight) {
		super(color, carPrice);
		this.weight=weight;
	}
	public double calculateSalePrice() {
		
		if (weight>2000) {
			carPrice-=carPrice*0.1;
		}else {
			carPrice-=carPrice*0.2;
		}
		return carPrice;
	}
}
class Sedan extends Car{
	
	int length;
	
	public Sedan(String color, double carPrice, int length) {
		super(color, carPrice);
		this.length=length;
	}
	public double calculateSalePrice() {
		
		if (length>20) {
			carPrice-=carPrice*0.05;
		}else {
			carPrice-=carPrice*0.1;
		}
		return carPrice;
	}
}