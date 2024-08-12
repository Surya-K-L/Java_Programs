// program to print the following pattern

// * 
// * * 
// * * * 
// * * * * 
// * * * * * 
// * * * * 
// * * * 
// * * 
// * 

// For example:

// Input   Result
// 5       * 
//         * * 
//         * * * 
//         * * * * 
//         * * * * * 
//         * * * * 
//         * * * 
//         * * 
//         * 

// 3       * 
//         * * 
//         * * * 
//         * * 
//         *


import java.util.*;
public class StarPattern1{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=n;i>1;i--)
        {
            for(int j=0;j<i-1;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }
}