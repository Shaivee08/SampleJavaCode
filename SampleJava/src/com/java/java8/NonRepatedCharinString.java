package com.java.java8;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.lang.Integer.parseInt;

public class NonRepatedCharinString {


    /*public static void main(String[] args) {
            String inputStr ="prepinsta";
            boolean flag = true;

            for(char i :inputStr.toCharArray())
            {
                // if current character is the last occurrence in the string
                if (inputStr.indexOf(i) == inputStr.lastIndexOf(i))
                {
                    System.out.println("First non-repeating character is: "+ i);
                    flag = false;
                    break;
                }
            }

            if(flag)
                System.out.println("There is no non repeating character in input string");

    }
}*/


    public static Character findFirstNonRepeating(String string) {
        Map<Character,Integer> map = new LinkedHashMap();

        for (Character ch : string.toCharArray()) {
            map.put(ch, map.containsKey(ch) ? map.get(ch)+ 1 : 1);
        }



        return map.entrySet().stream().filter(x -> x.getValue() == 1).findFirst().get().getKey();


    }


    public static void main(String[] args) {
        String string = "prepinsta";
        char character = findFirstNonRepeating(string);
        System.out.println("First non-repeating character is : " + character);

        String input = "Java articles are Awesome";

       }

   /* String str = "java";
    Character c = str.chars().mapToObj(s -> (char) s).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new,Collectors.counting()))
            .entrySet().stream().filter(s -> s.getValue() == 1).map(s -> s.getKey()).findFirst().get();
        System.out.println("c::"+c);*/
}
