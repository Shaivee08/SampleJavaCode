package com.java.java8;

public interface GFG {

    default void display() {
        System.out.println("GEEKSFORGEEKS");
    }

    default void check()
    {
        System.out.println("check one ");
    }
}
  /*  arraylist to hashmap using java 8
  public static void main(String[] args)
   {

        // creating arraylist to add elements
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Banana");
        fruits.add("Guava");
        fruits.add("Pineapple");
        fruits.add("Apple");

        // printing contents of arraylist before conversion
        System.out.println("Elements in ArrayList are : "
                + fruits);

        // creating new hashmap and using method reference
        // with necessary classes for the conversion
        HashMap<String, Integer> res = fruits.stream().collect(Collectors.toMap(
                Function.identity(), String::length,
                (e1, e2) -> e1, HashMap::new));

        // printing the elements of the hashmap
        System.out.println("Elements in HashMap are : "
                + res);
    }*/