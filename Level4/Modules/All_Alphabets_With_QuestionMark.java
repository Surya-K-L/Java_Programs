// Sub-string that contains all lowercase alphabets after performing the given operation

// Given a string str containing lower case alphabets and character ‘?’. The task is to check if it is possible to make str good or not.

// A string is called good if it contains a sub-string of length 26 which has every character of lower case alphabets in it.

// The task is to check if it is possible to make the string good by replacing ‘?’ characters with any lower case alphabet. If it is possible then print the modified string otherwise print -1.

// Input: str = “abcdefghijkl?nopqrstuvwxy?”

// Output: abcdefghijklmnopqrstuvwxyz

// Replace first ‘?’ with ‘m’ and second with ‘z’.

// Input: str = “abcdefghijklmnopqrstuvwxyz??????”

// Output: abcdefghijklmnopqrstuvwxyzaaaaaa

// Given string already has a sub-string which contains all the 26 lower case alphabets.


// For example:

// Input	                        Result
// abcdefghijklmnopqrst??yz        -1

// abcd??ghijklmnop??????wx?yz     abcdefghijklmnopqrstuvwxyyz


import java.util.*;
public class All_Alphabets_With_QuestionMark{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        if(s.length()<26)
        {
            System.out.print(-1);
        }
        else
        {
            ArrayList<Character>al=new ArrayList<>();
            char a[]=s.toCharArray();
            for(char arr:a)
            {
                al.add(arr);
            }
            for(int i=0;i<al.size();i++)
            {
                char res=al.get(i);
                if(res=='?')
                {
                    char ch=(char)(97+i);
                    al.set(i,ch);
                }
            }
            String ans="";
            for(char k:al)
            {
                ans+=k;
            }
            System.out.print(ans);
        }
        sc.close();
    }
}