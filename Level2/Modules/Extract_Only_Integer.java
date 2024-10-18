// Given a string S consisting of digits, alphabets and special characters.Extract only the integers from the given string and display the resultant string.



// Note:

// The first line of input is the no of test case T,followed by the number of input strings

// The string is fetched by the user as dynamic input.

// Sample Input
// 2
// ramsathsfghhd A-118, Sector-136, Uttar Pradesh-201305
// 1abc35de 99fgh, dd11
// Sample Output
// 118 136 201305
// 1 35 99 11

// For example:

// Input	Result
// 2
// ramsathsfghhd A-118, Sector-136, Uttar Pradesh-201305
// 1abc35de 99fgh, dd11
// 118 136 201305
// 1 35 99 11
// 1
// 1a56b__c35ddgshsbse 99fgh, dd11
// 1 56 35 99 11




import java.util.*;
public class Extract_Only_Integer{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        while(n-->0)
        {
            String a=sc.nextLine();
            a=a.replaceAll("[^0-9]"," ").replaceAll("\\s+"," ").trim();
            System.out.println(a);
        }
        
    }
}
