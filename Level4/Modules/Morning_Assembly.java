// There are 'n' students standing in a straight line during morning assembly. They were required to stand in ascending order of their height. But they are standing in a random fashion.

// Find the number of students who are standing in wrong position.

// All of them have distinct heights.

// Input Format
// First line consists of a single integer - n.

// Next line contains 'n' space separated integers - height of ith student standing in the line.

// Output Format
// Single integer - Answer to the problem.

// Constraints
// 1 ≤ n ≤ 200

// 1 ≤ height ≤ 200

// Explanation

// Students with height 146 and 140 are standing in wrong positions.


// For example:

// Input	                Result
// 5                       2
// 100 146 140 150 160


import java.util.*;
public class Morning_Assembly{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        int b[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
            b[i]=a[i];
        }
        Arrays.sort(b);
        int c=0;
        for(int i=0;i<n;i++)
        {
            if(a[i]!=b[i])
            {
                c++;
            }
        }
        System.out.print(c);
        sc.close();
    }
}
