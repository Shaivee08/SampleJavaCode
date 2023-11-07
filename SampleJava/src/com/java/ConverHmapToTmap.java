package com.java;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class ConverHmapToTmap {

    //  method to construct a new `TreeMap` from `HashMap`
    public static <K,V> Map<K,V> getTreeMap(Map<K,V> hashMap){

        TreeMap<K,V> treeMap = hashMap.entrySet().stream().
                        collect(Collectors.toMap(Map.Entry::getKey,Map.Entry:: getValue,(oldvalue,newvalue)->newvalue,TreeMap::new));
        return treeMap;
    }

    /*// Generic method to construct a new `TreeMap` from `HashMap`
    public static <K, V> Map<K, V> getTreeMap(Map<K, V> hashMap)
    {
        Map<K, V> treeMap = new TreeMap<>();
        for (Map.Entry<K, V> kvEntry : hashMap.entrySet()) {
            treeMap.put(kvEntry.getKey(), kvEntry.getValue());
        }
        return treeMap;
    }*/
    public static void main(String[] args)
    {
        Map<String, String> hashMap = new HashMap<>();

        hashMap.put("RED", "#FF0000");
        hashMap.put("BLUE", "#0000FF");
        hashMap.put("GREEN", "#008000");

        // construct a new `TreeMap` from `HashMap`
        Map<String, String> treeMap = getTreeMap(hashMap);
        System.out.println(treeMap);
    }
}
