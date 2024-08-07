// Print the maximum of n given numbers. 

// NOTE: You should not declare an array

// For example:

// Input	Result
// 5       30
// 10
// 20
// 30
// 15
// 5


import java.util.*;
public class Maximum{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),max=0;
        while(n-->0)
        {
            int t=sc.nextInt();
            if(t>max)
            {
                max=t;
            }
        }
        System.out.print(max);
        sc.close();
    }
}
