package com.java.java8;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StringJoining {

    public static void main(String[] args) {
        String s = "i am the girl";
        String[] str = s.split(" ");


        String collect1 = Arrays.asList(str).stream().collect(Collectors.joining(" - "));
        System.out.println("data is :"+ collect1);

        String abc = IntStream.of(10,20,30,40).mapToObj(a -> a+"").collect(Collectors.joining("-"));
        System.out.println(" abc is "+ abc);
    }

}
