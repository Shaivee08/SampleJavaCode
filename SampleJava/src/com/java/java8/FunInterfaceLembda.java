package com.java.java8;

@FunctionalInterface
interface Square {
    int calculate(int x);
    //int sum (int b );
    default void  abc()
    {
        System.out.println("abc is ");
    }
}

class FunInterfaceLembda {
    public static void main(String args[])
    {
        int a = 5;

        // lambda expression to define the calculate method
        Square s = (int x) -> x * x;

        // parameter passed and return type must be
        // same as defined in the prototype
        int ans = s.calculate(a);
        System.out.println(ans);
    }
}


/*
@FunctionalInterface
public interface Runnable {
    void run();
}
public class RunnableLambdaTest {
   public static void main(String[] args) {
      Runnable r1 = new Runnable() {
         @Override
         public void run() { // anonymous class
            System.out.println("Runnable with Anonymous Class");
         }
      };
      Runnable r2 = () -> {   // lambda expression
         System.out.println("Runnable with Lambda Expression");
      };
      new Thread(r1).start();
      new Thread(r2).start();
   }
}.




*/
