package com.java.java8;

import java.util.Arrays;
import java.util.List;

public class NumStartingWithOne {
    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,32);

        // this line to make Integer to String -- map(s -> s+"").
        myList.stream().map(s -> s+"").filter(r -> r.startsWith("1")).forEach(System.out::println);

    }
}
