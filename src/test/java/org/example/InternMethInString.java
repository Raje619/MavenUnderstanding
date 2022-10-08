package org.example;

public class InternMethInString {
    public static void main(String[] args) {

        String str1 = new String("Scaler by InterviewBit").intern();  //Line1
        String str2 = new String("Scaler by InterviewBit").intern(); //Line2
        System.out.println(str1 == str2); //prints true (without intern method - false)
        System.out.println(str1.equals(str2)); //prints true


        String str3= new String("Scaler by InterviewBit");
        System.out.println(str1 == str3); //prints false
        System.out.println(str1.equals(str3)); //prints true

        String str4= "Scaler by InterviewBit";
        String str5= "Scaler by InterviewBit";
        String str6= new String("Scaler by InterviewBit");

        System.out.println(str4 == str5); //prints true
        System.out.println(str4.equals(str5)); //prints true
        System.out.println(str4 == str6); //prints false
        System.out.println(str4.equals(str6)); //prints true


    }
}
