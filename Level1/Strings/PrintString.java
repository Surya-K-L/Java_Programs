// Write a java program to get a String as input and print it

// Input            Result
// Hello            Hello

import java.util.*;
public class PrintString{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        System.out.print(str);
        sc.close();
    }
}
