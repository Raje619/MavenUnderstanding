package org.example;

public class ReverseStringExceptFirstAndLastIndex {
    public static void main(String[] args) {
        String name = "My Name is Rajesh Valmik Chaudhari Here";
        String reverse2 = "";
        String arr1[] = name.split(" ");

        for (int i = 0; i < arr1.length; i++) {
            if (i > 0 && i < arr1.length - 1) {
                String rev = arr1[i];
                for (int j = rev.length() - 1; j >= 0; j--) {
                    reverse2 = reverse2 + rev.charAt(j);
                }
                reverse2 = reverse2 + " ";
            } else {
                reverse2 = reverse2 + arr1[i] + " ";
            }
        }
        System.out.println(reverse2);//hsejaR kimlaV irahduahC
    }
}
