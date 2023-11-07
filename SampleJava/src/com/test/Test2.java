package com.test;
import java.io.*;
public class Test2 {


   /* public static void main(String[] args) {
        for(int index=0; 1; index++)
        {
            System.out.println("welcom");
            break;
        }
    }*/

       /* // defining the method
        void msg()  throws ArithmeticException{
            System.out.println("parent method");
        }
    }

    public class TestExceptionChild extends Test2{

        // overriding the method in child class
        // gives compile time error
        void msg() throws Exception {
            System.out.println("TestExceptionChild");
        }

        public static void main(String args[]) {
            Test2 p = new TestExceptionChild();
            p.msg();
        }
    }*/
}
