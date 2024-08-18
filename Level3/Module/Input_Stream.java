// Given an input stream of n values.Your job is to insert these numbers into a new empty stream one by one and after each insertion,print the median of all values read so far,starting from the first integer till the last.

// Fill your code here

// Input format

// The first line of input contains an integer N denoting the number of elements in the stream.Then the next N lines contain integer X denoting the number to be inserted into the stream.

// Output format

// For each element added to the stream print the floor of the new median in a new line.

// For example:

// Input 4 
//       5 15 1 3

// Result:5 10 5 4

import java.util.*;
public class Input_Stream {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        int t[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            for (int j = 0; j <= i; j++) {
                t[i] = a[j];
            }
            for (int k = 0; k <= i - 1; k++) {
                for (int l = 0; l <= i - k - 1; l++) {
                    int temp = 0;
                    if (t[l] > t[l + 1]) {
                        temp = t[l];
                        t[l] = t[l + 1];
                        t[l + 1] = temp;
                    }
                }
            }
            if (i % 2 == 0)
                System.out.println(t[i / 2]);
            else
                System.out.println((t[i / 2] + t[(i / 2 + 1)]) / 2);
        }
        sc.close();
    }
}
