// Write a program to check whether a string is a Palindrome or not

// Constraints

// Length of the string should be greater than one and less than 100.


// For example:

// Input	                  Result
// madam                   Palindrome

// extend                  Not a palindrome



import java.util.*;
public class Palindrome_Or_Not{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String a=sc.next();
        StringBuilder s=new StringBuilder(a);
        s.reverse();
        String z=s.toString();
        if(z.equals(a))
        {
            System.out.print("Palindrome");
        }
        else
        {
            System.out.print("Not a palindrome");
        }
    }
}
