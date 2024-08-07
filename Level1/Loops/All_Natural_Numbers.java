// Write a program to print all natural numbers from 1 to n.

// Sample Input

// 10

// Sample Output

// Natural numbers from 1 to 10: 1 2 3 4 5 6 7 8 9 10

// For example:

// Input    Result
// 5        Natural numbers from 1 to 5: 1 2 3 4 5


import java.util.*;
public class All_Natural_Numbers{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.print("Natural numbers from 1 to "+n+": ");
        for(int i=1;i<=n;i++)
        {
            System.out.print(i+" ");
        }
        sc.close();
    }
}
