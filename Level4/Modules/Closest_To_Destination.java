// Given an array of T integers and another integer destination, find three integers in the array such that the addition is closest to destination. Your task is to identify the addition of the three integers.

// Note:

// If they exist over one answer, then display maximum sum

// Input Format

// The first line of input contains T and target. Next line contains Array elements

// Output Format

// Display sum of three integers

// Sample input:

// 6 2
// -7 9 8 3 1 1
// Output:
// 2

// Explanation
// -7+8+1= 2 
// which is the closest to the expected input. So this is the output

// For example:

// Input	       Result
// 6 2             2
// -7 9 8 3 1 1

// 4 13            13
// 5 2 7 6



import java.util.*;
public class Closest_To_Destination{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),s=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i!=j)
                for(int k=0;k<n;k++)
                {
                    if(j!=k)
                    {
                        if(a[i]+a[j]+a[k]==s)
                        {
                            System.out.print(s);
                            return;
                        }
                    }
                }
            }
        }
    }
}