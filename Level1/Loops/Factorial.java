// Write a program to find the factorial of a given number.

// Example

// sample input1: 5

// sample output1: 120

// sample input2: 4

// sample output2: 24



import java.util.*;

public class Factorial{
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int fact=1;
        for(int i=1;i<=num;i++)
        {
            fact=fact*i;
        }
        System.out.print(fact);
        sc.close();
    }
}