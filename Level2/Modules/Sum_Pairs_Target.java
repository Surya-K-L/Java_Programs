// Find the count of Sum Pairs which are divisible by a given value K in the given

// aray. 

// Input: 

// Array count: 6 

// K : 3 

// Input array: [ 1, 3, 2, 6, 1, 2 ] 

// Output: 5 

// Explanation : 

// From the input array the following pairs are divisible by K (i.e 3) Index [ 0, 2 ] = 1 + 2 = 3  Index [ 0, 5 ] = 1 + 2 = 3 Index [ 1, 3 ] = 3 + 6 = 9 Index [ 2, 4 ] = 2 + 1 = 3 Index [ 4, 5 ] = 1  + 2 = 3 



// For example:

// Input	       Result
// 6               5
// 3
// 1 3 2 6 1 2


import java.util.*;
public class Sum_Pairs_Target{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int a[]=new int[n],c=1;
        for(int  i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(i!=j && a[i]+a[j]==k)
                {
                    c++;
                }
            }
        }
        System.out.print(c);
        sc.close();
    }
}

