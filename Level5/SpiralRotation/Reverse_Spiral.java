// Given a 2D array, print it in spiral form. See the following examples.
 
// For example:

// Input	
// 4
// 4
// 1 2 3 4 
// 5 6 7 8
// 9 10 11 12
// 13 14 15 16

// Result

// 1 5 9 13 14 15 16 12 8 4 3 2 6 10 11 7 


import java.util.*;
public class Reverse_Spiral{
    public static void main(String args[])
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
        int rowS=0,rowE=n-1,colS=0,colE=m-1;
        while(rowS<=rowE && colS<=colE)
        {
            for(int i=rowS;i<=rowE;i++)
            {
                System.out.print(a[i][colS]+" ");
            }
            colS++;
            for(int i=colS;i<=colE;i++)
            {
                System.out.print(a[rowE][i]+" ");
            }
            rowE--;
            if(colS<=colE)
            {
                for(int i=rowE;i>=rowS;i--)
                {
                    System.out.print(a[i][colE]+" ");
                }
                colE--;
            }
            if(rowS<=rowE)
            {
                for(int i=colE;i>=colS;i--)
                {
                    System.out.print(a[rowS][i]+" ");
                }
                rowS++;
            }
        }
        sc.close();
    }
}
