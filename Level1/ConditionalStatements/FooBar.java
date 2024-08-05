
// Write a program to get integer input from the user and print"FooBar"if the number is divisible by 3&5 and print"Foo"if the number is divisible by 3 and print"Bar"if the number is divisible by 5 and print"None"if the number is not divisible by 3 and 5.

// For example:

// Input Result 
// 15    FooBar 
// 25    Bar

import java.util.*;

public class FooBar {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num % 3 == 0 && num % 5 == 0) {
            System.out.print("FooBar");
        } else if (num % 3 == 0) {
            System.out.print("Foo");
        } else if (num % 5 == 0) {
            System.out.print("Bar");
        } else {
            System.out.print("None");
        }
        sc.close();
    }
}