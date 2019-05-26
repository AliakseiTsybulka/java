package com.class29;
public interface Shape {
void calculateArea();
void calculatePerimiter();
}
class Circle implements Shape{
    double radius;
    double pi=3.14159;
    @Override
    public void calculateArea() {
        double area=pi * radius * radius;
        System.out.println("Area of the circle is "+ area);
    }
    @Override
    public void calculatePerimiter() {
        double perimeter = 2 * pi * radius;
        System.out.println("Perimeter of the circle is "+perimeter);
    }
}
class Square implements Shape{
    int side;
    @Override
    public void calculateArea() {
        int area=side*side;
        System.out.println("Area of the square is"+ area);
    }
    @Override
    public void calculatePerimiter() {
        int perimeter=4*side;
        System.out.println("Perimeter of the square is "+perimeter);
    }
   
}
/*
1. Create an Interface ‘Shape’ with undefined methods as calculateArea() and calculatePerimiter(). 
Create 2 child classes: Circle & Square that should have an implementation of area and perimeter calculation. 
Test your code.

2. We have to calculate the percentage of marks obtained in three subjects (each out of 100) by student A and in four subjects (each out of 100) by student B. 
Create class ‘Marks’ with an abstract method ‘getPercentage’. 
It is inherited by classes ‘A’ and ‘B’ each having a method with the same name which returns the percentage of the students. 
The constructor of student A takes the marks in three subjects as its parameters and the marks in four subjects as its parameters for student B. 
Test your code

3. Create Registration Class in which you would have variables as email, userName and password that have an access scope only within its own class. 
After creating an object of the class user should be able to call methods and in each method separately pass values to set users email, username and password.
Requirements:
Valid email consider to be only gmail
Valid userName and password cannot be empty and should be of length larger than 6 characters. Also valid password cannot contain userName.

4. Create a Class Car that would have the following fields: regularPrice and color and method calculateSalePrice() which should be returning a price of the car.
Create 2 sub classes: Sedan and Truck. 
The Truck class has field as weight and has its own implementation of  calculateSalePrice() method in which returned price calculated as following: 
if weight>2000 then returned price should include 10%discount, otherwise 20%discount.
The Sedan class has field as length and also does it is own implementation of calculateSalePrice(): 
if length of sedan is >20 feet then returned price should include 5%discount, otherwise 10%discount
*/