package com.class29;

public abstract class Marks {
	
abstract void getPercentage();
}

class A extends Marks{
    int A, B, C;
    A(int a,int b,int c){
        this.A=a;
        this.B=b;
        this.C=c;
    }

    @Override
    public void getPercentage() {
        int result=((A+B+C)/3);
        System.out.println("The percentage of a student A is "+ result);
    }
}
class B extends Marks{
    int A, B, C, D;
    B(int a,int b,int c, int d){
        this.A=a;
        this.B=b;
        this.C=c;
        this.D=d;
    }
    @Override
    public void getPercentage() {
        int result=((A+B+C+D)/4);
        System.out.println("The percentage of a student B is "+ result);
    }
    
}
/*
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