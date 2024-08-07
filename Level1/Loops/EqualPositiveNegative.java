// Write a program that display equal positive and negative numbers for a given number

// Zero should not be displayed

// For example:

// Input   Result
// 6       3 2 1 -1 -2 -3
// 10      5 4 3 2 1 -1 -2 -3 -4 -5



import java.util.*;
public class EqualPositiveNegative{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int t=n/2;
        int k=-1;
        for(int i=0;i<n/2;i++)
        {
            System.out.print(t--+" ");
        }
        for(int i=0;i<n/2;i++)
        {
            System.out.print(k--+" ");
        }
        sc.close();
    }
}