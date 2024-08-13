// Write a program to convert a number to binary number

// Input Format

// When N=B15

// Constraints

// -

// Output Format

// The output will be 101100010101

// Sample Input 0

// B15
// Sample Output 0

// B15 in Binary = 101100010101


import java.util.*;
public class Number_to_Binary{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String a=sc.next();
        int z=Integer.parseInt(a,16);
        System.out.print(Integer.toBinaryString(z));
        sc.close();
    }
}