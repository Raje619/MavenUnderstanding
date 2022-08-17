package org.example;

import java.util.HashMap;
import java.util.HashSet;

public class collection {
    public static void main(String[] args)
    {
        HashSet<String> a = new HashSet<String>();
       a.add("ab");
        a.add("cd");
        a.add("bc");
        a.add("ef");
        a.add("gh");


        System.out.println(a);

//
//        // This is how to declare HashMap
//        HashMap<Integer, String> hm = new HashMap<Integer, String>();
//
//        // Adding elements to HashMap*/
//        hm.put(12, "geeks");
//        hm.put(2, "practice");
//        hm.put(7, "contribute");
//        hm.put(0, "contribute");
//        hm.put(5, null);
//        hm.put(null, null);
//
//        System.out.println("\nHashMap object output :\n\n" + hm);
//
//        // store data with duplicate key
//        hm.put(7, "geeks");
//        hm.put(12, "contribute");
//
//        System.out.println("\nAfter inserting duplicate key :\n\n" + hm);
    }
}
