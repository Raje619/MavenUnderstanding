package org.example;

public class MissingNumber {

    public static void main(String[] args) {

        int ar[]={-1,1,2,3,4,5,6,7};
        int sum=0;

        for (int i=0;i<ar.length;i++)
        {
            sum=sum+ar[i];
        }
        System.out.println(sum);
        int last = ar[ar.length-1];
        int first= ar[0];
        int sum1=0;
        System.out.println(last);

        for (int i = first;i<=last;i++)
        {
            sum1=sum1+i;
        }
        System.out.println(sum1);
        int missingNo=sum1-sum;
        System.out.println("missingNo "+missingNo);
    }
}
