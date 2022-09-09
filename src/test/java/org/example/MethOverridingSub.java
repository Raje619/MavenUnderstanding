package org.example;

public class MethOverridingSub extends MethOverridingSuper {

    public int count() {
        System.out.println("Count Method In SuperClass");
        return 0;
    }

    public void Discount()
    {
        System.out.println("Subclass method");
    }

    public void Discount(int a)
    {
        System.out.println("Subclass method");
    }

     private void Discount(int a,int b)
    {
        System.out.println("Subclass method");
    }

    public static void main(String[] args) {
        MethOverridingSub me = (MethOverridingSub) new MethOverridingSuper();
        me.capital();
        me.Discount();
        MethOverridingSuper su = new MethOverridingSub(); //superclass ref
        su.count();
        su.capital();


    }

}
