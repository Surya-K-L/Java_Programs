// Given two binary strings a and b, return their sum as a binary string.

// Example 1:

// Input: a = "11", b = "1"
// Output: "100"
// Example 2:

// Input: a = "1010", b = "1011"
// Output: "10101"

// Constraints:

// 1 <= a.length, b.length <= 104
// a and b consist only of '0' or '1' characters.
// Each string does not contain leading zeros except for the zero itself.

// For example:

// Input	Result
// 11      100
// 1

// 1010    10101
// 1011

import java.util.*;

public class Sum_Of_Binary {
    public static void main(String h[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(2);
        int b = sc.nextInt(2);
        System.out.print(Integer.toBinaryString(a + b));
        sc.close();
    }
}