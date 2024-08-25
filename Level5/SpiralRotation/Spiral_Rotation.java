// Given a 2D array, print it in spiral form. See the following examples.
//  Examples: 
// For example:

// Input	
// 4
// 4
// 1 2 3 4
// 5 6 7 8
// 9 10 11 12
// 13 14 15 16

//Result
// 1 2 3 4 8 12 16 15 14 13 9 5 6 7 11 10 


// 3
// 6
// 1 2 3 4 5 6
// 7 8 9 10 11 12
// 13 14 15 16 17 18

//Result
// 1 2 3 4 5 6 12 18 17 16 15 14 13 7 8 9 10 11 


import java.util.*;
public class Spiral_Rotation{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),m=sc.nextInt();
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
            for(int i=colS;i<=colE;i++)
            {
                System.out.print(a[rowS][i]+" ");
            }
            rowS++;
            for(int i=rowS;i<=rowE;i++)
            {
                System.out.print(a[i][colE]+" ");
            }
            colE--;
            if(rowS<=rowE)
            {
                for(int i=colE;i>=colS;i--)
                {
                    System.out.print(a[rowE][i]+" ");
                }
                rowE--;
            }
            if(colS<=colS)
            {
                for(int i=rowE;i>=rowS;i--)
                {
                    System.out.print(a[i][colS]+" ");
                }
                colS++;
            }
        }
        sc.close();
    }
}
