package com.java.java8;

import java.util.*;
import java.util.stream.Collectors;

public class SortElement {
    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);

        myList.stream().sorted().forEach(System.out::println);
        List<Integer> list = myList.stream().sorted().collect(Collectors.toList());
        System.out.println(list);

        List<Employee1> empList = new ArrayList<>();
        empList.add(new Employee1("Ram", "rathore", 51000, "IT",30));
        empList.add(new Employee1("sita", "roy", 10000, "MCA",20));
        empList.add(new Employee1("Rajan", "rathod", 23000, "ECE",20));
        empList.add(new Employee1("Ram", "sukla", 12000, "Mech",30));
        empList.add(new Employee1("Sona", "patidaar", 22000, "IT",22));

        //sort employee data on the basis of department
        List<Employee1> empListByDept= empList.stream().sorted(Comparator.comparing(Employee1::getDepartment)).collect(Collectors.toList());
        empListByDept.forEach(a -> System.out.println(" " +a));

        System.out.println("________________________________________ Reverse order");
        List<Employee1> empListByDeptRev = empList.stream().sorted(Comparator.comparing(Employee1::getDepartment).reversed()).collect(Collectors.toList());
        empListByDeptRev.forEach(a -> System.out.println(" " +a));
        // in decending order
        myList.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);


    }
}
