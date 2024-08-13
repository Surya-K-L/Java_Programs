// Find the find numbers within a range. Assume both the numbers are included

// Input

// 11 19

// Output
// 11 13 17 19

// Explation:
// 11 13 17 19 are the 4 prime numbers between 11 to 19


// For example:

// Input	Result
// 11 19   11 13 17 19 

// 2 9     2 3 5 7 



import java.util.*;
public class Prime_Number_Between_Range{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),m=sc.nextInt();
        for(int i=n;i<=m;i++)
        {
            if(isPrime(i))
            {
                System.out.print(i+" ");
            }
        }
        sc.close();
    }
    
    public static boolean isPrime(int n)
    {
        for(int i=2;i<n;i++)
        {
            if(n%i==0)
            {
                return false;
            }
        }
        return true;
    }
}