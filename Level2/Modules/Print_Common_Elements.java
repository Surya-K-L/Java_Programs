// Find common elements between 2 different arrays (or lists)

// For example:

// Input	           Result
// 5                   10
// 10 20 30 40 50
// 2
// 10 33

// 3                   1 2 3 
// 1 2 3 
// 4
// 4 3 2 1 

import java.util.*;
public class Print_Common_Elements{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        int b[]=new int[k];
        for(int i=0;i<k;i++)
        {
            b[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<k;j++)
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