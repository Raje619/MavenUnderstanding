package org.example;

import java.util.Scanner;

public class JavaSwitchCase {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String s = sc.nextLine();

        switch (s)
        {
            case "Mango":
                System.out.println("Yellow Color");
                break;

            case "Apple":
                System.out.println("Red Color");
                break;

            case "WaterMelon":
                System.out.println("Green Color");
                break;

            default:
                System.out.println("Not in a list");
        }
    }

}
