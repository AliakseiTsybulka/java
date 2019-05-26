package com.class29;

public abstract class Car {
int regularPrice;
String color;
abstract void calculateSalePrice();  
}

class Sedan extends Car {
	int length;
	Sedan(int l) {
		this.length = l;
	}
	@Override
	void calculateSalePrice() {
		
		if (length>20) {
	        System.out.println("Price of the sedan is "+regularPrice*0.95);
	    }else {
	        System.out.println("Price of the truck is "+regularPrice*0.9);
	    }
	}
	
}
class Truck extends Car {

	int weight;
	Truck(int w) {
		this.weight = w;
	}
	@Override
	void calculateSalePrice() {
		 if (weight>2000) {
		        System.out.println("Price of the truck is "+regularPrice*0.9);
		    }else {
		        System.out.println("Price of the truck is "+regularPrice*0.8);
		    }
	}
	
}
/*
4. Create a Class Car that would have the following fields: 
regularPrice and color and method calculateSalePrice() which should be returning a price of the car.
Create 2 sub classes: Sedan and Truck. 
The Truck class has field as weight and has its own implementation of  calculateSalePrice() method in which returned price calculated as following: 
if weight>2000 then returned price should include 10%discount, otherwise 20%discount.
The Sedan class has field as length and also does it is own implementation of calculateSalePrice(): 
if length of sedan is >20 feet then returned price should include 5%discount, otherwise 10%discount
*/