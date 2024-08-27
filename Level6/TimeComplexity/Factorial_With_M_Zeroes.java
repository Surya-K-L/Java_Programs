// For each integer m find number of n such that the factorial of n ends with exactly m zeroes.

// Input First line of input contains an integer T number of test cases. Each test case contains an integer M (1 ≤ M ≤ 100,000) — the required number of trailing zeroes in factorial.

// Output First print k — the number of values of n such that the factorial of n ends with m zeroes. Then print these k integers in increasing order.

// It is a time complexity question, so the output should be efficient and should be within 1 ms

// Sample Input

// 1
// 1

// Sample Output

// 5
// 5 6 7 8 9

// For example:

// Input	
// 10
// 235
// 679
// 729
// 738
// 738
// 661
// 506
// 802
// 210
// 642

// Result:
// 0
// 5
// 2725 2726 2727 2728 2729
// 5
// 2925 2926 2927 2928 2929
// 5
// 2965 2966 2967 2968 2969
// 5
// 2965 2966 2967 2968 2969
// 5
// 2650 2651 2652 2653 2654
// 5
// 2030 2031 2032 2033 2034
// 5
// 3215 3216 3217 3218 3219
// 0
// 5
// 2575 2576 2577 2578 2579


import java.util.*;
public class Factorial_With_M_Zeroes{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int j=0;j<n;j++)
        {
            int k=a[j];
            ArrayList<Integer>al=new ArrayList<>();
            for(int i=2;i<10000;i++)
            {
                int c=0;
                for(int p=5;i/p>=1;p=p*5)
                {
                    c=c+i/p;
                }
                if(c==k)
                {
                    al.add(i);
                }
            }
            System.out.println(al.size());
            for(int l=0;l<al.size();l++)
            {
                System.out.print(al.get(l)+" ");
                if(l==al.size()-1)
                {
                    System.out.println();
                }
            }
        }
        sc.close();
    }
}
