// Develop a program to print ascending and descending of a number

// Example

// 5

// 1 5 2 4 3 3 4 2 5 1

// In the above,alternate numbers are ascending 1 to 5 and alternate numbers are descending from 5 to 1

// Constraints

// 1<=N<=1000

// For example:

// Input   Result 
// 5       1 5 2 4 3 3 4 2 5 1

import java.util.*;
public class Ascending_Descending {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), t = n;
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
            System.out.print(t-- + " ");
        }
        sc.close();
    }
}
