// Given a String (of maximum length 1000) representing a large number, output its remainder modulo 11.

// Input Specification:

// Input1: a large number in the form of string

// Output Specification:

// Return the remainder modulo 11.

// Example 1:

// Input 1: 121

// Output 1: 0

// Explanation:

// 121 mod 11 = 0

// Example 2:

// Input 1: 452

// Output 1: 1

// Explanation:

// 452 mod 11 = 1

// Input Format
// a large number in the form of string

// Output Format
// Return the remainder modulo 11.

// Sample Input
// 121
// Sample Output
// 0



import java.util.*;
public class Modulo_Eleven{
    public static void main(String h[])
    {
        Scanner sc=new Scanner(System.in);
        String a=sc.next();
        int b=Integer.parseInt(a);
        System.out.print(b%11);
    }
}
