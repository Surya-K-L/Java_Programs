// Alternatively print a given number as given in the example

// For example:

// Input	Result
// 3       3 -3 2 -2 1 -1 
// 4       4 -4 3 -3 2 -2 1 -1 


import java.util.*;
public class Alternatively{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=-n,t=n;
        for(int i=0;i<n;i++)
        {
            System.out.print(t--+" ");
            System.out.print(m+++" ");
        }
        sc.close();
    }
}
