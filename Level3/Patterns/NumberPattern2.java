// Print a given matrix in spiral form
// Given a 2D array, print it in spiral form. See the following examples.

// Examples: 

// Input:  4 4
//         1    2   3   4
//         5    6   7   8
//         9   10  11  12
//         13  14  15  16
// Output: 1 2 3 4 8 12 16 15 14 13 9 5 6 7 11 10 
// Explanation: The output is matrix in spiral format.


import java.util.*;
public class NumberPattern2{
    public static void main(String h[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int a[][]=new int[n][m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        int k=0,l=0;
        while(k<m && l<n)
        {
            for(int i=l;i<n;i++)
            {
                System.out.print(a[k][i]+" ");
            }
            k++;
            for(int i=k;i<m;i++)
            {
                System.out.print(a[i][n-1]+" ");
            }
            n--;
            if(k<m)
            {
                for(int i=n-1;i>=l;i--)
                {
                    System.out.print(a[m-1][i]+" ");
                }
                m--;
            }
            if(l<n)
            {
                for(int i=m-1;i>=k;i--)
                {
                    System.out.print(a[i][l]+" ");
                }
                l++;
            }
        }
        sc.close();
    }
}