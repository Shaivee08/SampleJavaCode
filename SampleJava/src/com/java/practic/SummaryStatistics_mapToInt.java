package com.java.practic;



import com.java.java8.Employee1;

import java.util.ArrayList;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class SummaryStatistics_mapToInt {

    public static void main(String[] args) {
        List<Employee1> empList = new ArrayList<>();
        empList.add(new Employee1("Ram", "rathore", 51000, "IT",30));
        empList.add(new Employee1("sita", "roy", 10000, "MCA",20));
        empList.add(new Employee1("Rajan", "rathod", 23000, "ECE",20));
        empList.add(new Employee1("Ram", "sukla", 12000, "Mech",30));
        empList.add(new Employee1("Sona", "patidaar", 22000, "IT",22));


        //getMin() getMax() getSum() getAverage() getSum() getCount()

        List<Integer> ages = empList.stream().map(e -> e.getAge()).collect(Collectors.toList());
        IntSummaryStatistics summary= ages.stream().mapToInt(x -> x).summaryStatistics();
        int max = summary.getMax();
        int ab =  ages.stream().mapToInt(x -> x).summaryStatistics().getMin();
        System.out.println(" min age " + ab);

        List<Integer> ages1= ages.stream().skip(1).limit(2).collect(Collectors.toList());
        System.out.println(ages1);

        //find name of each element and saparate it by ,

        List<String> nameList = empList.stream().map(e -> e.getFirstName()).collect(Collectors.toList());
       String sName = nameList.stream().map(name -> name.toUpperCase()).collect(Collectors.joining(",  "));
        System.out.println("String name" + sName);
    }


}
