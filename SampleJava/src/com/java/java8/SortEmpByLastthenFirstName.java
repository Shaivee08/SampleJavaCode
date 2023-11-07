package com.java.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SortEmpByLastthenFirstName {

    public static void main(String[] args) {
        Employee1[] employees = {
                new Employee1("J", "Red", 51000, "IT",20),
                new Employee1("A", "Green", 71600, "IT",30),
                new Employee1("M", "Black", 35187.5, "Sales",24),
                new Employee1("K", "Yellow", 47100.77, "Marketing",20),
                new Employee1("L", "Pink", 62001, "IT",30),
                new Employee1("D", "Blue", 32001, "Sales",29),
                new Employee1("W", "Brown", 42361.4, "Marketing",22)};

        // get List view of the Employees
        List<Employee1> list = Arrays.asList(employees);

        // display all Employees
        System.out.println("Complete Employee list:");
        list.stream().forEach(System.out::println);


        // Functions for getting first and last names from an Employee
        Function<Employee1, String> byFirstName =  a -> a.getFirstName();//Employee1::getFirstName;
        Function<Employee1, String> byLastName = Employee1::getLastName;

        // Comparator for comparing Employees by first name then last name
        Comparator<Employee1> lastThenFirst =
                Comparator.comparing(byLastName).thenComparing(byFirstName);

        // sort employees by last name, then first name
        System.out.printf(
                "%nEmployees in ascending order by last name then first:%n");
        list.stream()
                .sorted(lastThenFirst)
                .forEach(System.out::println);

       // list.stream().sorted(Comparator.comparing(Employee1::getLastName).thenComparing(Employee1::getFirstName)).collect(Collectors.toList());
    }
}
