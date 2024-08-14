// Print the prime numbers which have digit 3 in the digit in the given range

// Input:
// Start Number

// End Number
// NOTE: Both start and end numbers are inclusiive
// Example:
// Input
// 10
// 20
// Output:
// 13

// NOTE: Even though 17 and 19 are prime numbers, they dont have digit 3

// Example:
// Input
// 13
// 15
// Output:
// 13

// For example:

// Input	Result
// 13      83 103 
// 15
// 13
// 80
// 110

import java.util.*;

public class Prime_Number_Contains_Three {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        for (int i = n; i <= m; i++) {
            if (isPrime(i)) {
                String z = "" + i;
                if (z.contains("3"))
                    System.out.print(i + " ");
            }
        }
        sc.close();
    }

    public static boolean isPrime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}