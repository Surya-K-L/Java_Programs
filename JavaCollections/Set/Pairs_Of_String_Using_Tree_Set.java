// You are given n pairs of strings. Two pairs (a, b) and (c, d) are identical if a=c and b=d. That also implies (a, b) is not same as (c, d). After taking each pair as input, you need to print number of unique pairs you currently have.

// Input Format

// In the first line, there will be an integer T denoting number of pairs. Each of the next T lines will contain two strings separated by a single space.

// Output Format

// Print T lines. In the ith line, print number of unique pairs you have after taking ith pair as input.

// Sample Input

// 5

// john tom

// john mary

// john tom

// mary helen

// mary helen

// Sample Output

// 1

// 2

// 2

// 3

// 3

// Explanation

// After taking the first input, you have only one pair: (john,tom)

// After taking the second input, you have two pairs: (john, tom) and (john, mary)

// After taking the third input, you still have two unique pairs.

// After taking the fourth input, you have three unique pairs: (john,tom), (john, mary) and (mary, helen)

// After taking the fifth input, you still have three unique pairs.


// For example:

// Input	      Result
// 6             1
// one two       1
// one two       2
// one three     3
// one four      4
// four one      5
// four five



import java.util.*;
public class Pairs_Of_String_Using_Tree_Set{
    public static void main(String h[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        int c=0;
        TreeSet<String> TS=new TreeSet<String>();
        for(int i=0;i<n;i++)
        {
            String S=sc.nextLine();
        
        if(TS.contains(S)==false)
        {
            c++;
        }
        else
        {
            continue;
        }
        TS.add(S);
        System.out.println(c);
        }
        sc.close();
    }
}
