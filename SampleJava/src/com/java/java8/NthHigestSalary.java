package com.java.java8;

import java.util.*;
import java.util.stream.Collectors;

public class NthHigestSalary {

    public static void main(String[] args) {


        Map<String, Integer> map2 = new HashMap<>();
        map2.put("anil", 1000);
        map2.put("ankit", 1200);
        map2.put("bhavna", 1200);
        map2.put("james", 1200);
        map2.put("micael", 1000);
        map2.put("tom", 1500);
        map2.put("daniel", 1300);

        Map.Entry<Integer, List<String>> finalResult2 = map2.entrySet()
                .stream()
                .collect(Collectors.groupingBy(entry -> entry.getValue(),
                        Collectors.mapping(entry -> entry.getKey(), Collectors.toList())
                ))
                .entrySet()
                .stream()
                .sorted(Comparator.comparing(it -> it.getKey()))
                .toList()
                .get(3);

        //  System.out.println(finalResult2);

       /* map2.entrySet()
                .stream()
                .sorted(Comparator.comparing(entry -> entry.getValue()))
                .map(e->e.getValue())// minus make it to do in desc order
                .collect(Collectors.toSet())
                .forEach(System.out::println);
*/

        Integer sal = map2.
                entrySet().
                stream().
                map(e -> e.getValue()).
                distinct().
                sorted(Comparator.reverseOrder()).
                toList()
                .get(3);

        System.out.println("salary" + sal);

        List<Employee1> eList = new ArrayList<>();
        eList.add(new Employee1("Ram", "rathore", 51000, "IT", 30));
        eList.add(new Employee1("sita", "roy", 10000, "MCA", 20));
        eList.add(new Employee1("sita111", "roy", 10000, "MCA", 20));
        eList.add(new Employee1("Rajan", "rathod", 23000, "ECE", 30));
        eList.add(new Employee1("Pawan", "sukla", 12000, "Mech", 20));
        eList.add(new Employee1("Sona", "patidaar", 22000, "IT", 22));

        Double v = eList.stream().map(e -> e.getSalary()).distinct().sorted(Comparator.reverseOrder()).toList().get(1);
        System.out.println("emp salary:: " + v);

        Map<Double, List<Employee1>> collect = eList.stream().sorted(Comparator.comparing(e -> e.getSalary(), Comparator.reverseOrder())).collect(Collectors.groupingBy(e -> e.getSalary(), Collectors.toList()));
        System.out.println("collect" + collect);

       // eList.stream().sorted(Comparator.comparing(e -> e.getSalary(), Comparator.reverseOrder())).forEach(System.out::println);

    }
//https://medium.com/@anil.java.story/second-highest-salary-using-java-streams-api-d8b5eb8051b5
}
// Test Case 2 : Duplicate Employee List
/*
    List<Employee> empList2 = Arrays.asList(
            new Employee(11, "Sagar", 4400, "SALES"),
            new Employee(101, "Manish", 5000, "IT"),
            new Employee(109, "Atul", 3000, "HR"),
            new Employee(166, "Santosh", 4400, "IT"),
            new Employee(109, "Rupendra", 3200, "FIN"),
            new Employee(411, "Priyanka", 4400, "ADMIN")
    );

    Map.Entry<Integer, List<String>> nthHighestSalary2 = getNthHighestSalary(empList2, 3);
        System.out.println("Test Case 2: " + nthHighestSalary2);
                }

private static Map.Entry<Integer, List<String>> getNthHighestSalary(List<Employee> empList, int nth) {

        if (empList.isEmpty() || nth <= 0 || empList.size() < nth)
        throw new IllegalArgumentException("Please validate your inputs.");

        return empList.stream()
        .collect(Collectors.groupingBy(Employee::getSalary, Collectors.mapping(Employee::getName, Collectors.toList())
        ))
        .entrySet()
        .stream()
        .sorted(Collections.reverseOrder(Map.Entry.comparingByKey()))
        .collect(Collectors.toList())
        .get(nth - 1);
        }*/
