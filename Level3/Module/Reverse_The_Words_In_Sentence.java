// Write a program to reverse the words in a given sentence.

// Input Format

// This is a word

// Output Format

// sihT si a drow


// For example:

// Input	           Result
// This is a word      sihT si a drow



import java.util.*;
public class Reverse_The_Words_In_Sentence{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String a[]=sc.nextLine().split(" ");
        for(int i=0;i<a.length;i++)
        {
            StringBuilder s=new StringBuilder(a[i]);
            System.out.print(s.reverse().toString()+" ");
        }
        sc.close();
    }
}