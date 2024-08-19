// Perform the below operations and give the answer as YES or NO

// Step1'sanswer will be step2'sinput and so on..1. Read a number(max value 999999999999. So read it in long)2. Add the digits(sum of digits)3. Reverse the resultant number 4. If the number is a prime number multiply by 23 else multiply by 13 5. If the first digit of the number is 7(highest order digit/left most digit),then multiply the number by 7 6. Left shift the number by 3

// If the resultant number is EVEN,return YES else return NO

// For example:

// Input           Result 
// 123123342343    YES

import java.util.*;

public class Perform_Operations{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong(),sum=0;
        while(n>0)
        {
            long t=n%10;
            sum+=t;
            n/=10;
        }
        String ss=""+sum;
        StringBuilder s=new StringBuilder(ss);
        String p=s.reverse().toString();
        long t=0;
        if(isPrime(Long.parseLong(p)))
        {
            t=Long.parseLong(p)*23;
        }
        else
        {
            t=Long.parseLong(p)*13;
        }
        System.out.print((t<<3)%2==0?"YES":"NO");
        sc.close();
        
    }
    
    public static boolean isPrime(long n)
    {
        for(long i=2;i<n;i++)
        {
            if(n%i==0)
            {
                return false;
            }
        }
        return true;
    }
}