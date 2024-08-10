// Search for a substring within a string

// For example:

// Input                       Result 
// HelloWorld                  Starts at position 6
// World  

// Friends are always there    Starts at position 13
// always 

import java.util.*;

public class Substring_Position {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine(), str2 = sc.next();
        System.out.print("Starts at position " + (str.indexOf(str2) + 1));
        sc.close();
    }
}