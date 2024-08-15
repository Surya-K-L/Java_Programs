// Write a program to find sum of right diagonals of a matrix.

// Note: The number of rows and columns must be equal.


// For example:

// Input	       Result
// 4               Addition of the right Diagonal elements is: 113
// 21 1 54 87
// 26 35 48 95
// 15 24 47 6
// 42 15 84 10

// 2               Addition of the right Diagonal elements is: 52
// 15 48
// 10 37


import java.util.*;
public class Sum_Of_Right_Diagonals{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[][]=new int[n][n],sum=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                a[i][j]=sc.nextInt();
                if(i==j)
                {
                    sum+=a[i][j];
                }
            }
        }
        System.out.print("Addition of the right Diagonal elements is: "+sum);
        
    }
}