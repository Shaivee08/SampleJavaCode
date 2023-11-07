package com.java.java8;

import com.sun.jdi.IntegerValue;

import java.util.Arrays;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.*;

public class MaxNum {
    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(10, 15, 8, 49, 25, 98, 98, 32, 15);
        List<Double> doubleList = Arrays.asList(10.5, 15.6);
        int max = myList.stream().max(Integer::compareTo).get();
       // myList.stream().mapToInt(Integer::intValue).max();
        IntSummaryStatistics intSummaryStatistics = myList.stream().mapToInt(Integer::intValue).summaryStatistics();
        System.out.println("intSummaryStatistics"+intSummaryStatistics);
        doubleList.stream().mapToDouble(Double::doubleValue).max();
        Integer min = Stream.of(1, 2, 3, 4, 5, 6,7)
                .min(Comparator.comparing(Integer::valueOf))
                .get();

        int multiply = myList.stream().filter(b -> b%2==0).reduce(1,(a,b) -> a*b);
        System.out.println("multiply : "+multiply);
        //reduction
       /* Integer sum = integers.reduce(0, (a, b) -> a+b); or
        Integer sum = integers.reduce(0, Integer::sum);*/
      int b =  myList.stream().filter(a->a%2==0).reduce(0, (ans,i)-> ans+i);
      myList.stream().skip(2).forEach(a-> System.out.print(a+" "));
        System.out.println("\n  sum of even numbers "+b);
        System.out.println(max);
        System.out.println(min);
    }
}
