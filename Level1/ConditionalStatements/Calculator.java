
// Write a program to design a calculator with basic operations(+,_,*,/,%)

// For example:

// Input Result
// +     11
// 5 
// 6

// %     1
// 9 
// 4

import java.util.*;

public class Calculator {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        char operation=sc.next().charAt(0);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        if(operation=='+')
        {
            System.out.print(num1+num2);
        }
        else if(operation=='-')
        {
            System.out.print(num1-num2);
        }
        else if(operation=='*')
        {
            System.out.print(num1*num2);
        }
        else if(operation=='/')
        {
            System.out.print(num1/num2);
        }
        else if(operation=='%')
        {
            System.out.print(num1%num2);
        }
        sc.close();
    }
}