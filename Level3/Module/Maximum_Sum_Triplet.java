// Given an array of positive integers of size n. Find the maximum sum of triplet( ai + aj + ak ) such that

// 0 <= i < j < k < n and ai < aj < ak.

// For Example,

// Input: a[] = 2 5 3 1 4 9

// Output: 16

// Explanation:

// All possible triplets are:-

// 2 3 4 => sum = 9

// 2 5 9 => sum = 16

// 2 3 9 => sum = 14

// 3 4 9 => sum = 16

// 1 4 9 => sum = 14

// Maximum sum = 16


// For example:

// Input	Result
// 6       16
// 2
// 5
// 3
// 1
// 4
// 9


import java.util.*;
public class Maximum_Sum_Triplet{
    public static void main(String h[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int s=0,max=0,t=0;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(i<j && a[i]<a[j])
                {
                 t=a[i]+a[j];
                for(int k=i+2;k<n;k++)
                {
                    if(j<k && a[j]<a[k])
                    {
                        s=t+a[k];
                    }
                    if(s>max)
                    {
                        max=s;
                    }
                }
                }
            }
        }
        System.out.print(max);
        sc.close();
    }
}