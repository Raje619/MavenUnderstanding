package org.example;

import com.google.common.base.Joiner;

import java.util.ArrayList;
import java.util.List;

public class ReplaceDuplicateCharWithAlphaCharac {
    public static void main(String[] args) {

        String a = "RaaaajesssshhajdF";
        List<Character>lst=new ArrayList<Character>();
        char c []=a.toCharArray();

        for (int i=0;i<c.length;i++)
        {
            if(lst.contains(c[i])==false)
            lst.add(c[i]);
            char chkChar=c[i];
            for (int j=i+1;j<c.length;j++)
            {
                if(chkChar==c[j])
                {
                    lst.add('$');
                }
            }
        }
        String string = Joiner.on(" ").join(lst);
        System.out.println(string);
    }
}
