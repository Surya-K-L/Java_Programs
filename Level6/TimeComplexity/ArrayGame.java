// Ashish and Jeel are playing a game. They are given a multiset of arrays (initially only one array is present).

// A player has to make the following move in their turn:

// Select one of the arrays of size greater than 1
// Divide the array into two non-empty parts such that every element of the left array is smaller than every element of the right array.
// Formally, if we split an array A of size into arrays L and R, then the following conditions must hold:

// L must be a non-empty prefix and R must be the remaining non-empty suffix of the array A respectively.
// For every element Pi of L and every element Qj of R, the inequality Pi<Qj must hold.


// A player loses if he cannot make a move. Both the players play the game optimally. If Jeel plays first, then determine who wins the game.

// Input format

// First line: An integer T denoting the number of test cases
// Each test case:
// First line: An integer N denoting the size of the array
// Second line: N space separated integers, the ith integer being Ai
// Output format

 

// For each test case, print the winner of the game "Jeel" or "Ashish" (without quotes).

// Answer for each test case should come in a new line.

// Input Constraints

// 1≤T≤10

// 1≤N≤105

// 1≤Ai≤109

// Time complexity question



// Explanation for sample input:

// In the first testcase, no matter what move Jeel makes first, Ashish can always make the second move, and Jeel will be left with 3 arrays of size 1. Hence Ashish wins.

// In the second testcase, Jeel cannot make any move in the first turn itself, and hence he loses.

// In the third testcase, there is only one possible move, and after Jeel cut the array into [1, 1] and [3], Ashish cannot make any move, and he loses


// For example:

// Input	Result
// 3       Ashish
// 3
// 1 2 3
// 3       Ashish
// 5 3 1
// 3       Jeel
// 1 1 3


import java.util.*;
public class ArrayGame{
    private final static long N=(long)(1e5+5);
    private static long n;
    private static long cnt=0;
    private static long[] a=new long[(int) N];
    private static long[] pref=new long[(int)N];
    private static long[] suf=new long[(int)N];
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        long t=Long.parseLong(sc.next());
        while(t-->0)
        {
            cnt=0;
            n=Long.parseLong(sc.next());
            for(int i=1;i<=n;i++)
            {
                a[(int) i]=Long.parseLong(sc.next());
                pref[i]=Math.max(pref[i-1],a[i]);
            }
            suf[(int)(n+1)]=(long)1e9;
            for(long i=n;i>=1;i--)
            {
                	suf[(int) i] = Math.min(suf[(int) (i + 1)], a[(int) i]);
			}
			for (long i = 1; i <= n - 1; i++)
			{
				if (pref[(int) i] < suf[(int) (i + 1)])
				{
					cnt++;
				}
			}
			if ((cnt % 2) != 0)
			{
				System.out.println("Jeel");
			}
			else
			{
				System.out.println("Ashish");
			}
        }
        sc.close();
    }
}
