// Write a program to print from N to 0,skip a number in between.

// For example:

// Input Result 8 8 6 4 2 0 7 7 5 3 1

import java.util.*;
public class Skip_A_Number {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = num; i >= 0; i -= 2) {
            System.out.print(i + " ");
        }
        sc.close();
    }
}
