// An n-bit gray code sequence is a sequence of 2n integers where:

// Every integer is in the inclusive range [0, 2n - 1],
// The first integer is 0,
// An integer appears no more than once in the sequence,
// The binary representation of every pair of adjacent integers differs by exactly one bit, and
// The binary representation of the first and last integers differs by exactly one bit.
// Read example to understand this better!
// Given an list of numbers ranging between 0 to n, return if it is valid gray code sequence.

// Contraints: Max value of n = 16

// Example 1:

// Input: [0,1,3,2]
// Output: True
// Explanation:
// The binary representation of [0,1,3,2] is [00,01,11,10].
// - 00 and 01 differ by one bit
// - 01 and 11 differ by one bit
// - 11 and 10 differ by one bit
// - 10 and 00 differ by one bit
// Example 2:
// Input: [0,1]
// Output: True

// Example 3
// Input: [7,8]
// Output: False 
// Constraints:

// 1 <= n <= 16

// For example:

// Input	        Result
// [0,2,3,1]       true

// [9,10]          false


import java.util.*;
public class Gray_Code_Sequence{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        a=a.substring(1,a.length()-1);
        String b[]=a.split(",");
        int arr[]=new int[b.length];
        for(int i=0;i<b.length;i++)
        {
            arr[i]=Integer.parseInt(b[i]);
        }
        int p=0;
        for(int i=0;i<b.length;i+=2)
        {
            if(arr[i+1]-arr[i]==2 || arr[i+1]-arr[i]==-2)
            {
                continue;
            }
            else
            {
                p=1;
                break;
            }
        }
        System.out.print(p==0?"true":"false");
        sc.close();
    }
}