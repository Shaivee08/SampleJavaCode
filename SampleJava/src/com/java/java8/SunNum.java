package com.java.java8;

import java.util.Arrays;
import java.util.List;

public class SunNum {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(4, 5, 6, 7, 1, 2, 3);
        // int sum = integerList.stream().mapToInt(Integer::intValue).sum();
        System.out.println(integerList.stream().mapToInt(Integer::intValue).sum());

    }
}