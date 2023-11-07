package com.java.java8;

import java.util.ArrayList;
import java.util.Arrays;

public class StringToArrayList {
    public static void main(String[] args)
    {
       /* String str = "Geeks";
        // split string by no space
        String[] strSplit = str.split("");
        */
        String str = "Geeks is the";
        // split string by no space
        String[] strSplit = str.split(" ");

        // Now convert string into ArrayList
        ArrayList<String> strList = new ArrayList<String>(
                Arrays.asList(strSplit));

        // Now print the ArrayList
        for (String s : strList)
            System.out.println(s);
    }
}
