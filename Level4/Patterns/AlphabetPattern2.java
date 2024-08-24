// Print following pattern for given value of N

// Input
// 7
// Output
// ABCDEFGGFEDCBA
// ABCDEF  FEDCBA
// ABCDE    EDCBA
// ABCD      DCBA
// ABC        CBA
// AB          BA
// A            A

// For example:

// Input	Result
// 7
// ABCDEFGGFEDCBA
// ABCDEF  FEDCBA
// ABCDE    EDCBA
// ABCD      DCBA
// ABC        CBA
// AB          BA
// A            A


import java.util.*;
public class AlphabetPattern2{
    public static void main(String h[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),t=65,m=64;
        for(int i=1;i<=n;i++)
        {
            for(int j=n;j>=i;j--)
            {
                System.out.print((char)(t));
                t++;
            }
            for(int k=1;k<i;k++)
            {
                System.out.print("  ");
            }
            for(int l=n;l>=i;l--)
            {
                System.out.print((char)(l+m));
                
            }
            t=65;
            m=m-1;
            System.out.println();
        }
        sc.close();
    }
}