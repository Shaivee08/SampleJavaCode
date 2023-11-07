package com.java.practic;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class TwoArrayContainsSame {

    public static void main(String[] args) {
        Integer[] arr1 = {1,2,3,1,2};
        Integer[] arr2 = {3,2,1};
        Integer[] arr3 = {1,3,5,8};

        Set<Object> list1 = new HashSet<Object>(Arrays.asList(arr1));
        Set<Object> list2 = new HashSet<Object>(Arrays.asList(arr2));
        Set<Object> list3 = new HashSet<Object>(Arrays.asList(arr3));
        System.out.println(arrContain(list1,list2));
        System.out.println(arrContain(list2,list3));
    }
    private static boolean arrContain(Object a1, Object a2)
    {
        if(a1.equals(a2))
            return true;

        return false;
    }


}
