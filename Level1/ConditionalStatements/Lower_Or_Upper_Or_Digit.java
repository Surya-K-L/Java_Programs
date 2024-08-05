// Write a program to receive a character as user input and determine if that character is upper case letter (capital letter) or lower case letter (small letter) or a number (0-9) or some other character.

// Hint: Refer to the ASCII table.

// For example:

// Input	Result
// g       Lower case letter
// H       Upper case letter
// #       Special character
// 8       Number

import java.util.*;

public class Lower_Or_Upper_Or_Digit {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        if (ch >= 65 && ch <= 90) {
            System.out.print("Upper case letter");
        } else if (ch >= 97 && ch <= 122) {
            System.out.print("Lower case letter");
        } else if (ch >= 48 && ch <= 57) {
            System.out.print("Number");
        } else {
            System.out.print("Special character");
        }
        sc.close();
    }
}
