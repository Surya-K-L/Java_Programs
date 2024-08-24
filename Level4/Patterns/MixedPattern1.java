// Write a program to print the following pattern.

// Input

// 4

// Output

//        A 1
//      A B 1 2 
//    A B C 1 2 3
// A B C D 1 2 3 4
// * * * * 1 2 3 4
//   * * * 5 6 7
//      * * 8 9
//        * 10


// For example:

// Input	Result
// 4
//         A 1
//       A B 1 2 
//     A B C 1 2 3
//   A B C D 1 2 3 4
//   * * * * 1 2 3 4
//     * * * 5 6 7
//       * * 8 9
//         * 10
// 3
//       A 1
//     A B 1 2 
//   A B C 1 2 3
//   * * * 1 2 3
//     * * 4 5
//       * 6



import java.util.*;
public class MixedPattern1{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            for(int j=n;j>i;j--)
            {
                System.out.print("  ");
            }
            for(int k=0;k<=i;k++)
            {
                System.out.print((char)(k+65)+" ");
            }
            for(int l=0;l<=i;l++)
            {
                System.out.print((l+1)+" ");
            }
            System.out.println();
        }
        int z=1;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print("  ");
            }
            for(int k=n;k>i;k--)
            {
                System.out.print("* ");
            }
            for(int l=n;l>i;l--)
            {
                System.out.print(z+" ");
                z++;
            }
            System.out.println();
        }
        sc.close();
    }
}
