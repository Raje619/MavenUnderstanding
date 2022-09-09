package org.example;

import java.util.*;

public class ArrayList_To_HashmapProg {
    public static void main(String[] args) {

        String[] names={"raj","jay","Amit","Shas"};
        String [] surName={"mane","chaud","khad","annit"};
        List<String> name_List1= Arrays.asList(surName);

        HashMap<String, String>full_name=new HashMap<String, String>();
        for (int i=0;i<names.length;i++)
        {
        full_name.put(names[i],surName[i]);
        }
        System.out.println(full_name);
        System.out.println(full_name.keySet());
        System.out.println(full_name.values());
        System.out.println(full_name.get("jay"));


        for(Map.Entry<String, String > entry : full_name.entrySet())
        {
            System.out.println("Keys - "+entry.getKey()+" Values-  "+entry.getValue());
        }
    }
}
