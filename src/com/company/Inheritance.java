package com.company;

public class Inheritance extends ChildClass {

    public static void main(String[] args) {
        ParentClass testClass1 = new ParentClass();
        ParentClass testClass2 = new ChildClass();
        ChildClass testClass3 = new ChildClass();
        //ChildClass testClass4 = new ParentClass();*/
        //new ParentClass();

        System.out.println("ParentClass is ParentClass; a= " + testClass1.a + "; a1= " + testClass1.a1);
        testClass1.printInst();
        testClass1.print();
        //testClass1.methodHidden();
        System.out.println();
        System.out.println("ParentClass is ChildClass; a= " + testClass2.a + "; a1= " + testClass2.a1);
        testClass2.printInst();
        testClass2.print();
        //testClass2.methodHidden();
        System.out.println();
        System.out.println("ChildClass is ChildClass; a= " + testClass3.a + "; a1= " + testClass3.a1);
        testClass3.printInst();
        testClass3.print();
        //testClass3.methodHidden(); is ok
        testClass2 = (ParentClass) testClass3;
        System.out.println("ChildClass is (Parent)ChildClass; a= " + testClass2.a + "; a1= " + testClass2.a1);
        testClass2.printInst();
        testClass3.print();


        Inheritance inheritance = new Inheritance();
        System.out.println(inheritance.a1);
        System.out.println(inheritance.a);
        inheritance.printInst();
    }
}

class ParentClass {
    static String a = " StringFromClass1";
    String a1 = " InstanceStringClass1";
    public int age = 100;

    ParentClass(long l) {
        //this(2);
    }

    ParentClass(/*int i*/) {
        //this();
    }

    static void print() {
        System.out.println("print 1");
        System.out.println("print 1 " + a);
    }

    private void methodHidden() {
        System.out.println("hidden from parent");
    }

    void printInst() {
        System.out.println("print 1 inst age " + age);
        System.out.println("print 1 inst " + a);
        System.out.println("print 1 inst " + a1);
    }
}

class ChildClass extends ParentClass {

    static String a = " StringFromClass2";
    String a1 = " InstanceStringClass2";

    ChildClass() {
        super(2);
    }

    ChildClass(int i) {
        this(2l);
    }


    ChildClass(long l) {
        this();
    }

    static void print() {
        System.out.println("print 2");
        System.out.println("print 2 " + a);
    }

    public void methodHidden() {
        System.out.println("hidden from child");
    }

    void printInst() {
        System.out.println("print 2 inst  age " + age);
        System.out.println("print 2 inst " + a);
        System.out.println("print 2 inst " + a1);
    }
}
