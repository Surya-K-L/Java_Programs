// Find the Minimum difference pair
// Given an unsorted array, find the minimum difference between any pair in given array.

// Sample input 1 5 2 4 5 7 9

// Sample output 1

// Sample input 1 5 0 0 1 2 3

// Sample output Invalid value in array!!!

// Input Format

// The first line of input contains an integer T denoting the number of test cases. The first line of each test case is N, the size of array. Second line of the test case is the Array

// Constraints

// 1 <= T <= 30 1 < N <= 100 1 <= arr[i] <= 100000

// Output Format

// Print the minimum difference between any two pairs.

// Sample Input 0

// 1
// 5
// 2 4 5 7 9
// Sample Output 0

// 1



import java.util.*;
public class Minimum_Difference_Pair{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(n-->0)
        {
            int k=sc.nextInt(),min=Integer.MAX_VALUE;
            int a[]=new int[k];
            for(int i=0;i<k;i++)
            {
                a[i]=sc.nextInt();
            }
            for(int i=0;i<k-1;i++)
            {
                int t=Math.abs(a[i]-a[i+1]);
                if(t<min)
                {
                    min=t;
                }
            }
            System.out.print(min);
        }
        sc.close();
    }
}