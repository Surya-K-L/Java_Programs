// Write a program toggle n+1 th bit of a given number

// Input Format:

// number and n value

// Output Format:

// Integer result

// Constraints:

// SHOULD NOT CONVERT AND SOLVE THIS PROBLEM AS String. 
// Problem should be solved AS INTEGER ONLY USING BITWISE OPERATORS

// Sample Input :
// 6
// 4



// Sample Output :
// 22

// Explanation

// 6 in binary is 00000110
// When the n+1th bit (5th bit) is toggled it becomes 00010110 which is binary for 22





// For example:

// Input	Result
// 6       22
// 4

// 10      8
// 1



import java.util.*;
public class Toggle_N_Plus_One_Bit{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),k=sc.nextInt();
        System.out.print(n^(1<<k));
        sc.close();
    }
}