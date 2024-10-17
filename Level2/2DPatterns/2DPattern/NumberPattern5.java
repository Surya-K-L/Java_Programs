// Program to print the following pattern
// 1 
// 2 1 
// 3 2 1 
// 4 3 2 1 
// 5 4 3 2 1
// Input
// 5
// Output
// ** Printing the pattern... **
// 1 
// 2 1 
// 3 2 1 
// 4 3 2 1 
// 5 4 3 2 1

import java.util.*;
public class NumberPattern5{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("** Printing the pattern... **");
        int t=0;
        for(int i=0;i<n;i++)
        {
            t=i+1;
            for(int j=0;j<=i;j++)
            {
                if(j==0)
                {
                    System.out.print((t)+" ");
                    t--;
                }
                else
                {
                    System.out.print(t--+" ");
                }
            }
            System.out.println();
        }
    }
}
