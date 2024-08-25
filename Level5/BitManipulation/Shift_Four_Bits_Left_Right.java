// For a given number shift the left 4 bits to right and right 4 bits to left

// Example: 240 in hexadecimal is 0xF0 which is 0x11110000

// When it is shifted 4 to right it becomes 0x0F which is 15

// SHOULD NOT CONVERT AND SOLVE THIS PROBLEM AS String. 
// Problem should be solved AS INTEGER ONLY USING BITWISE OPERATORS

// For example:

// Input	Result
// 240     15


import java.util.*;
public class Shift_Four_Bits_Left_Right{
    public static void main(String h[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.print(n>>4);
        sc.close();
    }
}
