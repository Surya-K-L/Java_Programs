// Minimum coin denominations

// Find the minimum number of coins required to make n cents. You can use standard American denominations, that is, 1¢, 5¢, 10¢, and 25¢. For example, given n = 16, return 3 since we can make it with a 10¢, a 5¢, and a 1¢

// Sample Input 3 16 13 500

// Sample output 3 2 20

// Sample Input 1 72

// Sample Output 6

// Input Format

// First line of the input is the number of test cases followed by n integers in each line

// Constraints

// 1 <= N <= 1000

// Output Format

// Single integer which is the minimum number of coins.

// Sample Input 0

// 3
// 16
// 13
// 500
// Sample Output 0

// 3
// 4
// 20

import java.util.*;

public class Minimum_Coin_Denomination {
    public static void main(String h[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int t = sc.nextInt();
            int a = 0, b = 0, c = 0, d = 0;
            while (t >= 25) {
                t = t - 25;
                a++;
            }
            while (t >= 10) {
                t = t - 10;
                b++;
            }
            while (t >= 5) {
                t = t - 5;
                c++;
            }
            while (t >= 1) {
                t = t - 1;
                d++;
            }
            System.out.println(a + b + c + d);
        }
        sc.close();
    }
}