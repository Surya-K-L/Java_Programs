// Given an array arr[] of N integers, the task is to print the largest element among the array such that its previous and next element product is maximum.

// Explanation:

// Input: arr[] = {5, 6, 4, 3, 2}

// Output: 6

// The product of the next and the previous elements for every element of the given array are:

// 5 -> 2 * 6 = 12

// 6 -> 5 * 4 = 20

// 4 -> 6 * 3 = 18

// 3 -> 4 * 2 = 8

// 2 -> 3 * 5 = 15

// Out of these 20 is the maximum.

// Hence, 6 is the answer.



// For example:

// Input	           Result
// 6                   16
// 12 5 42 16 34 7




import java.util.*;
public class Product_Of_Previous_Next{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        if(n<3)
        {
            System.out.print(-1);
        }
        else
        {
            int max=0,ans=0;
            for(int i=0;i<n;i++)
            {
                if(i==0)
                {
                    int t=a[i+1]*a[n-1];
                    if(t>max)
                    {
                        max=t;
                        ans=i;
                    }
                }
                else if(i==n-1)
                {
                    int t=a[0]*a[n-2];
                    if(t>max)
                    {
                        max=t;
                        ans=i;
                    }
                }
                else
                {
                    int t=a[i-1]*a[i+1];
                    if(t>max)
                    {
                        max=t;
                        ans=i;
                    }
                }
            }
            System.out.print(a[ans]);
        }
        sc.close();
    }
}