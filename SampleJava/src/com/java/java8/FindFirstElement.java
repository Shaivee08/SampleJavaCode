package com.java.java8;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindFirstElement {
    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(10, 15, 8, 49, 25, 98, 98, 32, 15);

        myList.stream().findFirst().ifPresent(System.out::println);

        Optional<Integer> i = myList.stream().findFirst();   // // int a = myList.stream().findFirst().get();

        System.out.println(i.get());

    }
}
