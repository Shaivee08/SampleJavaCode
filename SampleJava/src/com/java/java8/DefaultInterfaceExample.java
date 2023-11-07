package com.java.java8;


    // Main Class With Implementation Of Interface
    public class DefaultInterfaceExample implements GFG {

        public void check()
        {
            System.out.println("My Implementation of check ");
        }
        public static void main(String args[]) {
            DefaultInterfaceExample obj = new DefaultInterfaceExample();

            // Calling Interface
           obj.display();
           obj.check();

        }
    }
