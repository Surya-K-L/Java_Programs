// Print the following pattern for given N value.

// Input

// 4

// Output

// 1 b c d
// e 6 g h
// i  j 11 l
// m n o 16
// For example:

// Input
// 4
// 1 b c d
// e 6 g h
// i j 11 l
// m n o 16

// 3
// 1 b c
// d 5 f
// g h 9


import java.util.*;
public class MixedPattern1{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),t=1;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i==j)
                {
                    System.out.print(t+" ");
                }
                else
                {
                    System.out.print((char)(t+96)+" ");
                }
                t++;
            }
            System.out.println();
        }
        sc.close();
    }
}