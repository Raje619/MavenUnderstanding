package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AddTwoListAndSort {
    public static void main(String[] args) {
        Integer numInA[]={1,2,45,643,33,446};
        Integer numInB[]={10,12,405,64,330,44};
        List<Integer>a=Arrays.asList(numInA);
        List<Integer>b=Arrays.asList(numInB);
        List<Integer>ab=Stream.concat(a.stream(),b.stream()).collect(Collectors.toList());
        //or
//        List<Integer>ab=new ArrayList<>();
//        ab.addAll(a);
//        ab.addAll(b);
        System.out.println(ab);
        //a.addAll(b);//will throw an exception called Unsupported Operation exception
        Collections.sort(ab); //Ascending Order
        System.out.println("After Sort (Ascending Order) ");
        System.out.println(ab);
        Collections.sort(ab,Collections.reverseOrder());
        System.out.println("After Sort (Desending  Order) ");
        System.out.println(ab);


        // without sorting function




    }
}
