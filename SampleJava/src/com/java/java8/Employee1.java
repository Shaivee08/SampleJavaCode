package com.java.java8;

import java.util.Objects;

public class Employee1 {
        private String firstName;
        private String lastName;
        private double salary;
        private String department;
        private int age;

        // constructor


    public Employee1(String firstName, String lastName, double salary, String department, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.department = department;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // set firstName
        public void setFirstName(String firstName)
        {
            this.firstName = firstName;
        }

        // get firstName
        public String getFirstName()
        {
            return firstName;
        }

        // set lastName
        public void setLastName(String lastName)
        {
            this.lastName = lastName;
        }

        // get lastName
        public String getLastName()
        {
            return lastName;
        }

        // set salary
        public void setSalary(double salary)
        {
            this.salary = salary;
        }

        // get salary
        public double getSalary()
        {
            return salary;
        }

        // set department
        public void setDepartment(String department)
        {
            this.department = department;
        }

        // get department
        public String getDepartment()
        {
            return department;
        }

        // return Employee's first and last name combined
        public String getName()
        {
            return String.format("%s %s", getFirstName(), getLastName());
        }

    @Override
    public String toString() {
        return "Employee1{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee1)) return false;
        Employee1 employee1 = (Employee1) o;
        return firstName.equals(employee1.firstName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName);
    }
}
