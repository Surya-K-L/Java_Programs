// Develop a program to find the largest possible prime number which is less than the given number

// Sample Input1

// 1 2

// Sample Output1 

// Invalid Input

// Sample Input 2 

// 2 11 7

// Sample output 2 

// 7 5

// Input Format

// The first line of each test case is the integer T, denoting a number of test cases. The first line of each test case is number N.

// Constraints

// 1<=T<=100 1<=N<=1000


// For example:

// Input   Result
// 1       5
// 7



import java.util.*;
public class Larget_Prime_Less_Than_GivenNumber{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(n-->0)
        {
            int m=sc.nextInt();
            System.out.println(isPrime(m));
        }
        sc.close();
    }
    public static int isPrime(int n)
    {
        int z=0;
        for(int i=n-1;i>=2;i--)
        {
            z=0;
            for(int j=2;j<i;j++)
            {
                if(i%j==0)
                {
                    z=1;
                    break;
                }
            }
            if(z==0)
            {
                return i;
            }
        }
        return -1;
    }
}