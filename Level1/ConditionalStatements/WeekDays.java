
// Write a program to read a number (0-6) and print the weekday name.

// Sample Input1: 5

// Sample Output1: Friday

// Sample Input2 :9

// Sample Output2: Invalid weekday

// For example:

// Input	Result
// 0       Sunday

// 3       Wednesday

// 9       Invalid weekday

import java.util.*;

public class WeekDays {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();
        if (day == 0) {
            System.out.print("Sunday");
        } else if (day == 1) {
            System.out.print("Monday");
        } else if (day == 2) {
            System.out.print("Tuesday");
        } else if (day == 3) {
            System.out.print("Wednesday");
        } else if (day == 4) {
            System.out.print("Thursday");
        } else if (day == 5) {
            System.out.print("Friday");
        } else if (day == 6) {
            System.out.print("Saturday");
        } else {
            System.out.print("Invalid weekday");
        }
        sc.close();
    }
}