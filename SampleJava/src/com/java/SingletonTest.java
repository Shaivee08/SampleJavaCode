package com.java;

public class SingletonTest {

    public static void main(String[] args) {
        System.out.println(Singleton.getInstance().hashCode());
        System.out.println(Singleton.getInstance().str);
    }
}
class Singleton{
    private static Singleton instance = null;
    public String str = "sita";
    private Singleton(){

    }
    public static Singleton getInstance()
    {
        if(instance==null)
        instance= new Singleton();

        return instance;
    }

}