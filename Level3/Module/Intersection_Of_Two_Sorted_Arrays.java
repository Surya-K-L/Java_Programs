// Program to print the intersection of two sorted arrays.

// Input Format

// 5 4 1 4 5 6 7 2 4 6 6

// Output Format

// 4 6

// Sample Input 0

// 5 
// 6
// 1 2 3 4 5 
// 4 5 6 7 8 9

// Sample Output 0

// 4 5 


import java.util.*;
public class Intersection_Of_Two_Sorted_Arrays{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int a[]=new int[n];
        int b[]=new int[m];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=0;i<m;i++)
        {
            b[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(a[i]==b[j])
                {
                    System.out.print(a[i]+" ");
                    break;
                }
            }
        }
        sc.close();
    }
}