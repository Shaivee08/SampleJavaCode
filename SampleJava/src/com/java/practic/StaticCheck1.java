package com.java.practic;

public class StaticCheck1 extends StaticCheck{

    public  void abc()
    {
        System.out.println("abc child");
    }


    public static void main(String[] args) {
        StaticCheck sc = new StaticCheck1();
        StaticCheck s = new StaticCheck();
        sc.abc();
        s.abc();
       /* int a = 0;
        while(true){
            System.gc();
            System.out.println("vipin--->>>"+a);
            a++;
        }*/



    }
}
