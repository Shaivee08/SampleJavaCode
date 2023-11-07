package com.java.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Student {
    String name;
    int score;
    Student(String name, int score)
    {
        this.name=name;
        this.score=score;
    }

    public static void main(String[] args) {
        List<Student> sList = new ArrayList<>();
        sList.add(new Student("ram", 10));
        sList.add(new Student("sita", 15));
        sList.add(new Student("lakhan", 5));

        sList.stream().filter(a -> a.score > 10).forEach(e-> System.out.println(e.name));

        sList.stream().filter(s -> s.score>10).forEach(a -> System.out.println(a.name + ":" + a.score));
      //  System.out.println(collect);
    }
}
