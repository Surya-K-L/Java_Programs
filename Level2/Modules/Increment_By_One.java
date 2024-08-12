// Write a program to increment every digit by 1. If the digit is 9,it should not be increment,other digits have to be incremented by 1.

// Input:

// 5678

// Output:

// 6789

// Explanation:5 became 6,6 became 7,7 became 8 and 8 became 9

// Input:5559

// Output:6669

// Explanation:Note 9 alone remains 9,all other digits are incremented by 1.

import java.util.*;

public class Increment_By_One {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String z = Integer.toString(n);
        for (int i = 0; i < z.length(); i++) {
            if (Character.getNumericValue(z.charAt(i)) != 9) {
                System.out.print(Character.getNumericValue(z.charAt(i)) + 1);
            } else {
                System.out.print(z.charAt(i));
            }
        }
        sc.close();
    }
}