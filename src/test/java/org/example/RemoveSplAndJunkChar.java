package org.example;

public class RemoveSplAndJunkChar{

    public static void main(String[] args) {

        String s= "私の名前はラジェッシュです My Name is Rajesh&#$";
        //remove special and junk characters
        String removeChar=s.replaceAll("[^a-zA-Z0-9]","");
        String removeCharAndSpace=s.replaceAll("[^a-zA-Z0-9 ]","");

        System.out.println(removeChar);//MyNameisRajesh
        System.out.println(removeCharAndSpace);// My Name is Rajesh
        System.out.println(removeCharAndSpace.trim());//My Name is Rajesh
    }
}
