package com.java;

public class ThreadCheck implements Runnable {


    @Override
    public void run() {
        System.out.println("inside run");
    }

    public static void main(String[] args) {
        ThreadCheck r = new ThreadCheck();
        Thread t = new Thread(r);
        t.start();

        //IllegalThreadStateException at run time if we start a thred agaion
        t.start();
    }
}
