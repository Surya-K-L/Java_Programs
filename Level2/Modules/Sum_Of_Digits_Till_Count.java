// For the given number N ,perform of sum of digits starting  from the digit N till it reaches the no. of count.

// Input format

// Given number N  5

// count C 3

// Output format

// 5+6+7=18

// sample input1

// 6
// 3

// sample output1 21

// sample input2
// 2
// 4

// sample output2 9

import java.util.*;
public class Sum_Of_Digits_Till_Count{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt(),sum=0;
        while(k-->0)
        {
            sum+=n;
            n++;
        }
        System.out.print(sum);
    }
}
        
