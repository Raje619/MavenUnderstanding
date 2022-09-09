package org.example;

public class IncrementBeforeAfter {

    public static void main(String[] args) {
        int a=1;
        System.out.println(a++);//1 is increment from next line/iteration
        System.out.println(a);// 2
        System.out.println(a++);// 2 is increment from next line/iteration
        System.out.println(++a);// 4 (a++ increments to 3 and ++a increments value 3 to 4 from current line/iteration itself )

    }
}
