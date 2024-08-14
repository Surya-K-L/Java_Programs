// Write a program to display alternate numbers in an array

// For example:

// Input	            Result
// 5                   20
// 10 20 30 40 50      40


import java.util.*;
public class Print_Alternate_Numbers{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();    
        }
        for(int i=0;i<n;i++)
        {
            if(i%2==1)
            {
                System.out.println(a[i]);
            }
        }
        sc.close();
    }
}

