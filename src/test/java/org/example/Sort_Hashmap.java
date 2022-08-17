package org.example;

import java.util.*;

public class Sort_Hashmap {
   static Map<String, Integer> attendance = new HashMap<String, Integer>();

    public static void main(String[] args) {
        attendance.put("Rajesh",10);
        attendance.put("Aman",13);
        attendance.put("Chaman",15);
        attendance.put("Fred",17);
        attendance.put("Amber",19);

        sortKeys();
        Map<String, Integer> hm1 = sortByValue((HashMap<String, Integer>)attendance);

       for(Map.Entry<String,Integer>sortValues:hm1.entrySet())
       {
           System.out.println(sortValues.getKey()+" "+sortValues.getValue());
       }

    }
    public static HashMap<String, Integer> sortByValue(HashMap<String, Integer> hm)
    {
        // Create a list from elements of HashMap
        List<Map.Entry<String, Integer> > list =
                new LinkedList<>(hm.entrySet());

        // Sort the list
        Collections.sort(list, new Comparator<Map.Entry<String, Integer> >() {
            public int compare(Map.Entry<String, Integer> o1,
                               Map.Entry<String, Integer> o2)
            {
                return (o1.getValue()).compareTo(o2.getValue());
            }
        });

        // put data from sorted list to hashmap
        HashMap<String, Integer> temp = new LinkedHashMap<String, Integer>();
        for (Map.Entry<String, Integer> aa : list) {
            temp.put(aa.getKey(), aa.getValue());
        }
        return temp;
    }
    private static void sortKeys() {
        TreeMap<String, Integer>tr = new TreeMap<String, Integer>(attendance);

        for (Map.Entry<String, Integer> mp:tr.entrySet())
        {
            System.out.println("Keys - "+mp.getKey()+" Values - "+mp.getValue());
        }
    }
}
