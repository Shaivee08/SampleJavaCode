package com.java;


class CloneTest{
    int i;
}
public class ShallowCloning {

    public static void main(String[] args) {
        CloneTest cloneTest = new CloneTest();
        cloneTest.i=5;

        CloneTest cloneTest1 = cloneTest;
        cloneTest1.i=6;
        System.out.println(cloneTest1.i);
        System.out.println(cloneTest.i);

    }
}
