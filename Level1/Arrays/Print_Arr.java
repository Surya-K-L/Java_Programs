// Write a program to get elements and store in array and display it

// Input       Result 
// 4           1 2 3 4
// 1 2 3 4 

import java.util.*;

public class Print_Arr {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        sc.close();
    }
}