// Given an array of integers, find the starting and ending position of a given target value.

// If the target is not found in the array, return [-1, -1].

// The first line contains number of elements in array

// The second line of input contains target value

// The third subsequent values are array elements.


// For example:

// Input   Result
// 5       Positions are 2 4 
// 3
// 1
// 44
// 3
// 22
// 3

// 4       Positions are -1 -1 
// 1
// 2
// 3
// 4
// 5

import java.util.*;
public class Starting_And_Ending_Position{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),k=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int index1=0,index2=0,count=0,p=0;
        for(int i=0;i<n;i++)
        {
            if(a[i]==k && count==0)
            {
                index1=i;
                count++;
                p=1;
            }
            else if(a[i]==k)
            {
                index2=i;
                p=1;
            }
        }
        if(p==0)
        {
            System.out.print("Positions are -1 -1");
        }
        else
        {
            System.out.print("Positions are "+index1+" "+index2);
        }
        sc.close();
    }
}

