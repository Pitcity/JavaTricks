package com.company.rope;

public class Rope extends RopeWithDefaultTesting {
    public static int length = 0;

    public static void print() {
        System.out.println("test");
        //new this();
    }

    public String d() {
        justDefaultString = "String";
        return justDefaultMethod();
    }

    void Rope() {
    }

    /*public static void staticTest() {
        System.out.println("test");

    }*/
}

class RopeWithDefaultTesting {

    String justDefaultString;

    String justDefaultMethod() {
        return justDefaultString;
    }

    /*public void staticTest() {
        System.out.println("test");

    }*/
}