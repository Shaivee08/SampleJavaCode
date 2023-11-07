package com.java.practic;

import java.util.HashSet;

class Employee
{
    int id;
    String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
public class HashSetNullCheck {

    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<String>();
        hs.add("abc");
        hs.add("xyz");
        hs.add(null);
        hs.add("abc");
        hs.add(null);

        Employee emp =  null;        // new Employee(0,null);
        Employee emp1 = null;         //new Employee(0,null);

        HashSet<Object> hObj = new HashSet<Object>();
        hObj.add(emp);
        hObj.add(emp1);
        System.out.println("hash set " + hs);
        System.out.println(" Object hash set " + hObj);


    }


}
