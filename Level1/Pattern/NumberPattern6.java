// Write a program to print the following pattern based on input n

// For example:

// Input Result 
// 3     1 
//       2 3 
//       4 5 6

import java.util.*;
public class NumberPattern6 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(t++ + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}