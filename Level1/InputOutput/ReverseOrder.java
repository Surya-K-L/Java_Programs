// Write a program to read and print 2 numbers. The numbers should be displayed in reverse order. 
// First number should be printed second and second number should be printed first.

// For example:

// Input	Result
// 5 6      6 5

import java.util.*;
public class ReverseOrder{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),m=sc.nextInt();
        System.out.print(m+" "+n);
        sc.close();
    }
}