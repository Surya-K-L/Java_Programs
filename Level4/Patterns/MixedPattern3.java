// Write a program to print the following pattern for a given input n.

// Input

// 5

// Output

//     * A
//    ** BC
//   *** CDE
//  **** DEFG
// ***** EFGHI
// 54321 13579
//  5432 3579
//   543 579
//    54 79
//     5 9

// For example:

// Input	
// 5
//     * A
//    ** BC
//   *** CDE
//  **** DEFG
// ***** EFGHI
// 54321 13579
//  5432 3579
//   543 579
//    54 79
//     5 9
//
// 3
//
//   * A
//  ** BC
// *** CDE
// 321 135
//  32 35
//   3 5



import java.util.*;
public class MixedPattern3{
    public static void main(String h[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),m=n,q=1,g=0;
        char z='A';
        for(int i=0;i<n;i++)
        {
            for(int j=n-1;j>i;j--)
            {
                System.out.print(" ");
            }
            for(int k=0;k<=i;k++)
            {
                System.out.print("*");
            }
            System.out.print(" ");
            for(int t=0;t<=i;t++)
            {
                System.out.print(z);
                z++;
                
            }
            System.out.println();
            z-=(i+1);
            z++;
        }
        for(int i=n;i>0;i--)
        {
            for(int j=n-1;j>=i;j--)
            {
                System.out.print(" ");
            }
            for(int k=0;k<i;k++)
            {
                System.out.print(m--);
            }
            System.out.print(" ");
            q=1+ 2 *g;
            for(int s=0;s<i;s++)
            {
                System.out.print(q);
                q++;
                q++;
            }
            q=1;
            m=n;
            g++;
            System.out.println();
        }
        sc.close();
    }
}
