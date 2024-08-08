// Write a program to add all digits of a given number

// For example:

// Input Result 
// 345   12 
// 30    3

import java.util.*;

public class All_Add_Digits {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), ans = 0;
        while (n > 0) {
            int t = n % 10;
            ans += t;
            n = n / 10;
        }
        System.out.print(ans);
        sc.close();
    }
}