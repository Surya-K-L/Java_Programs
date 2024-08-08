// Write a program to add only the positive elements in the array

// For example:

// Input               Result 
// 5                   90 
// 10-20 30-40 50 

// 6                   60
// 10 20 30-40-50-60

import java.util.*;

public class Add_Only_Positive {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n], ans = 0;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            if (a[i] > 0) {
                ans += a[i];
            }
        }
        System.out.print(ans);
        sc.close();
    }
}