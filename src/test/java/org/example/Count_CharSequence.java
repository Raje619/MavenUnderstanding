package org.example;

import java.util.*;

public class Count_CharSequence {
    public static void main(String[] args) {
        String name = "aabbcccdddefghhii";
        char [] ch= name.toCharArray();
        Set<Character>charSeq=new HashSet<Character>();
        Set<Character> dup = new HashSet<Character>();
        for (int i=0;i<ch.length;i++)
        {
            if (dup.add(ch[i])==false)
            {
                charSeq.add(ch[i]);
            }
        }

       System.out.println(charSeq+" Count- "+charSeq.size());
    }
}
