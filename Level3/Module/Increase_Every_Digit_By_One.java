// Write a program to increase every digit by 1 in a given string.If it is not a digit then the character should not be modified

// Input Format

// abc123ddee456

// Output Format

// abc234ddee567

// Sample Input

// 000 aaa11111bbbxxx000

// Sample Output

// 111 aaa22222bbbxxx111

import java.util.*;

public class Increase_Every_Digit_By_One {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        for (int i = 0; i < a.length(); i++) {
            if (Character.isDigit(a.charAt(i)) && Character.getNumericValue(a.charAt(i)) < 9) {
                System.out.print(Character.getNumericValue(a.charAt(i)) + 1);
            } else {
                System.out.print(a.charAt(i));
            }
        }
        sc.close();
    }
}