package com.java;

import java.util.HashMap;
import java.util.Map;

public class SpringsecondRepeted {
    public static void main(String[] args) {

        String str = "adcccddddbbcgg";

        char[] ch = str.toCharArray();

        HashMap<Character,Integer> hMap = new HashMap<>();

        for(int i=0;i< ch.length ; i++)
        {

            if(hMap.containsKey(ch[i]))
            {
                hMap.put(ch[i],hMap.get(ch[i])+1);
            }
            else {
                hMap.put(ch[i],1);
            }
        }

        hMap.entrySet().stream().sorted( (e, v)  -> e.getKey());
        int flag=0;
        for(Map.Entry<Character,Integer > entry : hMap.entrySet())
        {

            if(entry.getValue() >1) {
                flag=flag+1;
            }
            if(entry.getValue()> 1 && flag==2)
            {
                System.out.println(entry.getKey() + " " +entry.getValue());
            }
        }


    }
}
