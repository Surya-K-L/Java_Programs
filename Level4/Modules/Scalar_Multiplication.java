// Write a  program to read elements in a matrix and perform scalar multiplication of matrix.

// Example

// Input

// Input elements of matrix A:
// 1 2 3
// 4 5 6
// 7 8 9
// Input multiplier: 2
// Output

// 2  4  6
// 8 10 12
// 14 16 18
// Input 1

// 1 2 3
// 4 5 6
// 7 8 9
//  2
// Output 1

// 2  4  6
// 8 10 12
// 14 16 18
// Input 2

// 1 2 3
// 4 5 6
// 7 8 9
//  4
// Output 2

// 4  8 12
// 16 20 24
// 28 32 36



// For example:

// Input	
// 1 2 3
// 4 5 6
// 7 8 9
// 2

// Output
// 2 4 6
// 8 10 12
// 14 16 18

// Input
// 1 2 3
// 4 5 6
// 7 8 9
// 4

// Output
// 4 8 12
// 16 20 24
// 28 32 36



import java.util.*;
public class Scalar_Multiplication{
    public static void main(String h[])
    {
        Scanner sc=new Scanner(System.in);
        int n=3;
        int a[][]=new int[n][n];
        int b[][]=new int[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        int m=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                b[i][j]=m;
            }
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                int f=a[i][j]*b[i][j];
                System.out.print(f+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}