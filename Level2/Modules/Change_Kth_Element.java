// Develop a program to Change the kth element in the array with the given number

// For example:

// Input	
// 5
// 10 20 30 40 50
// 3
// 75
// Result 10 20 75 40 50
// 3
// 1 2 3 
// 4
// 76
// Result -1


import java.util.*;
public class Change_Kth_Element{
    public static void main(String h[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int k=sc.nextInt(),t=sc.nextInt();
        if(k>n)
        {
            System.out.print(-1);
        }
        else
        {
        for(int i=0;i<n;i++)
        {
            if(i==k-1)
            a[i]=t;
        }
        for(int i=0;i<n;i++)
        {
           System.out.print(a[i]+" ");
        }
        }
    }
}
