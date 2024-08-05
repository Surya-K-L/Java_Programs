
// Design a Program to check whether a character is alphabet or not.

// For example:

// Input	Result
// f       f is an alphabet
// #       # is not an alphabet


import java.util.*;
public class IsAlphabet{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        char alphabet=sc.next().charAt(0);
        if((alphabet>=65 && alphabet<=90)||(alphabet>=97 && alphabet<=122))
        {
            System.out.print(alphabet+" is an alphabet");
        }
        else
        {
            System.out.print(alphabet+" is not an alphabet");
        }
        sc.close();
    }
}