// Read a string and display the length of the string

// For example:

// Input   Result 
// Hello   5

// Hai     3

import java.util.*;

public class Length_Of_String {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.print(str.length());
        sc.close();
    }
}