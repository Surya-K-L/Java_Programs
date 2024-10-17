// Print the following pattern for a given value of N

// Input

// 4

// Output

// 0 1 2 3
// 4 5 6
// 7 8
// 9
// 9
// 8 7
// 6 5 4
// 3 2 1 0

import java.util.*;
public class NumberPattern6{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),t=0,z=0;
        for(int i=n;i>0;i--)
        {
            for(int j=0;j<i;j++)
            {
                System.out.print(t+" ");
                z=t;
                t++;
            }
            System.out.println();
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print(z+" ");
                z--;
            }
            System.out.println();
        }
    }
}
