// Write a program to read 2 strings and see if they are equal (ignore case). 

// Should not use any built in functions. A function should be written.

// For example:

// Input	Result
// Hello   Yes
// hello

// Hai     No
// Bye



import java.util.*;
public class String_Equal_Without_Inbuilt{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String a=sc.next().toLowerCase(),b=sc.next().toLowerCase();
        if(a.length()!=b.length())
        {
            System.out.print("No");
        }
        else
        {
            int count=0;
            for(int i=0;i<a.length();i++)
            {
                if(a.charAt(i)!=b.charAt(i))
                {
                    System.out.print("No");
                    count=1;
                    break;
                }
            }
            if(count==0)
            {
                System.out.print("Yes");
            }
        }
        sc.close();
    }
}