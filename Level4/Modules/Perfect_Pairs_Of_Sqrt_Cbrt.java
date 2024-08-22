// Rajiv and Nitish had a fight because Rajiv was annoying Nitish with his question. Rajiv being a genius in arrays gave Nitish an array of natural numbers A of length N with elements A1, A2, . . ., AN. Nitish has to find the total amount of perfect pairs in the array.

//   A perfect pair (Ai, Aj) is a pair where (Ai + Aj) is a perfect square or a perfect cube and i ≠ j. 

//   Since Rajiv and Nitish are not talking with each other after the fight you have been given the question to solve and inturn make both of them a perfect pair again.

//   NOTE :- A pair (Ai, Aj) and (Aj, Ai) are same and not to be counted twice.

//  Input

// The first line on the input contains the a single integer T denoting the number of test cases. The first line of each test case contains a single integer N. The second line contains N space-separated integers A1, A2, . . ., AN.

// Output

// For each test case, print a single line containing a single integer denoting the total number of perfect pairs.

// Constraints

// 1 ≤  T ≤ 10

// 1 ≤  N ≤ 105

// 1 ≤  Ai ≤ 103

// Sample Input
// 2
// 5
// 1 2 3 4 5
// 4
// 1 4 5 8
// Sample Output
// 3
// 2

// For example:

// Input	
// 2
// 5
// 1 2 3 4 5
// 4
// 1 4 5 8

// Output
// 3
// 2

// Input
// 10
// 10
// 1 1 1 1 2 2 3 4 8 8
// 100
// 3 8 1 1 8 6 6 6 10 5 4 10 1 4 8 4 2 9 9 2 2 5 1 6 9 1 10 4 4 5 5 2 9 5 7 7 2 2 1 1 9 8 9 6 3 2 2 2 7 10 9 9 8 8 5 7 1 9 3 9 10 6 3 8 4 10 1 7 5 10 2 1 2 3 8 5 2 9 6 1 5 1 4 10 4 6 1 6 7 10 3 8 5 8 6 2 7 2 6 4
// 100
// 6 1 3 4 9 3 1 1 8 2 3 8 9 9 9 1 4 2 8 6 4 8 3 6 8 3 9 8 7 2 5 3 8 4 3 1 6 4 4 8 1 3 3 1 7 3 10 7 10 6 3 10 2 8 10 9 10 8 9 7 2 1 2 4 2 8 6 5 4 3 9 2 5 8 1 3 3 3 5 5 8 9 5 8 2 4 6 9 8 4 4 9 4 2 3 4 2 5 9 7
// 100
// 5 2 7 3 7 2 7 3 1 4 10 2 3 8 6 4 2 6 2 6 10 9 6 7 1 6 10 2 3 10 4 1 6 7 9 2 9 10 1 7 5 3 6 7 1 1 4 3 9 7 2 1 6 10 7 1 8 5 6 6 1 5 3 4 9 9 9 10 3 6 1 6 2 9 7 1 6 5 4 3 5 8 10 5 7 1 9 5 8 8 2 2 9 2 3 5 5 5 4 9
// 100
// 8 9 6 10 2 4 3 1 8 1 6 9 6 10 10 10 7 7 5 7 1 4 2 6 10 5 8 4 3 4 6 10 10 6 9 4 6 8 3 6 6 6 9 10 2 2 5 1 9 8 4 5 7 5 5 8 4 5 3 10 2 7 10 6 10 5 9 4 8 10 8 5 4 10 9 10 4 9 3 1 2 8 1 1 2 10 3 1 8 5 1 5 2 7 10 5 9 2 4 5
// 100
// 2 7 1 5 6 5 5 8 4 10 5 6 8 9 2 2 7 5 2 2 5 1 4 6 3 1 2 5 8 8 10 10 2 10 2 5 6 3 10 4 8 7 2 7 6 6 4 8 8 1 1 5 9 8 4 7 3 5 4 3 1 7 1 3 7 5 6 5 4 4 5 4 5 1 4 6 1 2 8 4 6 2 1 8 7 3 4 1 1 1 9 4 5 7 8 3 6 8 7 6
// 100
// 10 8 5 3 4 6 3 1 8 9 8 4 2 7 6 3 8 10 8 4 4 1 4 1 3 10 6 3 3 10 4 5 9 9 10 3 1 10 8 8 7 1 2 1 4 5 6 7 2 10 1 3 2 1 7 10 10 5 1 5 1 8 8 8 5 10 9 3 3 1 1 9 10 6 2 5 10 9 7 1 4 3 7 10 1 8 8 7 6 2 9 2 2 3 6 8 3 8 6 3
// 100
// 6 1 6 9 9 9 7 4 5 2 1 3 6 7 9 9 3 1 9 7 4 10 8 4 8 9 3 1 7 3 2 7 5 2 10 7 10 7 7 10 10 1 4 6 10 2 5 6 7 2 2 4 7 5 5 2 4 1 5 2 3 1 8 9 4 4 3 6 5 10 7 8 1 1 9 7 5 4 8 9 4 1 5 2 4 4 8 1 3 7 8 8 8 8 4 1 6 2 3 8
// 100
// 10 1 9 7 6 9 4 5 1 8 7 8 2 2 6 7 3 4 6 2 8 3 9 1 10 3 10 10 3 6 2 7 5 8 6 2 4 2 3 2 3 10 4 1 4 7 7 1 6 9 4 8 10 3 9 1 4 3 8 3 5 10 8 6 5 9 1 2 5 2 10 1 2 6 3 8 3 8 5 9 1 6 9 2 2 10 7 6 3 8 5 6 10 2 6 1 9 8 2 2
// 100
// 2 4 6 4 10 3 10 2 10 5 1 4 1 3 7 2 9 4 3 1 1 4 3 7 2 3 9 8 1 9 5 5 1 1 5 10 9 1 3 3 7 4 2 6 4 3 5 8 4 5 5 4 3 2 3 1 1 7 8 9 2 5 3 8 10 10 8 1 6 6 5 4 8 4 9 4 7 2 3 3 9 8 5 4 1 1 9 10 9 9 4 7 5 1 7 6 3 9 8 3

// Output
// 14
// 1115
// 1104
// 1239
// 1004
// 1269
// 1176
// 1186
// 1226
// 1169



import java.util.*;
public class Perfect_Pairs_Of_Sqrt_Cbrt{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(n-->0)
        {
            int k=sc.nextInt(),c=0;
            int a[]=new int[k];
            for(int i=0;i<k;i++)
            {
                a[i]=sc.nextInt();
            }
            for(int i=0;i<k;i++)
            {
                for(int j=i+1;j<k;j++)
                {
                    if(i!=j)
                    {
                        int t=a[i]+a[j];
                        int sq=(int)Math.sqrt(t);
                        if(sq*sq==t)
                        {
                            c++;
                        }
                        int cb=(int)Math.cbrt(t);
                        if(cb*cb*cb==t)
                        {
                            c++;
                        }
                    }
                }
            }
            System.out.println(c);
        }
        sc.close();
    }
}