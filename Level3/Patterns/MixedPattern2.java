// Print the following pattern for a given value of n

// Input

// 5

// Output

// 1
// 2*3
// 4*5*6
// 7*8*9*10
// 11*12*13*14*15
// 11*12*13*14*15
// 7*8*9*10
// 4*5*6
// 2*3
// 1

// For example:

// Input
// 5
// 1
// 2*3
// 4*5*6
// 7*8*9*10
// 11*12*13*14*15
// 11*12*13*14*15
// 7*8*9*10
// 4*5*6
// 2*3
// 1

// 7
// 1
// 2*3
// 4*5*6
// 7*8*9*10
// 11*12*13*14*15
// 16*17*18*19*20*21
// 22*23*24*25*26*27*28
// 22*23*24*25*26*27*28
// 16*17*18*19*20*21
// 11*12*13*14*15
// 7*8*9*10
// 4*5*6
// 2*3
// 1



import java.util.*;
public class MixedPattern2{
    public static void main(String h[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),s=1,k=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<=i;j++)
            {
                if(j==0)
                {
                    System.out.print(s);
                    if(i==n-1 && j==0)
                    {
                        k=s;
                    }
                }
                else
                {
                    System.out.print("*"+s);
                }
                s++;
            }
            System.out.println();
        }
        int t=n-1,p=0;
        for(int i=0;i<n;i++)
        {
            for(int j=n;j>i;j--)
            {
                if(j==n)
                {
                    System.out.print(k);
                    p=k-t;
                    t--;
                }
                else
                {
                    System.out.print("*"+k);
                }
                k++;
            }
            k=p;
            System.out.println();
        }
        sc.close();
    }
}