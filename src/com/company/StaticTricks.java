package com.company;

import java.io.FileNotFoundException;

public class StaticTricks {
    /*static*/ final String finalTrick;

    int i;
    String varTrick;
    static String varTrick2;
    {
       // finalTrick = "String";
    }
    //finalTrick might not have been initialized if static
    //static {finalTrick = "String";} //everything ok

    StaticTricks() {
        varTrick.length();
        varTrick2.length();

        finalTrick = ""; //might already have been assigned if non-static
    }

    public static void main(String[] args) {
        new StaticTricks().varTrick.length();
        new StaticTricks().varTrick2.length();

        //new StaticTricks().finalTrick = "";

    }
}


class A {
    static /*final*/ String returnString() {
        return "";
    }
}

class B extends A {
    static final String returnString() {
        return "";
    }
}