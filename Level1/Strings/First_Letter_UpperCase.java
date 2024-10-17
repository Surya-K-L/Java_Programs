// Read a string and capitalize the first character of a string

// For example:

// Input	  Result
// hello   Hello

// Hai     Hai



import java.util.*;
public class First_Letter_UpperCase{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        System.out.print(str.substring(0,1).toUpperCase()+str.substring(1,str.length()));
    }
}
