// Program to print the following pattern for given value of N.

// Input

// 5

// Output

// ** Printing the pattern... **
// 1 
// 2 7 
// 3 8 13 
// 4 9 14 19 
// 5 10 15 20 25


// For example:

// Input	Result
// 5       ** Printing the pattern... **
//         1 
//         2 7 
//         3 8 13 
//         4 9 14 19 
//         5 10 15 20 25

// 3       ** Printing the pattern... **
//         1 
//         2 5 
//         3 6 9 


import java.util.*;
public class NumberPattern4{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("** Printing the pattern... **");
        int t=0;
        for(int i=0;i<n;i++)
        {
            t=i+1;
            for(int j=0;j<=i;j++)
            {
                if(j==0)
                {
                    System.out.print((t)+" ");
                    t=t+n;
                }
                else
                {
                    System.out.print(t+" ");
                    t=t+n;
                }
            }
            System.out.println();
        }
        sc.close();
    }
}