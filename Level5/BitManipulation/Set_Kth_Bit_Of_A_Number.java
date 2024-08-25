// Given a number N, the task is to set the K-th bit of this number N. 

// Setting a bit means that if the K-th bit is 0, then set it to 1 and if it is 1 then leave it unchanged.

// Input:
// N = 5, K = 1

// Output: 
// 5

// Explanation: 
// 5 is represented as 101 in binary and has its first bit 1, so setting it will result in 101 i.e. 5.

// SHOULD NOT CONVERT AND SOLVE THIS PROBLEM AS String. 
// Problem should be solved AS INTEGER ONLY USING BITWISE OPERATORS

// For example:

// Input	Result
// 10      11
// 1

// 10      14
// 3

// 30      31
// 1


import java.util.*;
public class Set_Kth_Bit_Of_A_Number{
    public static void main(String h[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),k=sc.nextInt();
        int num=(int)Math.pow(2,k-1);
        System.out.print((n&num)==1?n:(n+num));
        sc.close();
    }
}
