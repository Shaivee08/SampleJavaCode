package com.java.practic;

public class SecondLargestInArray {
    private static void nthLargest(int[] arr,int asize)
    {
        int largest =0;
        int secondLargest=0;
        if(asize<2)
            System.out.println("can not find the 2nd highest");
        for(int i=0;i<asize;i++)
        {
            if(arr[i]>largest)
            {
                secondLargest=largest;
                largest=arr[i];
            }
            else if(arr[i]>secondLargest)
            {
                secondLargest=arr[i];
            }
        }
        System.out.println("secondLargest  :"+secondLargest );
        System.out.println("Largest  :"+largest );
    }

    public static void main(String[] args) {
        int arr[]={1,40,10,12};
        int arrsize = arr.length;
        nthLargest(arr,arrsize);
    }
}
