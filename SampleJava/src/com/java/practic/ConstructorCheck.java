package com.java.practic;


public class ConstructorCheck {


    public ConstructorCheck(String abc){
        System.out.println("check the default " + abc);
    }

    //without this also working
    public ConstructorCheck()
    {

    }

    public static void main(String[] args) {

        ConstructorCheck ch = new ConstructorCheck("hello");
    }


}
