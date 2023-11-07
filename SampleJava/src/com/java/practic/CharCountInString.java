package com.java.practic;

import java.util.HashMap;

public class CharCountInString {
    public static void main(String[] args) {
        String s = "i am the good girl good";
        char[] ch = s.toCharArray();
        String[] str = s.split(" ");
        HashMap<Character,Integer> StrHm = new HashMap<>();
        for(int i=0;i< ch.length-1;i++)
        {
            if(StrHm.containsKey(ch[i]))
                StrHm.put(ch[i], StrHm.get(ch[i])+1);
            else
                StrHm.put(ch[i], 1);
        }
        System.out.println(StrHm);

        HashMap<String,Integer> strHm = new HashMap<>();
        for(int j=0;j< str.length;j++)
        {
            if(strHm.containsKey(str[j]))
                strHm.put(str[j], strHm.get(str[j])+1);
            else
                strHm.put(str[j], 1);
        }
        System.out.println(strHm);
    }
}
