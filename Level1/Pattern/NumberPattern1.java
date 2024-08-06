// Print the given square pattern

// For example:

// Input Result 
// 2     1 2 
//       1 2

// 3     1 2 3 
//       1 2 3 
//       1 2 3

import java.util.*;
public class NumberPattern1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print((j + 1) + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}