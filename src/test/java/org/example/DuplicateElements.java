package org.example;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class DuplicateElements {

    public static void main(String[] args) {

        String [] a = {"java","c","python","ruby","c","java"};
        for (int i=0;i<a.length;i++)
        {
            for (int j =i+1;j<a.length;j++)
            {
                if (a[i].equalsIgnoreCase(a[j]))
                {
                    System.out.println("Duplicate Elements "+a[i]);
                }
            }
        }


        System.out.println("******************************");

        Set<String> dup = new HashSet<String>();
        for (String str : a)
        {
            if (dup.add(str)==false)
            {
                System.out.println("Duplicate Elements "+str);
            }
        }

        System.out.println("******************************");

        Map<String,Integer>storeMap=new HashMap<String,Integer>();

        for (String nm : a) {
            Integer count=  storeMap.get(nm);
            if (count==null) {

                storeMap.put(nm,1);
            }
            else{
                storeMap.put(nm,++count);
            }
        }

        System.out.println("******************************");


        Set <Map.Entry<String,Integer>> entrySet=storeMap.entrySet();
        for (Map.Entry<String,Integer> entry : entrySet)
        {
            if(entry.getValue()>1)
            {
                System.out.println("Duplicate Element is::"+entry.getKey());
            }
        }

    }
}
