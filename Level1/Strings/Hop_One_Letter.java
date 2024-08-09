// Write a program to hop one letter and print the string as given in the example below

// For example:

// Input	    Result
// string      srn

// println     pitn



import java.util.*;
public class Hop_One_Letter{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        for(int i=0;i<str.length();i+=2)
        {
            System.out.print(str.charAt(i));
        }
        sc.close();
    }
}