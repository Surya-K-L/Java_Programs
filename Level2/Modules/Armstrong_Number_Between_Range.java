// Write a  program to print all Armstrong numbers between 1 to n.

// An Armstrong number is a n-digit number that is equal to the sum of nth power of its digits. For example,
// 6 = 61 = 6
// 371 = 33 + 73 + 13 = 371

// Example

// Input

// Enter lower limit: 1
// Enter upper limit: 100
// Output

// Armstrong number between 1 to 1000 are:
// 1, 2, 3, 4, 5, 6, 7, 8, 9
// Example

// Input

//  1
//  500
// Output

// Armstrong number between 1 to 1000 are:
// 1 2 3 4 5 6 7 8 9 153 370 371 

// For example:

// Input	
// 1
// 500
// Result
// Armstrong number between 1 to 500 are:
// 1 2 3 4 5 6 7 8 9 153 370 371 407

// Input	
// 100
// 500
// Result
// Armstrong number between 100 to 500 are:
// 153 370 371 407




import java.util.*;
public class Armstrong_Number_Between_Range{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),m=sc.nextInt();
        System.out.println("Armstrong number between "+n+" to "+m+" are:");
        if(n<10)
        {
            for(int i=n;i<=9;i++)
            {
                System.out.print(i+" ");
            }
            for(int i=10;i<=m;i++)
            {
                int t=i,z=i;
                int len=(int)Math.log10(t)+1;
                int tsum=0;
                while(t>0)
                {
                    int s=t%10,sum=1;
                    for(int j=0;j<len;j++)
                    {
                        sum*=s;
                    }
                    tsum+=sum;
                    t/=10;
                }
                if(tsum==z)
                {
                    System.out.print(z+" ");
                }
            }
        }
        else
        {
            for(int i=10;i<=m;i++)
            {
                int t=i,z=i;
                int len=(int)Math.log10(t)+1;
                int tsum=0;
                while(t>0)
                {
                    int s=t%10,sum=1;
                    for(int j=0;j<len;j++)
                    {
                        sum*=s;
                    }
                    tsum+=sum;
                    t/=10;
                }
                if(tsum==z)
                {
                    System.out.print(z+" ");
                }
            }
        }
    }
}
