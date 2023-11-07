package com.java.practic;

public class StringReverse {

    public static void main(String[] args) {
        String str= "hello";
        StringBuilder strRev = new StringBuilder();
        for(int i=str.length()-1; i>=0;i--)
        {
            strRev.append(str.charAt(i));
        }
        System.out.println(strRev);

        String str1 ="i am vipin's wifey";
        char ch[] = str1.toCharArray();
        StringBuilder strRev1 = new StringBuilder();
        for(int i=ch.length-1; i>=0;i--)
        {
            strRev1.append(ch[i]);
        }
        System.out.println(strRev1);

    }

}
