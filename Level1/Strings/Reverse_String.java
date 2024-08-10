// Develop a program to reverse the given string

// For example:

// Input	Result
// Hello   olleH

// Hai     iaH


import java.util.*;
public class Reverse_String{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        for(int i=str.length()-1;i>=0;i--)
        {
            System.out.print(str.charAt(i));
        }
        sc.close();
    }
}