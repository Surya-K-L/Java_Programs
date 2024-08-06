// Print the given pattern for a given number

// For example:

// Input Result 
// 3     1 1 1 
//       2 2 2 
//       3 3 3

// 4     1 1 1 1 
//       2 2 2 2 
//       3 3 3 3 
//       4 4 4 4

import java.util.*;

public class NumberPattern2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print((i + 1) + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}