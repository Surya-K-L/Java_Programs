// Write a program to display the pattern given below.

// 1
// 2 2
// 3 3 3
// 4 4 4 4
// 5 5 5 5 5

// For example:

// Input   Result
// 5       1
//         2 2
//         3 3 3
//         4 4 4 4
//         5 5 5 5 5


import java.util.*;
public class NumberPattern4{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print((i+1)+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
