package com.company;

import com.company.rope.Rope;
//import static com.company.rope.Rope.*;

class RopeSwing {
    private static Rope rope1 = new Rope();
    private static Rope rope2 = new Rope();

    //private static final String bench;
    private static final String name = "name";

    /*static*/ {
        System.out.println(rope1.length);
    }

    public static void main(String[] args) {
        //RopeSwing.bench = "";
        /*print();
        length= 5;*/
        rope1.length = 2;
        rope2.length = 8;
        Rope.length = 2;
        System.out.println(rope1.length);
    }
}

public class Lambda {

    public static void main(String[] args) {
        Lambda lambda = new Lambda();

        /*lambda.printInt(()->{});*/

       /* boolean[]c = {true, true};
        howMany(true, {true, true});*/

    }

    void printInt(Interface1 interface1) {
        interface1.justMethodToImplement1(2);
    }

    void printInt(Interface2 interface2) {
        interface2.justMethodToImplement(2);
    }

    public int howMany(boolean b, int... b2) {
        return b2.length;
    }
}

interface Interface1 {

    Number justMethodToImplement1(Number n);
}

interface Interface2 {

    Number justMethodToImplement(Number n);
}

/*for subclasses more specific return type allowed*/
class TestingInheritance implements Interface1 {

    @Override
    public Number/*Integer is possible*/ justMethodToImplement1(Number/*cannot be different here*/ n) {
        return null;
    }
}
