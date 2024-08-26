// The DNA sequence is composed of a series of nucleotides abbreviated as 'A', 'C', 'G', and 'T'.

// For example, "ACGAATTCCG" is a DNA sequence.
// When studying DNA, it is useful to identify repeated sequences within the DNA.

// Given a string s that represents a DNA sequence, return all the 10-letter-long sequences (substrings) that occur more than once in a DNA molecule. You may return the answer in any order.

// Example 1:

// Input: s = "AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT"
// Output: ["AAAAACCCCC","CCCCCAAAAA"]
// Example 2:

// Input: s = "AAAAAAAAAAAAA"
// Output: ["AAAAAAAAAA"]
// Constraints:

// 1 <= s.length <= 105
// s[i] is either 'A', 'C', 'G', or 'T'.




import java.util.*;
public class DNA_Sequence{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        int t=10;
        LinkedHashSet<String>al=new LinkedHashSet<>();
        for(int i=0;i<a.length()-10;i++)
        {
            String b=a.substring(i,t);
            for(int j=i+10;j<a.length()-9;j++)
            {
                String c=a.substring(j,j+10);
                if(b.equals(c))
                {
                    al.add(b);
                    break;
                }
            }
            t++;
        }
        for(String z:al)
        {
            System.out.println(z);
        }
        sc.close();
    }
}