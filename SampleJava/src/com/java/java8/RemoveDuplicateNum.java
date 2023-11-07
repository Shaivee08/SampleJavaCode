package com.java.java8;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicateNum {

    public static void main(String[] args) {

        List<Integer> integerList = Arrays.asList(1,2,3,4,1,2,3);
        HashSet<Integer> hs = new HashSet<>();
        System.out.println("After removing duplicates : ");
     // Set<Integer> hs1 =  integerList.stream().collect(Collectors.toSet());

      integerList.stream().collect(Collectors.toSet()).forEach(System.out::print);

        integerList.stream().filter(a-> hs.add(a)).forEach(e -> System.out.println(e +" "));

    }

}

   /* The following will accumulate strings into a List:
        List<String> asList = stringStream.collect(Collectors.toList());
        The following will classify Person objects by city:
        Map<String, List<Person>> peopleByCity = personStream.collect(Collectors.groupingBy(Person::getCity));

        The following will classify Person objects by state and city, cascading two Collectors together:
Map<String, Map<String, List<Person>>> peopleByStateAndCity = personStream.collect(Collectors.groupingBy(Person::getState,Collectors.groupingBy(Person::getCity)));
*/
// Accumulate names into a TreeSet
// Set<String> set = people.stream().map(Person::getName).collect(Collectors.toCollection(TreeSet::new));
// Convert elements to strings and concatenate them, separated by commas
// String joined = things.stream().map(Object::toString).collect(Collectors.joining(", "));

// Compute sum of salaries of employee
// int total = employees.stream().collect(Collectors.summingInt(Employee::getSalary));


// Group employees by department
// Map<Department, List<Employee>> byDept = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment));

// Compute sum of salaries by department
// Map<Department, Integer> totalByDept = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.summingInt(Employee::getSalary)))