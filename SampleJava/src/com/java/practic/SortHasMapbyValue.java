package com.java.practic;

import java.util.*;

public class SortHasMapbyValue {

    public static void main(String[] args) {
        HashMap<String,Integer> hm = new HashMap<>();
        hm.put("jhon",123);
        hm.put("ron",234);
        hm.put("tom",39);
        hm.put("ytr",193);
        hm.put("poi",5);

        List<Map.Entry<String,Integer>> mapList= new ArrayList<>(hm.entrySet());

       // Collections.sort(mapList, ((o1, o2) -> o1.getValue().compareTo(o2.getValue())));
        Collections.sort(mapList, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o1.getValue().compareTo(o2.getValue());
            }
        });
        HashMap<String,Integer> hmSorted = new LinkedHashMap<>();
        for(Map.Entry<String,Integer> s : mapList)
        {
            hmSorted.put(s.getKey(),s.getValue());
        }
        System.out.println(hmSorted);


    }
}
/*

if (m1.getRating() < m2.getRating())
        return -1;
        if (m1.getRating() > m2.getRating())
        return 1;
        else
        return 0;
        }*/
