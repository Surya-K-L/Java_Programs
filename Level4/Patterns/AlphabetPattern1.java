// Write a program to print the following pattern for a given value of N

// Input
// 3
//  a
// Output
//   a 
//  aaa 
// aaaaa
//  aaa
//   a
// Input
// 6
// X
// Output

//           X
//         XXX
//       XXXXX
//     XXXXXXX
//   XXXXXXXXX
// XXXXXXXXXXX
//   XXXXXXXXX
//     XXXXXXX
//       XXXXX
//         XXX
//           X



// For example:

// Input	Result
// 3
// a
//   a 
//  aaa 
// aaaaa
//  aaa
//   a
// 6
// X
//      X
//     XXX
//    XXXXX
//   XXXXXXX
//  XXXXXXXXX
// XXXXXXXXXXX
//  XXXXXXXXX
//   XXXXXXX
//    XXXXX
//     XXX
//      X


import java.util.*;
public class AlphabetPattern1 {
    public static void main(String h[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        char c=sc.next().charAt(0);
        for(int i=1;i<n*2;i=i+2)
        {
            for(int j=(n*2)-1;j>i;j=j-2)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++)
            {
                System.out.print(c);
            }
            System.out.println();
        }
        for(int i=n-1;i>=1;i--)
        {
            for(int j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=2*i-1;k++)
            {
                System.out.print(c);
            }
            System.out.println();
        }
        sc.close();
    }
}
