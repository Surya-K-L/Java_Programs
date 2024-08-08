// Develop a program to print the addition and subtraction of two 2D matrices.
// The dimensions of the matrices are given as input first.

// Example:
// Input:
// 2 2
// 2 2

// 1 2
// 3 4

// 4 5
// 6 7

// Output:

// Addition:
// 5
// 7
// 9
// 11
// Subtraction:
// -3
// -3
// -3
// -3

// For example:

// Input	Result
// -2 -2   Row and column size should not be negative
// -2 -2

// 3 4     Row and column size should be same for 2 matrices
// 1 2



import java.util.*;
public class Addition_Subtraction{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),m=sc.nextInt(),k=sc.nextInt(),l=sc.nextInt();
        if(n!=k && m!=l)
        {
            System.out.print("Row and column size should be same for 2 matrices");
        }
        else if(n<0||m<0||k<0||l<0)
        {
            System.out.print("Row and column size should not be negative");
        }
        else
        {
            int a[][]=new int[n][m];
            int b[][]=new int[k][l];
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<m;j++)
                {
                    a[i][j]=sc.nextInt();
                }
            }
            for(int i=0;i<k;i++)
            {
                for(int j=0;j<l;j++)
                {
                    b[i][j]=sc.nextInt();
                }
            }
            System.out.println("Addition:");
            for(int i=0;i<k;i++)
            {
                for(int j=0;j<l;j++)
                {
                    System.out.println(a[i][j]+b[i][j]);
                }
            }
            System.out.println("Subtraction:");
            for(int i=0;i<k;i++)
            {
                for(int j=0;j<l;j++)
                {
                    System.out.println(a[i][j]-b[i][j]);
                }
            }
            
        }
        sc.close();
    }
}