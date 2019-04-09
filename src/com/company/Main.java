package com.company;

import java.time.Period;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        /*//String s = 1 + 2; does not have casting

        String s1 = "java";
        StringBuilder s2 = new StringBuilder("java");
        //if (s1 == s2) System.out.print("1"); cannot compare ref of different type
        if (s1.equals(s2)) System.out.print("2");

        String a = ""; a += 2; a += 'c'; a += false;
        if ( a == "2cfalse") System.out.println("==");
        if ( a.equals("2cfalse")) System.out.println("equals");

        int total = 0;
        StringBuilder letters = new StringBuilder("abcdefg"); //substring does not modify SB
        total += letters.substring(1, 2).length();
        total += letters.substring(6, 6).length();
        total += letters.substring(6, 5).length(); //Exception here
        System.out.println(total);

        int[][] java; java = new int[2][];// does not compile[][]

        int[] random = { 6, -4, 12, 0, -10 };
        int y = Arrays.binarySearch(random, 12); System.out.println(y);
a
        Integer i = null;
        int d = i; //casting
*/
        char[] charArray = { 'e', 's', 'p', 'r', 'e', 's', 's', 'o', '8', '9', '0'};
        System.arraycopy(charArray, 2, charArray, 6, 5);
        System.out.println(Arrays.toString(charArray));
        System.out.println(charArray[8]);

        StringBuilder sb = new StringBuilder();
        sb.insert(0, "Cat");
        sb.append("tle");

        System.out.println(sb.capacity());
        sb.append("01234567");
        System.out.println(sb.capacity());
        System.out.println(sb.length());
        sb.append("1234");

        System.out.println(sb.capacity());
        System.out.println(sb.length());


    }
}
