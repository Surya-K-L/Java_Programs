// Develop a program to print primary/principal and secondary/anti-diagonal diagonals of a matrix.

// Example: Consider a matrix, { { 1, 5, 8 } , { 4, 3, 1 } , { 6, 5, 2 } }. Primary/Principal and secondary/Anti-diagonal elements are as follows,

// Program to find the sum of diagonal elements of a 2D array

// For example:

// Input	Result
// 2 2     Primary diagonal elements:
//         1 4
// 1 2     Secondary diagonal elements:
// 3 4     2 3


// -2 -2   Row and column size should not be negative


import java.util.*;
public class Primary_Secondary_Elements{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        if(n<0||m<0)
        {
            System.out.print("Row and column size should not be negative");
        }
        else if(n!=m)
        {
            System.out.print("Row and column size should be same");
        }
        else
        {
            int a[][] = new int[n][m];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    a[i][j] = sc.nextInt();
                }
            }
            System.out.println("Primary diagonal elements:");
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<m;j++)
                {
                    if(i==j)
                    {
                        System.out.println(a[i][j]);
                    }
                }
            }
            System.out.println("Secondary diagonal elements:");
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<m;j++)
                {
                    if(i+j==n-1)
                    {
                        System.out.println(a[i][j]);
                    }
                }
            }
        }
        sc.close();
    }
}