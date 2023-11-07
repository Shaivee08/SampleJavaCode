package com.java.practic;

public class PrimeNumber {
    private static boolean primeNum(int n)
    {
        if(n==1)
            return true;
        for(int i=2;i<n/2;i++)
        {
            if(n%i==0)
                return false;
        }
        return true;
    }
   public static void primeTill100()
    {
        for(int i=2;i<100;i++)
        {
            boolean check=true;
            for(int j=2;j<i;j++)
            {
                if(i%j==0)
                {
                    check=false;
                    break;
                }
            }
            if(check==true)
                System.out.print( " "+i);
        }
    }
    public static void main(String[] args) {
        if(primeNum(12))
        System.out.println("Prime");
        else
            System.out.println("Not Prime");

        primeTill100();
    }
}
