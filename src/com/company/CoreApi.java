package com.company;

public class CoreApi {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("JustTestString");
        System.out.println("cap = " + sb.capacity() + " length = " + sb.length() + " sb = " + sb.toString());
        System.out.println(sb.insert(3, "Some"));
        System.out.println("cap = " + sb.capacity() + " length = " + sb.length() + " sb = " + sb.toString());
        System.out.println(sb.subSequence(1, 3));
        System.out.println("cap = " + sb.capacity() + " length = " + sb.length() + " sb = " + sb.toString());
        System.out.println(sb.substring(1, 3));
        System.out.println("cap = " + sb.capacity() + " length = " + sb.length() + " sb = " + sb.toString());
        System.out.println(sb.insert(0, sb));
        System.out.println("cap = " + sb.capacity() + " length = " + sb.length() + " sb = " + sb.toString());
        System.out.println(sb.delete(0, sb.length() - 1));
        System.out.println("cap = " + sb.capacity() + " length = " + sb.length() + " sb = " + sb.toString());

        int i1 = 1_00;
        //int i2 = 1.00;
        //int i3 = 1l;
        double d1 = 1.00;
        //double d2 = 1,00;
        double d3 = 1.0f;
        //float f1 = 1.00;
        float f2 = 1.00f;
        long l1 = 1L;
        long l2 = 1;

        int i = 3;
        System.out.println(i++ + i++ + i++ + ++i);

        System.out.println();
        StringBuilder sb2 = new StringBuilder("TestString");
        sb2.replace(2,6,"f");
        System.out.println(sb2);

        int b;
        //int a = 3+i+b; local var shoulds be initialized

        Integer.parseInt(null);

        new StringBuilder().length();
        new String().length();
        //new int[2].length;

        int[][] a = new int[5][];
        int[] a1[] = new int[2][];
        int a2[][] = new int[2][];
    }

    void checkSwitch(String str) {
        switch (str) {
            case "1":
                ;
            //case str: cannot use non-final here
        }
    }

    void checkFor(){
        for (int i = 3; (i = 6) == 6; i++) {
            checkDouble(1.2f);
        }
    }

    void checkDouble(double d) {} //1 ok, converts to double
    void checkDouble(Double d) {} // cannot convert twice (to double -> Double), so we cannot use this one
    void checkDouble(Object d) {} //2 ok, converts to Float
    void checkDouble(int d) {} //not ok
}
