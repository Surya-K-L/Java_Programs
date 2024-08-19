// Write a Program to get amount as input from user and print minimum number of notes (Rs. 500, 100, 50, 20, 10, 5, 2, and 1)required for the amount. How many minimum number of notes required for the given amount in Programming. Program to find minimum number of notes required for the given denomination. Logic to find minimum number of denomination for a given amount in Program.

// Input Format

// The first line of input is the integer T, denoting number of test cases. The first line of each test case is an amount N

// Constraints

// 1<=T<=100 1<=N<=10000

// Output Format

// For each test case, there is an output i.e. minimum number of denomination for a given amount.

// Sample Input 0

// 1
// 10020
// Sample Output 0

// Invalid Input
// Sample Input 1

// 2
// 575
// 1070
// Sample Output 1

// 500: 1
// 100: 0
// 50: 1
// 20: 1
// 10: 0
// 5: 1
// 2: 0
// 1: 0

// 500: 2
// 100: 0
// 50: 1
// 20: 1
// 10: 0
// 5: 0
// 2: 0
// 1: 0

// For example:

// Input	
// 1
// 10020

// Output:
// Invalid Input


// 1
// 575

// Output:
// 500: 1
// 100: 0
// 50: 1
// 20: 1
// 10: 0
// 5: 1
// 2: 0
// 1: 0

// Input:
// 1
// 1070

// Output:
// 500: 2
// 100: 0
// 50: 1
// 20: 1
// 10: 0
// 5: 0
// 2: 0
// 1: 0


import java.util.*;
public class Minimum_Number_Of_Notes{
    public static void main(String h[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            int k=sc.nextInt(),t=k,fh=0,hu=0,fif=0,twe=0,ten=0,five=0,two=0,one=0;
            if(k>10000)
            {
                System.out.print("Invalid Input");
            }
            else
            {
                while(t>=500)
                {
                    t=t-500;
                    fh++;
                }
                while(t>=100)
                {
                    t=t-100;
                    hu++;
                }
                while(t>=50)
                {
                    t=t-50;
                    fif++;
                }
                while(t>=20)
                {
                    t=t-20;
                    twe++;
                }
                while(t>=10)
                {
                    t=t-10;
                    ten++;
                }
                while(t>=5)
                {
                    t=t-5;
                    five++;
                }
                while(t>=2)
                {
                    t=t-2;
                    two++;
                }
                while(t>=1)
                {
                    t=t-1;
                    one++;
                }
                System.out.println("500: "+fh);
                System.out.println("100: "+hu);
                System.out.println("50: "+fif);
                System.out.println("20: "+twe);
                System.out.println("10: "+ten);
                System.out.println("5: "+five);
                System.out.println("2: "+two);
                System.out.println("1: "+one);
            }
        }
        sc.close();
    }
}