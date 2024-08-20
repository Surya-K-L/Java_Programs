// Given an array nums of n integers, are there elements a, b, c in nums such that a + b + c = 0? Find all triplets in the array which gives the sum of zero.



// Example:

// Given array nums = [-1, 0, 1, 2, -1, -4],

// A solution set is:
// [
//   [-1, 0, 1],
//   [-1, -1, 2],
//   [-1, 0, 1]
// ]

// For example:

// Input	
// 3
// 4
// 5
// -9
// Output
// Elements are 4 5 -9
// 5
// 1
// 2
// 3
// 4
// 5
// Output
// No Elements Found
// 5
// -1
// 1
// 0
// 2
// -2
// Output
// Elements are -1 1 0
// Elements are 0 2 -2


import java.util.*;
public class Triplet_Sum_Zero{
    public static void main(String h[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int t=0,s=0,f=0;
        for(int i=0;i<n;i++)
        {
             t=0;
            for(int j=i+1;j<n;j++)
            {
                t=a[i]+a[j];
                for(int k=i+2;k<n;k++)
                {
                    if(t+a[k]==0)
                    {
                        System.out.println("Elements are "+a[i]+" "+a[j]+" "+a[k]);
                        f=1;
                        break;
                    }
                }
            }
        }
        if(f==0)
        {
            System.out.print("No Elements Found");
        }
        sc.close();
    }
}