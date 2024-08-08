// Trendy Numbers

// A number is said to be a trendy number if and only if it has 3 digits and the middle digit is divisible by 3.

// Examples of Trendy Numbers: 131, 264, 999

// Examples of NonTrendy Numbers : 123, 653, 33, 4, 1034

// Write a program to find whether a given number is a Trendy Number or not.


// For example:

// Input	Result
// 235     Trendy Number
// 123     Not a Trendy Number



import java.util.*;
public class Trendy_Number{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int len=(int)Math.log10(n)+1;
        if(len==3)
        {
            n=n/10;
            int t=n%10;
            if(t%3==0)
            {
                System.out.print("Trendy Number");
            }
            else
            {
                System.out.print("Not a Trendy Number");
            }
        }
        else
        {
            System.out.print("Not a Trendy Number");
        }
        sc.close();
    }
}