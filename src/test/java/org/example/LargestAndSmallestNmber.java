package org.example;

public class LargestAndSmallestNmber {
    public static void main(String[] args) {

        int num [] = {1,2,4,6,78,100,-6};

        int largest = num[0];
        int smallest = num[0];

        for (int i = 1; i<num.length;i++)
        {
            if(num[i]>largest)
            {
                largest=num[i];
            }
            else if (num[i]<smallest)
            {
                smallest=num[i];
            }
        }
        System.out.println("Smallest No "+smallest);
        System.out.println("Largest No "+largest);

    }
}
