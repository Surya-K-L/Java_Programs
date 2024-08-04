// Write a program to read and display 2 numbers.

// For example:

// Input	Result
// 5 6      5 6

import java.util.*;
public class PrintTwoNumbers{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),m=sc.nextInt();
        System.out.print(n+" "+m);
        sc.close();
    }
}
