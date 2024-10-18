// Write a program to swap the adjacent digits of a given number. 
// Constraint: Input will be only 2 or 4 digit numbers. If 3 or 5 digit number is given return -1

// For example:

// Input	Result
// 7890  8709

// 28    82

// 8970  9807



import java.util.*;
public class Swap_The_Adjacent_Digit{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String a=sc.next();
        for(int i=0;i<a.length()-1;i+=2)
        {
            System.out.print(a.charAt(i+1));
            System.out.print(a.charAt(i));
        }
    }
}
