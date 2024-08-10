// Write a program to store characters in an array and display them.

// For example:

// Input	Result
// 5       ABCDE
// A
// B
// C
// D
// E

// 10      SRISHAKTHI
// S
// R
// I
// S
// H
// A
// K
// T
// H
// I


import java.util.*;
public class Store_Char_In_Array{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        char arr[]=new char[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.next().charAt(0);
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]);
        }
        sc.close();
    }
}