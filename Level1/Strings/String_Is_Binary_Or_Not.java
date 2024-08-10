// Write a program to check whether a string is binary string or not.

// Input Format

// 10111

// Constraints

// Length of the string should be greater than 1 or less than 100.

// Output Format

// True

import java.util.*;
public class String_Is_Binary_Or_Not{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        String str1=str.replaceAll("[^01]","");
        if(str1.length()!=str.length())
        {
            System.out.print("False");
        }
        else
        {
            System.out.print((str.length()>1&& str.length()<100)?"True":"False");
        }
        sc.close();
    }
}