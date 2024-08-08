// Develop a program to print the Square of each Element of a 2x2 Matrix.


// For example:

// Input	    Result
// 2 2         1 4              
// 1 2         9 16   
// 3 4

// 2 2         1 1
// 1 1         1 1
// 1 1




import java.util.*;
public class Square_Each_Element{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),m=sc.nextInt();
        int a[][]=new int[n][m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(a[i][j]*a[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}