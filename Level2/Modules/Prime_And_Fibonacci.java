// Given a number print the first N prime numbers and the Fibonacci of the number.

// Input Format

// A number N.

// Constraints

// 1

// Output Format

// A List of numbers where it is alternating between prime and fibonacci.

// Sample Input 0

// 7
// Sample Output 0

// 2 0 3 1 5 1 7 2 11 3 13 5 17 8
// Explanation 0

// 2, 3, 5, 7, 11, 13, 17 are the first 7 prime numbers 0,1,1,2,3,5,8 are the first Fibonacci numbers The output is alternatively being printed as follows: 2 0 3 1 5 1 7 2 11 3 13 5 17 8


import java.util.*;
public class Prime_And_Fibonacci{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=0;
        int farr[]=new int[n+1];
        int parr[]=new int[n+1];
        farr[0]=0;
        farr[1]=1;
        for(int i=2;i<=n;i++)
        {
            farr[i]=farr[i-1]+farr[i-2];
        }
        int t=0;
        for(int i=2;i<1000;i++)
        {
            if(isPrime(i))
            {
                count++;
                if(count>n)
                {
                    break;
                }
                parr[t++]=i;
            }
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(parr[i]+" "+farr[i]+" ");
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