package org.example;

import org.openqa.selenium.safari.SafariDriverService;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayvsArrays {
    public static void main(String[] args) {
        int[] intArray = new int[5];

        // Adding elements into the array
        // using setInt() method of Array class
        Array.setInt(intArray, 4, 10);
        System.out.println(Array.get(intArray,3));

        // Printing the Array content
        // using util.Arrays class
        System.out.println(Arrays.toString(intArray));
        System.out.println(intArray.length);


        String [] names={"Rajesh","Nora","Amber","Gal"};

        Arrays.sort(names);
        System.out.println(Arrays.toString(names));

        int index= Arrays.binarySearch(names,"Amber");
        System.out.println(index);
    }
}