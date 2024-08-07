// Write a program to print from 0 to given negative number

// For example:

// Input   Result
// -7      0 -1 -2 -3 -4 -5 -6 -7 


import java.util.*;
public class Zero_to_Negative_Number{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int abs=Math.abs(n);
        int pr=-1;
        for(int i=0;i<=abs;i++)
        {
            if(i==0)
                System.out.print(i+" ");
            else
                System.out.print(pr--+" ");
        }
        sc.close();
    }
}
