//Write a program to display the maximum and minimum number in a given set of numbers

// For example:

// Input	Result
// 5
// 10 20 30 40 50
// Max = 50
// Min = 10
// 6
// 10 20 30 40 50 60
// Max = 60
// Min = 10


import java.util.*;
public class MinMax{
    public static void main(String h[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        Arrays.sort(a);
        System.out.println("Max = "+a[n-1]);
        System.out.print("Min = "+a[0]);
    }
}
