// Develop a program to interchange the first and last elements in the Array.

// Input Format:

// The first line of input N denotes the size of the list followed by N integers.

// For example:

// Input                   Result 
// 8                       23 29 51 9 17 6 7 1 
// 1 29 51 9 17 6 7 23

// 5                       5 2 3 4 1
// 1 2 3 4 5

import java.util.*;

public class Array_First_Last_Swap {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int t = a[n - 1];
        a[n - 1] = a[0];
        a[0] = t;
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        sc.close();
    }
}
