// Print the following pattern for a given value of N

// Input 

// 4

// output

// 1             1
// 1 2         2 2
// 1 2 3     3 3 3
// 1 2 3 4 4 4 4 4


// For example:

// Input	Result
// 4       1             1 
//         1 2         2 2 
//         1 2 3     3 3 3 
//         1 2 3 4 4 4 4 4 

// 5       1                 1
//         1 2             2 2
//         1 2 3         3 3 3
//         1 2 3 4     4 4 4 4
//         1 2 3 4 5 5 5 5 5 5

import java.util.*;
public class NumberPattern3{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print((j+1)+" ");
            }
            for(int j=n-1;j>i;j--)
            {
                System.out.print("    ");
            }
            for(int k=0;k<=i;k++)
            {
                System.out.print((i+1)+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}