// Read a string and read a number.Display the nth character from the string

// For example:

// Input Result Hello e 2

// Hai H 1

import java.util.*;

public class Display_Nth_Character {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int n = sc.nextInt();
        System.out.print(str.charAt(n - 1));
        sc.close();
    }
}