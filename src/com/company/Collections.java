package com.company;

import java.util.ArrayList;
import java.util.List;

public class Collections {

    public static void main(String[] args) {
        List<Integer> ages = new ArrayList<>();
        ages.add(Integer.parseInt("5"));
        ages.add(Integer.valueOf("6"));
        ages.add(7);
        ages.add(null);
        ages.remove(null);// can add and can delete without exception
        for (Integer age : ages) System.out.print(age); //if int - throws exception*/

        //int[] a = new int[4]; System.out.println(a.length);
        //List b = new ArrayList(); System.out.println(b.size());
    }
}
