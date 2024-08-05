
// Write a program to Find the greatest number among three numbers.

// Input    Result
// 7 5 2    7

// 5 8 2    8


import java.util.*;
public class Greatest_Of_Three_Numbers{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt(),num2=sc.nextInt(),num3=sc.nextInt();
        if(num1>num2 && num1>num3)
        {
            System.out.print(num1);
        }
        else if(num2>num1 && num2>num3)
        {
            System.out.print(num2);
        }
        else
        {
            System.out.print(num3);
        }
        sc.close();
    }
}