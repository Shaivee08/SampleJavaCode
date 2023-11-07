package com.java.practic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeSortByName {

    public static void main(String[] args) {
        List<Employee> list = new ArrayList<Employee>();
        list.add(new Employee(101,"seema"));
        list.add(new Employee(102,"rina"));
        list.add(new Employee(104,"chhaya"));
        list.add(new Employee(105,"ramu"));

       // list =  list.stream().sorted((e1,e2) -> (e1.getName().compareTo(e2.getName()))).collect(Collectors.toList());
        list.stream().sorted(Comparator.comparing(Employee::getName)).forEach(System.out :: println);
      //  List<Employee> list = list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println("sorted List :" +list);
    }




}
