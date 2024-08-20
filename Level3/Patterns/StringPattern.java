// Given an odd length word which should be printed from the middle of the word.

// The output should be in the following pattern.

// Example:

// Input: PROGRAM

// Output:

// G

// GR

// GRA

// GRAM

// GRAMP

// GRAMPR

// GRAMPRO

// For example:

// Input	Result
// hello
// l
// ll
// llo
// lloh
// llohe


import java.util.*;
public class StringPattern{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String a=sc.next();
        String b=a.substring(a.length()/2,a.length())+a.substring(0,a.length()/2);
        for(int i=0;i<b.length();i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print(b.charAt(j));
            }
            System.out.println();
        }
        sc.close();
    }
}