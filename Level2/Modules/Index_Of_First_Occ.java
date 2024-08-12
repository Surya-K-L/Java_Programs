// Given an array of integers, find the first repeating element in it. Find the element that occurs more than once and whose index of the first occurrence is the smallest. 



// For example:

// Input   Result
// 5       No repeating elements
// 1
// 2
// 3
// 4
// 5

// 5       1
// 1
// 2
// 2
// 1
// 4


import java.util.*;
public class Index_Of_First_Occ{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int p=0;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(a[i]==a[j])
                {
                    System.out.print(a[i]);
                    p=1;
                    break;
                }
            }
            if(p==1)
            {
                break;
            }
        }
        if(p==0)
        {
            System.out.print("No repeating elements");
        }
        sc.close();
    }
}
