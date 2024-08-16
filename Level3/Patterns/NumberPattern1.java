// Write a program to print the following number pattern

// N >=4 and N < 10


// For example:

// Input
// 4
// Value of N: 4
// 4444444
// 4333334
// 4322234
// 4321234

// 7
// Value of N: 7
// 7777777777777
// 7666666666667
// 7655555555567
// 7654444444567
// 7654333334567
// 7654322234567
// 7654321234567




import java.util.*;
public class NumberPattern1{
    public static void main(String h[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("Value of N: "+n);
        for(int i=n;i>=1;i--)
        {
            for(int j=n;j>=1;j--)
            {
                System.out.print(Math.max(i,j));
            }
            for(int j=2;j<=n;j++)
            {
                System.out.print(Math.max(i,j));
            }
            System.out.println();
        }
        sc.close();
    }
}