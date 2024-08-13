// Count the number of times a number appears in a given set of numbers

// input
// 5 <- number of inputs
// 2 <- number to search
// 1
// 2
// 2
// 2
// 1

// oUTPUT:

// 3

// 2 OCCURS 3 TIMES 

// For example:

// Input	Result
// 5       3
// 2
// 1
// 2
// 2
// 2
// 1

import java.util.*;
public class Number_Of_Times_K_Appears{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt(),c=0;
        while(n-->0)
        {
            if(sc.nextInt()==k)
            {
                c++;
            }
        }
        System.out.print(c);
        sc.close();
    }
}