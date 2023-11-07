package com.java;

public class SegregateEvenOddInArray {

    public static void Segregate(int a[])
    {
        int left=0;
        int right = a.length-1;
        while(left<right)
        {
            if(a[left]%2==0 && left<right)
                left++;
            if(a[right]%2==1 & left<right)
                right--;

            if(left<right)
            {
                int temp= a[left];
                a[left]=a[right];
                a[right]=temp;
                left++;
                right--;
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {12, 34, 45, 9, 8, 90, 3};
        Segregate(arr);

        System.out.print("Array after segregation ");
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i]+" ");
    }
}

   /* static void rearrangeEvenAndOdd(int arr[], int n)
    {
        // variables
        int j = -1,temp;

        // quick sort method
        for (int i = 0; i < n; i++) {

            // if array of element
            // is odd then swap
            if (arr[i] % 2 == 0) {

                // increment j by one
                j++;

                // swap the element
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
    }*/