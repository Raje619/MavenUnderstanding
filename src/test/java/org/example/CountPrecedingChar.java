package org.example;

public class CountPrecedingChar {
        public static void main(String[] args) {
                String input = "aaabbbaacdd";
                String output="";
//                a3b3a2c1d2
                int count = 1;
                char c [] = input.toCharArray();
                for(int i=0; i<c.length;i++) {

                        if (i == c.length - 1) {
                                //you need to add something here
                                output = output+ c[i];
                        } else
                                if (c[i] == c[i + 1]) {
                                        count++;

                                } else {
                                        output = output + c[i] + count;
                                        count=1;
                                }

                }
                System.out.println(output+count);
                       /* for (int j = i; j < c.length; j++) {
                                if (c[i] == c[j]) {
                                        count++;

                                } else {
                                        output = output + c[i]+count;
                                        continue;

                                }*/




        }

}
