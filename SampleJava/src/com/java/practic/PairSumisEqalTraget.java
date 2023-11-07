package com.java.practic;
import java.util.HashMap;
public class PairSumisEqalTraget {


   /* Input:  arr[] = {10, 12, 10, 15, -1, 7, 6, 5, 4, 2, 1, 1, 1}, sum = 11
    Output:  9
    Explanation: Pairs with sum 11 are (10, 1), (10, 1), (10, 1), (12, -1), (10, 1), (10, 1), (10, 1), (7, 4), (6, 5).*/

    static int arr[] = new int[]{1, 5, 7, -1, 5};

    // Returns number of pairs in arr[0..n-1] with sum equal
    // to 'sum'
       /* static int getPairsCount(int n, int sum)
        {
            HashMap<Integer, Integer> hm = new HashMap<>();

            // Store counts of all elements in map hm
            for (int i = 0; i < n; i++) {

                // initializing value to 0, if key not found
                if (!hm.containsKey(arr[i]))
                    hm.put(arr[i], 0);

                hm.put(arr[i], hm.get(arr[i]) + 1);
            }
            int twice_count = 0;

            // iterate through each element and increment the
            // count (Notice that every pair is counted twice)
            for (int i = 0; i < n; i++) {
                if (hm.get(sum - arr[i]) != null)
                    twice_count += hm.get(sum - arr[i]);

                // if (arr[i], arr[i]) pair satisfies the
                // condition, then we need to ensure that the
                // count is decreased by one such that the
                // (arr[i], arr[i]) pair is not considered
                if (sum - arr[i] == arr[i])
                    twice_count--;
            }

            // return the half of twice_count
            return twice_count / 2;
        }
*/
        // Driver method to test the above function
        public static void main(String[] args)
        {

            int sum = 6;
           /* System.out.println(
                    "Count of pairs is "*/
            printPairs( arr, arr.length, sum);
        }


    static void printPairs(int arr[], int n,
                           int sum) {


        // Store counts of all elements in map m
        HashMap<Integer,
                Integer> mp = new HashMap<Integer,
                Integer>();

        // Traverse through all elements
        for (int i = 0; i < n; i++) {

            // Search if a pair can be formed with
            // arr[i].
            int rem = sum - arr[i];
            if (mp.containsKey(rem)) {
                int count = mp.get(rem);

                for (int j = 0; j < count; j++)
                    System.out.print("(" + rem +
                            ", " + arr[i] +
                            ")" + "\n");
            }
            if (mp.containsKey(arr[i])) {
                mp.put(arr[i], mp.get(arr[i]) + 1);
            } else {
                mp.put(arr[i], 1);
            }

        }

    }
}
   /* public static void printPairs(int[] arr, int n, int sum) {
        Set<Integer> s = new HashSet<>();
        for (int i = 0; i < n; i++) {
            int temp = sum - arr[i];
            if (s.contains(temp)) {
                System.out.println("(" + temp + ", " + arr[i] + ")");
            }
            s.add(arr[i]);
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 5, 7, -1, 5};
        int sum = 6;
        int n = arr.length;
        printPairs(arr, n, sum);
    }*/