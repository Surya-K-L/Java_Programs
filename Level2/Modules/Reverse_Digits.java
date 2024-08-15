// Write a program to reverse the digits of a given number NOTE:Number is a positive number that does not end with 0

// Constraint:You cannot convert it to a string

// Input:

// 7348

// Output:8437

// Input:1239

// Output:9321

import java.util.*;
public class Reverse_Digits {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), rev = 0;
        while (n > 0) {
            int t = n % 10;
            rev = rev * 10 + t;
            n /= 10;
        }
        System.out.print(rev);
        sc.close();
    }
}