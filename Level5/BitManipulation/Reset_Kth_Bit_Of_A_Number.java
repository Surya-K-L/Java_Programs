// Given a number N, the task is to reset, the K-th bit of this number N. 

// For Example:

// Input: N = 5, K = 1
// Output: 4
// Explanation: 
// 5 is represented as 101 in binary and has its first bit 1, so resetting the kth bit will result in 100 i.e. 4.


// SHOULD NOT CONVERT AND SOLVE THIS PROBLEM AS String. 
// Problem should be solved AS INTEGER ONLY USING BITWISE OPERATORS

// For example:

// Input	Result
// 10      8
// 2

import java.util.*;
public class Reset_Kth_Bit_Of_A_Number{
    public static void main(String h[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),k=sc.nextInt();
        System.out.print(n^(1<<k-1));
        sc.close();
    }
}