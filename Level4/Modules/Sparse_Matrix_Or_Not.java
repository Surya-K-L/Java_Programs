// Write a  program to read elements in a matrix and check whether matrix is Sparse matrix or not. 

// To check whether a matrix is sparse matrix we only need to check the total number of elements that are equal to zero. The matrix is sparse matrix if T ≥ ((m * n) / 2 ); where T defines total number of zero elements.

// Example

// Input

// Input elements in matrix: 
// 1 0 3
// 0 0 4
// 6 0 0
// Output

// The given matrix is Sparse matrix
// sample

//  Input 1

// 3 3

// 1 0 3
// 0 0 4
// 6 0 0
// Output 1

// The given matrix is Sparse matrix
//  Input 2

// 3 3

// 1 0 3
// 7 0 8
// 6 0 6
// Output 2

// The given matrix is not a Sparse matrix



// For example:

// Input	Result
// 3 3
// 1 0 3
// 0 0 4
// 6 0 0
// The given matrix is Sparse matrix
// 3 3
// 1 0 3
// 7 0 8
// 6 0 6
// The given matrix is not a Sparse matrix



import java.util.*;
public class Sparse_Matrix_Or_Not{
    public static void main(String h[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),m=sc.nextInt(),c=0;
        int a[][]=new int[n][m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                a[i][j]=sc.nextInt();
                if(a[i][j]==0)
                {
                    c++;
                }
            }
        }
        if(c>=(m*n)/2)
        {
            System.out.print("The given matrix is Sparse matrix");
        }
        else
        {
            System.out.print("The given matrix is not a Sparse matrix");
        }
        sc.close();
    }
}