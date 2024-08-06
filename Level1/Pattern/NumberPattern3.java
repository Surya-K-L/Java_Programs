// Write a program to print the current pattern

// For example:

// Input Result 
// 3     1 
//       1 1 
//       1 1 1

// 5     1 
//       1 1 
//       1 1 1 
//       1 1 1 1 
//       1 1 1 1 1

import java.util.*;
public class NumberPattern3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("1 ");
            }
            System.out.println();
        }
        sc.close();
    }
}
