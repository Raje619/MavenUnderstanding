package org.example;


import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CountVowels {
    public static void main(String[] args) {
        String str  = "Welcome Home ae";
        char vowels[]={'a','e','i','o','u'};
        char a[] = str.toCharArray();
        Map<Character,Integer>mp=new HashMap<Character, Integer>();
        for (int i=0;i< a.length;i++)
        {

            Integer count=mp.get(a[i]);
            if (count==null)
            {
                mp.put(a[i],1);
            }
            else
            {
                mp.put(a[i],++count);
            }
        }

        Set<Map.Entry<Character,Integer>> ent = mp.entrySet();

        for (int i=0;i< vowels.length;i++)
        {
            if (mp.containsKey(vowels[i])) {
                System.out.println(vowels[i]+"  "+mp.get(vowels[i]));
            }
        }
    }
}