// Write a program to display the words of a sentence in different lines

// For example:

// Input	                Result
// Hello! Good Morning     Hello!
//                         Good
//                         Morning

// Hai there               Hai            
//                         there



import java.util.*;
public class Split_And_Print{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String split[]=str.split(" ");
        for(String s:split)
        {
            System.out.println(s);
        }
        sc.close();
    }
}