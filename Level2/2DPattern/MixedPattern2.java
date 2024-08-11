// Write a program to display the pattern given below.

// Sample Input:

// 5

// Sample Output:

// A B C D E
// 1 2 3 4
// A B C
// 1 2
// A

// For example:

// Input	   Result
// 3           A B C
//             1 2
//             A

import java.util.*;
public class MixedPattern2{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),t=1;
        for(int i=0;i<n;i++)
        {
            if(i%2==0)
            {
                t=1;
                for(int j=n;j>i;j--)
                {
                    System.out.print((char)(t+64)+" ");
                    t++;
                }
            }
            else
            {
                int k=1;
                for(int j=n;j>i;j--)
                {
                    System.out.print(k+" ");
                    k++;
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
