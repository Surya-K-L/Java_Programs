// Reverse every word in a given sentence

// For example:

// Input	    Result
// This is it  sihT si ti


import java.util.*;
public class Reverse_Every_Word_In_String{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String split[]=str.split(" ");
        for(int i=0;i<split.length;i++)
        {
            StringBuilder s=new StringBuilder(split[i]);
            s.reverse();
            System.out.print(s.toString()+" ");
        }
        sc.close();
    }
}
