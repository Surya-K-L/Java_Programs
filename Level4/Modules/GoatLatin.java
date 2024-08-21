// A sentence S is given, composed of words separated by spaces. Each word consists of lowercase and uppercase letters only.

// We would like to convert the sentence to "Goat Latin" (a made-up language similar to Pig Latin.)

// The rules of Goat Latin are as follows:

// If a word begins with a vowel (a, e, i, o, or u), append "ma" to the end of the word.
// For example, the word 'apple' becomes 'applema'.
 

// If a word begins with a consonant (i.e. not a vowel), remove the first letter and append it to the end, then add "ma".
// For example, the word "goat" becomes "oatgma".


// Add one letter 'a' to the end of each word per its word index in the sentence, starting with 1.
// For example, the first word gets "a" added to the end, the second word gets "aa" added to the end and so on.
// Return the final sentence representing the conversion from S to Goat Latin. 

 

// Example 1:

// Input: "I speak Goat Latin"
// Output: "Imaa peaksmaaa oatGmaaaa atinLmaaaaa"
// Example 2:

// Input: "The quick brown fox jumped over the lazy dog"
// Output: "heTmaa uickqmaaa rownbmaaaa oxfmaaaaa umpedjmaaaaaa overmaaaaaaa hetmaaaaaaaa azylmaaaaaaaaa ogdmaaaaaaaaaa"
 

// Notes:

// S contains only uppercase, lowercase and spaces. Exactly one space between each word.
// 1 <= S.length <= 150.


// For example:

// Input	                                        Result
// I speak Goat Latin                              Imaa peaksmaaa oatGmaaaa atinLmaaaaa

// The quick brown fox jumped over the lazy dog    heTmaa uickqmaaa rownbmaaaa oxfmaaaaa umpedjmaaaaaa overmaaaaaaa hetmaaaaaaaa azylmaaaaaaaaa ogdmaaaaaaaaaa



import java.util.*;
public class GoatLatin{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String a[]=sc.nextLine().split(" ");
        for(int i=0;i<a.length;i++)
        {
            String z=a[i];
            if(z.charAt(0)=='a'||z.charAt(0)=='A'||z.charAt(0)=='i'||z.charAt(0)=='I'||z.charAt(0)=='o'
            ||z.charAt(0)=='O'||z.charAt(0)=='U'||z.charAt(0)=='u')
            {
                z=z+"ma";
                for(int j=0;j<=i;j++)
                {
                    z=z+"a";
                }
            }
            else
            {
                z=z.substring(1,z.length())+""+z.charAt(0);
                z=z+"ma";
                for(int j=0;j<=i;j++)
                {
                    z=z+"a";
                }
            }
            System.out.print(z+" ");
        }
        sc.close();
    }
}

