package com.java.practic;

public class AdjacentDuplicateRemove {

    public String removeDuplicates(String string) {

        if(string==null)
            return "string is empty";
        char[] chars = string.toCharArray();
        char previous = ' ';
        int i=0;
        for(char c : chars)
        {
            if(c!=previous)
            {
                chars[i++]=c;
                previous=c;

            }
        }

         return new String(chars).substring(0,i);
    }

    public static void main(String[] args) {
        AdjacentDuplicateRemove adj = new AdjacentDuplicateRemove();
        String string1 = "aabaarbarccrabmq";
        String string2 = "marry";
        System.out.println(adj.removeDuplicates(string1));
        System.out.println(adj.removeDuplicates(string2));
    }

}


/*//using recursion
    public String removeDuplicates(String word, int number) {
        for (int i = 1, count = 1; i < word.length(); i++) {
            count = word.charAt(i) == word.charAt(i - 1) ? count + 1 : 1;
            if (count == number)
                word = removeDuplicates(word.substring(0, i - number + 1) + word.substring(i + 1), number);
        }
        return word;
    }*/

