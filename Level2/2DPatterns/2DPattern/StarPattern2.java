// Write a program to display the given pattern

// 3

//     * 
//   * * 
// * * * 

// For example:

// Input   Result
// 3         *  
//         * * 
//       * * * 

// 4         *  
//         * * 
//       * * * 
//     * * * *


import java.util.*;
public class StarPattern2{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            for(int j=n-1;j>i;j--)
            {
                System.out.print("  ");
            }
            for(int k=0;k<=i;k++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }
}