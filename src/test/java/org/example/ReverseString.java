package org.example;

public class ReverseString {
    public static void main(String[] args) {

        String name="Rajesh Valmik Chaudhari";
        String reverse = "",reverse1 = "",reverse2="";

        for (int i =name.length()-1;i>=0;i--)
        {
            reverse=reverse+name.charAt(i);
        }
        System.out.println(reverse);//irahduahC kimlaV hsejaR
        System.out.println("**************************************************");



        String arr[]=name.split(" ");

        for (int i =arr.length-1;i>=0;i--)
        {
            reverse1=reverse1+arr[i]+" ";
        }
        System.out.println(reverse1);//Chaudhari Valmik Rajesh
        System.out.println("**************************************************");



        for (int i =0;i<arr.length;i++)
        {
            String rev=arr[i];
            for (int j=rev.length()-1;j>=0;j--)
            {
                reverse2=reverse2+rev.charAt(j);
            }
            reverse2=reverse2+" ";

        }
        System.out.println(reverse2);//hsejaR kimlaV irahduahC

    }
}
