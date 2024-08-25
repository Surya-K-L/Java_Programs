// Check whether the given number is extra perfect number (only first and last bits are ON bits)

// SHOULD NOT CONVERT AND SOLVE THIS PROBLEM AS String. 
// Problem should be solved AS INTEGER ONLY USING BITWISE OPERATORS

// For example:

// Input	Result
// 8       no

// 9       yes

// 5       yes


import java.util.*;
public class Extra_Perfect_Number{
    public static void main(String h[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.print(s(n)?"yes":"no");
        sc.close();
    }
    public static boolean s(int n)
    {
        return (n==1)||p(n-1);
    }
    public static boolean p(int n)
    {
        return ((n&n-1)==0);
    }
}



