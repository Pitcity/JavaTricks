package com.company;

public class Interfaces implements Inter1, Inter2 {

    public static void main(String[] args) {
        Inter1 inter1 = new Interfaces();
        inter1.methodToImplement1();

        Inter2 inter2 = new Interfaces();
        inter2.methodToImplement2();

        Interfaces interfaces = new Interfaces();
        interfaces.methodToImplement1();
        interfaces.methodToImplement2();
        interfaces.methodWithDefWithImpl();
        //interfaces.methodWithStaticWithImpl();
        //System.out.println(interfaces.var1);
    }


    @Override
    public String method1() {
        Inter1.super.method1();
        Inter2.super.method1();
        Inter1.super.method1(2);
        return null;
    }

    @Override
    public String method1(/*Integer, Object*/ Number number) {
        return null;
    }

    @Override
    public String methodToImplement1() {
        return null;
    }

    @Override
    public String methodToImplement2() {
        return null;
    }

    static final int mthid() {
        return 0;
    }
}

interface Inter1 {
    String var1 = "Int1";

    default String method1() {
        return "int1";
    }

    default String method1(Number number) {
        return "";
    }

    ;

    String methodToImplement1();
}

interface Inter2 {
    String var1 = "Int2";

    default String method1() {
        return "int2";
    }

    abstract String methodToImplement2();

    //static String methodWithStatic();

    default String methodWithDefWithImpl() {
        return "default";
    }

    static String methodWithStaticWithImpl() {
        return "static";
    }
}