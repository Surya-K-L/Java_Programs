// /*Write a program to print the below pattern

// 1           * 
// 2 2      * * 
// 3 3 3 * * *  

// For example:

// Input	
// 3

// 1         * 
// 2 2     * * 
// 3 3 3 * * * 

// 4

// 1             * 
// 2 2         * * 
// 3 3 3     * * * 
// 4 4 4 4 * * * * 



import java.util.*;
public class MixedPattern3 {
    public static void main(String h[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(i+" ");
            }
            for(int k=n;k>i;k--)
            {
                System.out.print("  ");
            }
            for(int k=n;k>i;k--)
            {
                System.out.print("  ");
            }
            for(int l=1;l<=i;l++)
            {
            System.out.print("* ");
            }
        System.out.println();
        }
    }
}
