// Given a string s which consists of lowercase or uppercase letters, return the length of the longest palindrome that can be built with those letters.

// Letters are case sensitive, for example, "Aa" is not considered a palindrome here.

 

// Example 1:

// Input: s = "abccccdd"
// Output: 7
// Explanation:
// One longest palindrome that can be built is "dccaccd", whose length is 7.
// Example 2:

// Input: s = "a"
// Output: 1
// Example 3:

// Input: s = "bb"
// Output: 2
 

// Constraints:

// 1 <= s_length <= 2000
// s consists of lowercase and/or uppercase English letters only.


// For example:

// Input	    Result
// abab        4

// abbccccxy   7



import java.util.*;
public class Longest_Palindrome_Length{
    public static void main(String h[])
    {
        Scanner sc=new Scanner(System.in);
        String a=sc.next();
        char b[]=a.toCharArray();
        Arrays.sort(b);
        int c=0,t=0,s=0;
        for(int i=0;i<b.length;i++)
        {
            c=1;
            while(i<b.length-1 && b[i]==b[i+1])
            {
                c++;
                i++;
            }
            if(c%2==0)
            {
                t=t+c;
            }
            else
            {
                s=1;
            }
        }
        if(s==1)
        {
            System.out.print(t+s);
        }
        else
        {
            System.out.print(t);
        }
        sc.close();
    }
}
