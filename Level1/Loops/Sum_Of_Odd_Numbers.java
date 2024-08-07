// Write a program to find sum of all odd numbers from 1 to n.

// For example:

// Input	Result
// 15      Sum of Odd Numbers from 1 to 15: 64


import java.util.*;
public class Sum_Of_Odd_Numbers{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int sum=0;
        for(int i=1;i<=num;i++)
        {
            if(i%2==1)
            {
                sum+=i;
            }
        }
        System.out.print("Sum of Odd Numbers from 1 to "+num+": "+sum);
        sc.close();
    }
}