package com.test;

import java.util.*;

public class Test {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(4);
        list.add(1);

      int listMax =   list.stream().max(Integer::compareTo).get();
        System.out.println(listMax);


            HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
            hm.put(1, 1);
            hm.put(2,2);
            hm.put(3,3);
            Iterator<Integer> itr = hm.keySet().iterator();
            while(itr.hasNext())
            {
                Integer key =itr.next();
                System.out.println("Map value :" +hm.get(key));
                if(key.equals(2))
                    hm.put(4,4);
            }


    }
}
