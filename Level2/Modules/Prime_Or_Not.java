// Write a program to check whether the given number is prime or not.

// Example

// sample input1:5

// sample output1:Prime Number

// sample input2:8

// sample output2:Not a Prime Number

import java.util.*;

public class Prime_Or_Not {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (isPrime(n)) {
            System.out.print("Prime Number");
        } else {
            System.out.print("Not a Prime Number");
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