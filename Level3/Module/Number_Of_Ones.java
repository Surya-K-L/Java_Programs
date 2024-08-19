// Given an array of size N in which initially all the elements are 0(zero).The task is to count the number of 1 s in the array after performing N moves on the array as explained:In each move(starting from 1 to N)the element at the position of the multiple of the move number is changed from 0 to 1 or 1 to 0.

// Move 1:Change the element t position at 1,2,3,…

// Move 2:Change the element t position at 2,4,6,…

// Move 3:Change the element t position at 3,6,9,…

// Count the elements whose value is 1 after performing N moves.

// Example:

// Input:N=5

// Output:2

// Explanation:

// Move 1:{1,1,1,1,1}

// Move 2:{1,0,1,0,1}

// Move 3:{1,0,0,0,1}

// Move 4:{1,0,0,1,1}

// Move 5:{1,0,0,1,0}

import java.util.*;

public class Number_Of_Ones{
    public static void main(String h[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=0;
        }
        int temp=1,c=0;
        while(c<n)
        {
            int t=c;
            for(int i=t;i<n;i=i+temp)
            {
                
                if(a[i]==0)
                {
                    a[i]=1;
                }
                else if(a[i]==1)
                {
                    a[i]=0;
                }
            }
                temp++;
                c++;
        }
        int v=0;
        for(int i=0;i<n;i++)
        {
            if(a[i]==1)
            {
                v++;
            }
        }
        System.out.print(v);
        sc.close();
    }
}