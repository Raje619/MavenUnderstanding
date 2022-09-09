package org.example;

public class Jio_HackerEarth {

    static boolean validate(String pan,String gst)
    {
        String pan2="";
        for (int i=2;i<=pan.length()+1;i++)
        {
            pan2=pan2+gst.charAt(i);
        }
        System.out.println(pan+" "+pan2+" "+gst);
        if (pan.equals(pan2))
        {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(validate("qwerty1235","dfqwerty123dfd"));
    }

}
