package com.java.java8;

import java.util.*;
import java.util.stream.Collectors;

public class EmpAvgSalary {


    public static void main(String[] args) {
        List<Employee1> eList = new ArrayList<>();
        eList.add(new Employee1("Ram", "rathore", 51000, "IT", 30));
        eList.add(new Employee1("sita", "roy", 10000, "MCA", 20));
        eList.add(new Employee1("Rajan", "rathod", 23000, "ECE", 30));
        eList.add(new Employee1("Pawan", "sukla", 12000, "Mech", 20));
        eList.add(new Employee1("Sona", "patidaar", 22000, "IT", 22));

        List<Integer> list = Arrays.asList(1, 4, 6, 7);
        OptionalDouble average = list.stream().mapToInt(Integer::intValue).average();
        System.out.println("average" + average);

        double avgSal = eList.stream().mapToDouble(e -> e.getSalary()).average().getAsDouble();
        List<Employee1> aList = eList.stream().filter(a -> a.getSalary() > avgSal).collect(Collectors.toList());


        //converting list to Linkedlist
        LinkedList elist = eList.stream().collect(Collectors.toCollection(LinkedList::new));


        System.out.println("Avarage salaray :" + avgSal);
        System.out.println("employee list of average salary above:" + aList);

        List filterList =  eList.stream().filter(e -> e.getSalary() > 1000 && e.getDepartment() == "IT").collect(Collectors.toList());
        List mapList = eList.stream().map(e -> e.getSalary() > 1000 && e.getDepartment() == "IT").collect(Collectors.toList());
        System.out.println("mapList"+mapList);
        System.out.println("filterList"+filterList);

    }


    /*int total = employees.stream()
            .collect(Collectors.summingInt(Employee::getSalary));

    int totalSalByDept = employees.stream().
            filter(name -> 1000 == name.getDeptId())
            .collect(Collectors.summingInt(Employee::getSalary));

  System.out.println("Total Employees Salary : " + total);
  System.out.println("Total Employees Salary of 1000 Dept : " + totalSalByDept);*/

}
