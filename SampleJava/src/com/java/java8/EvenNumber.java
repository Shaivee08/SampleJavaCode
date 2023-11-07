package com.java.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenNumber {
    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,32);

        myList  =   myList.stream().filter(m -> m%2 ==0).collect(Collectors.toList());
        System.out.println(myList);

        myList.stream().filter(m -> m%2 ==0).forEach(System.out::println);

        //lenghth of string each words
        List<String> alphabets = Arrays.asList("ac","cdjh","tdf","brty");
       alphabets.stream()
                .map(s -> s.length()).forEach(e -> System.out.print(e+" "));

    }
}
