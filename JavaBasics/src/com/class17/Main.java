package com.class17;

public class Main {
String breed,name,color;
void bark() {
	System.out.println(breed+" can bark");
}
void run() {
	System.out.println(breed+" can run");
}
void play() {
	System.out.println(breed+" can play");
}
public static void main(String[] args) {
Main dog1=new Main();
dog1.breed="Husky";
dog1.name="Alaska";
dog1.color="White/Grey";
dog1.bark();
dog1.run();
dog1.play();
Main dog2=new Main();
dog2.breed="Bulldog";
dog2.name="Rhuffy";
dog2.color="Black";
dog2.bark();
dog2.run();
dog2.play();
Main dog3=new Main();
dog3.breed="Labrador";
dog3.name="Lucky";
dog3.color="Brown";
dog3.bark();
dog3.run();
dog3.play();
}
}