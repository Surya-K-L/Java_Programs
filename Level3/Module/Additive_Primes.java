// Given an array arr[] and the task is to print the additive primes in an array.

// Additive primes: Primes such that the sum of their digits is also a prime, such as 2, 3, 7, 11, 23 are additive primes but not 13, 19, 31 etc.


// For example:

// Input	           Result
// 7                   2 11 7 
// 2 4 6 11 12 18 7


import java.util.*;
public class Additive_Primes{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            if(isPrime(a[i]) && isAdditivePrime(a[i]))
            {
                System.out.print(a[i]+" ");
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
    public static boolean isAdditivePrime(int n)
    {
        int t=n,sum=0;
        while(t>0)
        {
            int k=t%10;
            sum+=k;
            t=t/10;
        }
        if(isPrime(sum))
        {
            return true;
        }
        return false;
    }
}

