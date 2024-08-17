// Write a program to print all the LEADERS in the array.

// Note: An element is leader if it is greater than all the elements to its right side.


// For example:

// Input	                   Result
// 8                           75 59 47 23 
// 12 15 75 9 59 6 47 23

// 4                           212 95 
// 212 45 76 95 

import java.util.*;
public class All_Leaders{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int s=0;
        for(int i=0;i<n;i++)
        {
            s=0;
            for(int j=i+1;j<n;j++)
            {
                if(a[i]<a[j])
                {
                    s=1;
                    break;
                }
            }
            if(s==0)
            {
                System.out.print(a[i]+" ");
            }
        }
        sc.close();
    }
}