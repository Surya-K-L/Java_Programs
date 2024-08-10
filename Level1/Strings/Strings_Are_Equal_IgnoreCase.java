// Program to compare if two strings are equal or not .ignoring the case

// Input:

// The first line of input is the integer T, denoting number of test cases. The first line of each test case is two input strings S1, S2 on the same line separated by a single space respectively.

// Output:

// For each test case, there is one line of output i.e. whether the Strings are equal or Strings are not equal

// Input    :
// 3
// codevita codevita
// Hackerrank Hackerearth
// Codevita codeVita

// Output :
// Strings are equal
// Strings are not equal
// Strings are equal

// For example:

// Input	                Result
// 3                       Strings are equal
// codevita codevita       Strings are not equal
// Hackerrank Hackerearth  Strings are equal
// Codevita codeVita


// 2                        Strings are not equal
// Helloworld worldHello    Strings are equal
// Python pyThon

import java.util.*;
public class Strings_Are_Equal_IgnoreCase{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        while(n-->0)
        {
            String str=sc.nextLine();
            String split[]=str.split(" ");
            if(split[0].equalsIgnoreCase(split[1]))
            {
                System.out.println("Strings are equal");
            }
            else
            {
                System.out.println("Strings are not equal");
            }
        }
        sc.close();
    }
}