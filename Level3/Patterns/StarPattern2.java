// Write a program to print Z Pattern

// For example:

// Input	
// 3
// * * *
//   *
// * * *

// 4
// * * * *
//     *  
//   *
// * * * *


import java.util.*;
public class StarPattern2{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i==0||i==n-1||i+j==n-1)
                {
                    System.out.print("* ");
                }
                else
                {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}