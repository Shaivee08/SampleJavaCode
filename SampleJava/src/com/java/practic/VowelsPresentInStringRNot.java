package com.java.practic;

public class VowelsPresentInStringRNot {

    public static boolean Vowelcheck(String str)
    {
        char[] vowelArr = {'a','e','i','o','u'};
        for(int i=0;i<str.length();i++) {
            for (int j = 0; j < vowelArr.length; j++) {
                if (str.charAt(i) == vowelArr[j])
                    return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String str1  = "i am vipin's love";
        System.out.println(Vowelcheck(str1));

    }

}
