// Write a program to print the following pattern for a given value of N

// Input:

// 3

// Output:

// 1
// 2 3
// 4 5 6
// 4 5 6
// 2 3 
// 1



// For example:

// Input   Result
// 3       1
//         2 3
//         4 5 6
//         4 5 6
//         2 3 
//         1

// 4       1
//         2 3
//         4 5 6
//         7 8 9 10
//         7 8 9 10
//         4 5 6 
//         2 3 
//         1 

import java.util.*;
public class NumberPattern2{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),s=1,k=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print(s+" ");
                if(i==n-1 && j==0)
                {
                    k=s;
                }
                s++;
            }
            System.out.println();
        }
        int t=n-1,p=0;
        for(int i=0;i<n;i++)
        {
            for(int j=n;j>i;j--)
            {
                System.out.print(k+" ");
                if(j==n)
                {
                    p=k-t;
                    t--;
                }
                k++;
            }
            k=p;
            System.out.println();
        }
        sc.close();
    }
}