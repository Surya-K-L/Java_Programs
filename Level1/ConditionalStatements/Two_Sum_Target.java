
// Write a program to check if the addition of the first 2 numbers results in the 3rd number

// For example:

// Input	Result
// 2       TRUE
// 1
// 3

// 10      TRUE
// 20
// 30

// 10      FALSE
// 20
// 10


import java.util.*;

public class Two_Sum_Target {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt(), num2 = sc.nextInt(), sum = sc.nextInt();
        if (num1 + num2 == sum) {
            System.out.println("TRUE");
        } else {
            System.out.println("FALSE");
        }
        sc.close();
    }
}