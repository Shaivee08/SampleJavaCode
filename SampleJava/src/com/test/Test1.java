package com.test;

import java.util.ArrayList;
import java.util.List;
import java.util.NavigableSet;
import java.util.TreeSet;

public class Test1 {
    public static void main(String[] args) {

        NavigableSet<Integer> hset = new TreeSet<>();
        hset.add(11);
        hset.add(12);
        hset.add(13);
        hset.headSet(14);
        System.out.println(hset);

    }
}
