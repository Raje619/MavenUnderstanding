package org.example;

public class ReverseInteger {
    public static void main(String[] args) {

        int no = 12546;
        int rev=0;

        while(no!=0)
        {
             rev = rev*10;
             rev = rev+no%10;
             no =  no/10;

        }
        System.out.print(" "+rev);
    }
}
