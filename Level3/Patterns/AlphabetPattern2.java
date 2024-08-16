// print diamond pattern

// Input Format

// when N=3 , S=a

// Constraints

// 1<=N<=100


// For example:

// Input
// 3
// a
//   a 
//  aaa 
// aaaaa 
//  aaa
//   a



import java.util.*;
public class AlphabetPattern2{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        char t=sc.next().charAt(0);
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n-i-1;j++)
            {
                System.out.print(" ");
            }
            for(int k=0;k<=i*2;k++)
            {
                System.out.print(t);
            }
            System.out.println();
        }
        for(int i=n-1;i>=0;i--)
        {
            for(int j=0;j<=n-i-1;j++)
            {
                System.out.print(" ");
            }
            for(int k=0;k<i*2-1;k++)
            {
                System.out.print(t);
            }
            System.out.println();
        }
        sc.close();
        
    }
}