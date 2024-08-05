
// Write a program to find if a given number is divisible by 13

// For example:

// Input	Result
// 39      YES

// 43      NO

import java.util.*;

public class Divisible_by_Thirteen {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num % 13 == 0) {
            System.out.print("YES");
        } else {
            System.out.print("NO");
        }
        sc.close();
    }
}