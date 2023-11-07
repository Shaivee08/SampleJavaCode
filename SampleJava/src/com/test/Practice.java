package com.test;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Practice {
    public static void main(String[] args) {
       String check = IntStream.of(10,20,30).mapToObj((i) -> ""+i).collect(Collectors.joining("-"));

        System.out.println(check);

    }
}
