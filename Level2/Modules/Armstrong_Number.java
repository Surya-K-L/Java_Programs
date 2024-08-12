// Develop a program to Check whether the given number is an Armstrong number or not

// Note: It should accept number upto 4-digits.

// Input Format

// The first line of input is the integer T, denoting number of test cases. The first line of each test case is a number N up to 4 digits.

// Constraints

// 1<=T<=100 1<=N<=9999

// Output Format

// For each test case, there is one line of output i.e. whether it is Armstrong number or not an Armstrong number.


// For example:

// Input   Result
// 153     Armstrong Number



import java.util.*;
public class Armstrong_Number{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),s=n;
        int len=(int)Math.log10(n)+1;
        int temp=1;
        while(n>0)
        {
            int t=n%10;
            int k=1;
            for(int i=0;i<len;i++)
            {
                k=k*t;
            }
            temp+=k;
            n/=10;
        }
        if(temp-1==s)
        {
            System.out.print("Armstrong Number");
        }
        else
        {
            System.out.print("Not a Armstrong");
        }
        sc.close();
    }
}