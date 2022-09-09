package org.example;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class DuplicateCharCount {
    public static void main(String[] args) {

        String name ="Rajjeeshhhisssss";
        char [] ch = name.toCharArray();

        HashMap<Character,Integer>ha = new HashMap<Character,Integer>();
        for (char c:ch)
        {
          Integer count=  ha.get(c);
          if(count==null)
          {
              ha.put(c,1);
          }
          else
          {
              ha.put(c,++count);
          }
        }

        Set<Map.Entry<Character,Integer>> entryset =ha.entrySet();
        for (Map.Entry<Character,Integer> entry : entryset)
        {
            if(entry.getValue()>1)
          System.out.println(entry.getKey()+"  "+entry.getValue());
        }



//////////////////////////2nd Approach ///////////////////////////////

        Set<Character>sc=new HashSet<Character>();
        for(char c:ch)
        {
            if (sc.add(c)==false)
            {
                System.out.println("duplicate character is-----"+c);
            }
        }

    }
}
