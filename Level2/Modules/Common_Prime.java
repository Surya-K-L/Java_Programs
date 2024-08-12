// Find the common prime number between the given 2 sets of numbers

// For example:

// Input	                       Result
// 23,17,33,22,4                   17
// 22,33,17,4

// 11,12,13,14,15,16,17,18,19,20   0
// 5,10,15,20,25,30,35


import java.util.*;
public class Common_Prime{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String a[]=sc.nextLine().split(",");
        String b[]=sc.nextLine().split(",");
        int c[]=new int[a.length];
        int d[]=new int[b.length];
        for(int i=0;i<c.length;i++)
        {
            c[i]=Integer.parseInt(a[i]);
        }
        for(int i=0;i<d.length;i++)
        {
            d[i]=Integer.parseInt(b[i]);
        }
        int p=0;
        for(int i=0;i<c.length;i++)
        {
            for(int j=0;j<d.length;j++)
            {
                if(c[i]==d[j])
                {
                    if(isPrime(c[i]))
                    {
                        p=1;
                        System.out.print(c[i]+" ");
                    }
                }
            }
        }
        if(p==0)
        {
            System.out.print(0);
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