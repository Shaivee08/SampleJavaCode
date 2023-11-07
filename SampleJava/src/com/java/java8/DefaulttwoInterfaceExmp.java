package com.java.java8;

interface GfG1{
    public default void display() {
        System.out.println("GEEKSFORGEEKS");
    }
}

// Creating Interface Two
interface gfgtest {

    public default void display() {
        System.out.println("geeksforgeeks");
    }
}
//error com.java.java8.DefaulttwoInterfaceExmp inherits unrelated defaults for display()
// from types com.java.java8.gfg and com.java.java8.GfG1
public class DefaulttwoInterfaceExmp  implements GfG1, gfgtest {
        // Interfaces are Overrided


       public void display() {

            GfG1.super.display();

            gfgtest.super.display();
        }

        public static void main(String args[]) {
            DefaulttwoInterfaceExmp obj = new DefaulttwoInterfaceExmp();
            obj.display();
        }
}