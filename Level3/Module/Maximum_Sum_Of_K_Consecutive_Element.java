// Given an array of integers of size‘n’,Our aim is to calculate the maximum sum of‘k’consecutive elements in the array.nput:arr[]={100,200,300,400},k=2 Output:700

// Input:arr[]={1,4,2,10,23,3,1,0,20},k=4 Output:39 We get maximum sum by adding subarray{4,2,10,23}of size 4.

// Input:arr[]={2,3},k=3 Output:Invalid There is no subarray of size 3 as size of whole array is 2.

// For example:

// Input Result 4 100 200 300 400 2 700 9 1 4 2 10 23 3 1 0 20 4 39

import java.util.*;

public class Maximum_Sum_Of_K_Consecutive_Element {
    public static void main(String h[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int k = sc.nextInt(), max = a[0];
        if (n > k) {
            for (int i = 0; i < n - k + 1; i++) {
                int sum = 0;
                for (int j = i; j < i + k; j++)
                    sum += a[j];
                max = Math.max(sum, max);
            }
            System.out.println(max);
        } else
            System.out.print("Invalid");
        sc.close();

    }
}