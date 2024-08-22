// Write a program to remove unbalanced parentheses in a given expression.

// Input Format

// String with unbalanced Parantheses.

// Constraints

// It should be a string.

// Output Format

// String with balanced Parantheses.

// Sample Input 0

// (((ab) 
// Sample Output 0

// (ab)

import java.util.*;

public class Remove_Unbalanced_Paranthesis {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        Stack<Character> al = new Stack<>();
        String z = "";
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == '(' || Character.isAlphabetic(a.charAt(i))) {
                al.push(a.charAt(i));
            } else if (a.charAt(i) == ')') {
                while (!al.isEmpty() && al.peek() != '(') {
                    z = z + al.pop();
                }
            }
        }
        StringBuilder s = new StringBuilder(z);
        s.reverse();
        z = s.toString();
        System.out.print("(" + z + ")");
        sc.close();
    }
}