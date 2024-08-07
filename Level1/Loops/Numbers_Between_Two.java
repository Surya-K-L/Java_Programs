// Write a program to print numbers between 2 given numbers

// For example:

// Input Result 
// 3 5   3 4 5

// 1 7   1 2 3 4 5 6 7 

import java.util.*;

public class Numbers_Between_Two {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        for (int i = num1; i <= num2; i++) {
            System.out.print(i + " ");
        }
        sc.close();
    }
}
