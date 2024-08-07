// For the given number N,reduce M until it reaches zero & display the sequence of numbers.

// For example:

// Input	Result
// 7       7 4 1
// 3

// 6       6 4 2 0
// 2


import java.util.*;
public class Reduce_M_Until_Zero{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),m=sc.nextInt();
        for(int i=n;i>=0;i-=m)
        {
            System.out.print(i+" ");
        }
        sc.close();
    }
}