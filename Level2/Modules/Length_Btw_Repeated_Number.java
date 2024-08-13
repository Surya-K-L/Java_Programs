// Write a program to find the length between 2 repeating digits of a number  

// Input :
// 1789023476
// 7
// Output:
// 6

// answer is 6 because there are 6 digits between the 2 7s

// For example:

// Input	   Result
// 1789023476  6
// 7

// 133         0
// 3

import java.util.*;
public class Length_Btw_Repeated_Number{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        String a=Integer.toString(k);
        char p=sc.next().charAt(0);
        int s=0,e=a.length()-1;
        while(s<e)
        {
            if(a.charAt(s)!=p)
            {
                s++;
            }
            else if(a.charAt(e)!=p)
            {
                e--;
            }
            else
            {
                break;
            }
        }
        System.out.print((e-s)-1);
        sc.close();
    }
}