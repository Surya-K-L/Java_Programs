// Given an array of numbers, find the number among them such that all numbers are divisible by it. If not possible print -1.

// Input Format

// 1. The first line of input contains the size of the array

// 2. The second lines contains array elements

// Constraints

// 1. The size of the array must be between 1 and 100

// 2. Array can have negative elements

// Output Format

// An array element which divides all numbers.

// For example:

// Input	                Result
// 6                       -1
// 12 18 54 78 66 120

// 5                        5
// 10 5 45 125 485




import java.util.*;
public class Common_Number_Divisible_By_All{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int k=0,z=0;
        for(int i=0;i<n;i++)
        {
            k=0;
            for(int j=0;j<n;j++)
            {
                if(a[j]%a[i]==0)
                {
                    continue;
                }
                else
                {
                    k=1;
                    break;
                }
            }
            if(k==0)
            {
                z=1;
                System.out.print(a[i]);
                break;
            }
        }
        if(z==0)
        {
            System.out.print(-1);
        }
        sc.close();
    }
}