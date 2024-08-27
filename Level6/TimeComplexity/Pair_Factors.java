// You are given an integer N denoting whose pair factors are A and B. You have to find the minimum value of A+B for any integer A and B.
// Example:
// N=96
// The pair factors of 96 are (1, 96), (2, 48), (3, 32), (4, 24), (6, 16), (8, 12).
// Min(A+B) = 8+12 
//                 = 20

// Note: Value of N is  1<=N<=10^13 (long long int)

// Sample Input
// 96
// Sample Output
// 20

// For example:

// Input	Result
// 96      20


import java.util.*;
public class Pair_Factors{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        long res=FactorSum(n);
        System.out.print(res);
        sc.close();
    }
    public static long FactorSum(long n)
    {
        long ms=Long.MAX_VALUE;
        for(long i=1;i*i<=n;i++)
        {
            if(n%i==0)
            {
                long f1=i;
                long f2=n/i;
                long cs=f1+f2;
                ms=Math.min(ms,cs);
            }
        }
        return ms;
    }
}
