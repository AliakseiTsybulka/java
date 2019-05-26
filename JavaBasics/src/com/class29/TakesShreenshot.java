package com.class29;

public interface TakesShreenshot {
    String fileExtension = ".png";// by default this is
    // public static final variable and it MUST to be INITIALIZED

    void takesScreenShot();

    // from java 8 we can have defined methods in interface: static or default
    static void m1() {
        System.out.println("Static m1 method");
    }
    default void m2() {
        System.out.println("default m2 method");
    }
}