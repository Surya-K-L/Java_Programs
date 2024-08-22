// The letter value of a letter is its position in the alphabet starting from 0 (i.e. 'a' -> 0, 'b' -> 1, 'c' -> 2, etc.).

// The numerical value of some string of lowercase English letters s is the concatenation of the letter values of each letter in s, which is then converted into an integer.

// For example, if s = "acb", we concatenate each letters letter value, resulting in "021". After converting it, we get 21.
// You are given three strings firstWord, secondWord, and targetWord, each consisting of lowercase English letters 'a' through 'j' inclusive.

// Return true if the summation of the numerical values of firstWord and secondWord equals the numerical value of targetWord, or false otherwise.

// Example 1:

// Input: firstWord = "acb", secondWord = "cba", targetWord = "cdb"
// Output: true
// Explanation:
// The numerical value of firstWord is "acb" -> "021" -> 21.
// The numerical value of secondWord is "cba" -> "210" -> 210.
// The numerical value of targetWord is "cdb" -> "231" -> 231.
// We return true because 21 + 210 == 231.

// For example:

// Input   Result
// acb     true
// cba
// cdb

// aaa     false
// a
// aab



import java.util.*;
public class Letter_Value_Boolean{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String a=sc.next(),b=sc.next(),c=sc.next();
        int n=0,m=0,k=0;
        for(int i=0;i<a.length();i++)
        {
            int t=a.charAt(i)-97;
            n+=t;
        }
        for(int i=0;i<b.length();i++)
        {
            int t=b.charAt(i)-97;
            m+=t;
        }
        for(int i=0;i<c.length();i++)
        {
            int t=c.charAt(i)-97;
            k+=t;
        }
        System.out.print((n+m)==k?"true":"false");
        sc.close();
    }
}