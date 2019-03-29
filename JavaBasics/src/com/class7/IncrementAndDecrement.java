package com.class7;

public class IncrementAndDecrement {
    public static void main(String[] args) {

        // a++; a--;
        // ^ Post Increment & ^ Post Decrement

        int a = 299;

        int b = a++; // First assign ---> increment

        System.out.println(a); // 300
        System.out.println(b); // 299

        // Post Decrement x--;

        int z = 10;
        int c = z--;

        System.out.println(z); // 9
        System.out.println(c); // 10
	}
}
