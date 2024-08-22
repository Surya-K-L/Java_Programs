// Write a program that takes a string as input and reverse only the vowels of a string.

// Example 1:

// Input: "hello"
// Output: "holle"
// Example 2:

// Input: "itvac"
// Output: "atvic"

// For example:

// Input	Result
// itvac   atvic

// test    test

// GELATO  GOLATE



import java.util.*;
public class Reverse_Only_Vowels{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String a=sc.next();
        System.out.print(ReverseOnlyVowel(a));
        sc.close();
    }
    public static String ReverseOnlyVowel(String s)
    {
        ArrayList<Character>al=new ArrayList<>();
        for(int i=0;i<s.length();i++)
        {
            if(isVowel(s.charAt(i)))
            {
                al.add(s.charAt(i));
            }
        }
        String ans="";
        int t=al.size()-1;
        for(int i=0;i<s.length();i++)
        {
            if(isVowel(s.charAt(i)))
            {
                ans=ans+""+al.get(t);
                t--;
            }
            else
            {
                ans+=s.charAt(i);
            }
        }
        return ans;
    }
    public static boolean isVowel(char s)
    {
        if(s=='A'||s=='E'||s=='I'||s=='O'||s=='U'||s=='a'||s=='e'||s=='i'||s=='o'||s=='u')
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}

