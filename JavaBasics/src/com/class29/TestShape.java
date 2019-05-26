package com.class29;

public class TestShape {
    public static void main(String[] args) {
        Circle obj=new Circle();
        obj.radius=5.5;
        obj.calculateArea();
        obj.calculatePerimiter();
        
        Square obj1=new Square();
        obj1.side=7;
        obj.calculateArea();
        obj.calculatePerimiter();
    }
}