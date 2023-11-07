package com.java.java8;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class EmpGroupByAge {


    public static void main(String[] args) {

        List<Employee1> empList = new ArrayList<>();
        empList.add(new Employee1("Ram", "rathore", 51000, "IT", 30));
        empList.add(new Employee1("sita", "roy", 10000, "MCA", 20));
        empList.add(new Employee1("Rajan", "rathod", 23000, "ECE", 20));
        empList.add(new Employee1("Ram", "sukla", 12000, "Mech", 30));
        empList.add(new Employee1("Sona", "patidaar", 22000, "IT", 22));


        //grouping list of emplyee on the basis of age
        Map<Integer, List<Employee1>> empMap = empList.stream().collect(Collectors.groupingBy(e -> e.getAge()));

        empMap.forEach((k, v) -> System.out.println("Key:" + k + " Value  " + v));
        System.out.println("___________________________________________________ ");
        //grouping list of employee on the basis of age and also make sure no repeated element ,       first name
        Map<Integer, Set<Employee1>> empSet = empList.stream().collect(Collectors.groupingBy(Employee1::getAge, Collectors.toSet()));
        empSet.forEach((k, v) -> System.out.println("Key:" + k + " Value  " + v));

        //grouping by in sorted asecding order
        Map<Integer, Set<Employee1>> empSetSortAsc = empList.stream().collect(Collectors.groupingBy(Employee1::getAge, TreeMap::new, Collectors.toSet()));

        System.out.println("___________________________________________________ ");

        Map<String, Long> countFirstName = empList.stream().collect(Collectors.groupingBy(Employee1::getFirstName, Collectors.counting()));
        countFirstName.forEach((k, v) -> System.out.println(k + " " + v));
        System.out.println("___________________________________________________ ");
        //Hash Map value count wala login
        List<String> nameStrList = empList.stream().map(name -> name.getFirstName()).collect(Collectors.toList());

        Map<String, Long> hmap = nameStrList.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        Set<String> sh = hmap.entrySet().stream().filter(entry -> entry.getValue() > 1).map(entry -> entry.getKey()).collect(Collectors.toSet());
        sh.forEach(i -> System.out.println(i));

        //another way to do it is
        //  Set<String> sh1=  nameStrList.


    }
}
