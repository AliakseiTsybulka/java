package homework;

public class Car {
	String make, model;
	public int numberOfDoors,topSpeed;
	double price;
	Car(String m, String mo, int n, int t, double p){
		make = m;
		model = mo;
		numberOfDoors = n;
		topSpeed = t;
		price = p;
	}
	Car(String m, String mo, int t, double p){
		numberOfDoors = 4;
		make = m;
		model = mo;
		topSpeed = t;
		price = p;
	}
	Car(int n, int t, double p){
		make = "unknown";
		model = "unknown";
		numberOfDoors = n;
		topSpeed = t;
		price = p;
	}
	Car(String m, String mo, int n){
		topSpeed = 90;
		price = 0;
		make = m;
		model = mo;
		numberOfDoors = n;
	}
}
/*1. Complete the Car.java class:

Include the following class variables:
* make
* model
* numberOfDoors
* topSpeed
* price
All class variables should be declared case sensitive

Write four constructors:
* The first constructor(with all parameters)
* A secondary constructor that does not include numberOfDoors, which should default to 4
* A third constructor that does not include make and model; both default to "unknown"
* A fourth constructor that does not include topSpeed and price; default to 90 and 0 respectively.

2. Test your code with the Main.java class:
Create several Car objects using all Constructors and print their fields/states to make sure it's correct. print your objects with variables in your output each object


Output: 
Toyota Prius 4 120 30000.0
Toyota Prius 4 120 30000.0
unknown unknown 4 120 30000.0
Toyota Prius 4 90 0.0
*/