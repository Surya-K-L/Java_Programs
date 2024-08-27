// Given a string S, print the minimum number of characters you have to remove from the string S to make it a clean string. A clean string is a string in which all the characters are distinct.

// Input:

// First line of input contains a string S, (1≤|S|≤10000)

// . S consists of lowercase characters only.

// Output:

// Print an integer denoting the minimum number of characters you have to remove from S to make it a good string.



// Need the most efficient algorithm since the problem is tagged with timelimit of 100 ms

// Sample Input
// aabc
// Sample Output
// 1

// For example:

// Input	Result
// aabc    1

// q1      0



import java.util.*;
public class Clean_String{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String a=sc.next();
        LinkedHashSet<Character>al=new LinkedHashSet<>();
        for(int i=0;i<a.length();i++)
        {
            al.add(a.charAt(i));
        }
        System.out.print(a.length()-al.size());
        sc.close();
    }
}
