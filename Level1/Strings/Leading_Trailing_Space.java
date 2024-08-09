// Write a program to remove the leading and trailing space characters and print the sum of numbers

// Input 1:

// 23

// 45

// Output 1:

// 68

// Input 2:

// 60

// 3

// Output 2:

// 63

import java.util.*;
public class Leading_Trailing_Space {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine().trim();
        String b = sc.nextLine().trim();
        int c = Integer.parseInt(a);
        int d = Integer.parseInt(b);
        System.out.print(c + d);
        sc.close();
    }
}