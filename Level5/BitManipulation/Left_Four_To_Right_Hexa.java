// Write a program to shift the left 4 bits to the right and right 4 bits to the left.

// For example, 15 is 0x0F and when left shift by 4 it would be 0xF0 which is 240

// Example 2: 52 in hexadecimal is 0x34 when swapped it becomes 0x43 which is 67

// SHOULD NOT CONVERT AND SOLVE THIS PROBLEM AS String. 
// Problem should be solved AS INTEGER ONLY USING BITWISE OPERATORS

// For example:

// Input	Result
// 52      67

// 120     135

import java.util.*;

public class Left_Four_To_Right_Hexa {
    public static void main(String h[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(((n & 0x0F) << 4 | (n & 0xF0) >> 4));
        sc.close();
    }
}