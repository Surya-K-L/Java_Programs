// Write a program to swap the first and last digits of a given number

// For example:

// Input   Result 
// 6754    4756

// 37564   47563

// 75      57

import java.util.*;

public class Swap_First_And_Last {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] c = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            c[i] = str.charAt(i);
        }
        char t = '0';
        for (int i = 0; i < 1; i++) {
            t = c[i];
            c[i] = c[str.length() - 1];
            c[str.length() - 1] = t;
        }
        System.out.print(c);
        sc.close();
    }
}
