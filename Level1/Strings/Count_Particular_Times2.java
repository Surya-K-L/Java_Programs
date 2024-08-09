// Find the number of times a character is present in the string

// For example:

// Input       Result 
// Hello       2
// l  

// Trait       1
// t  

// Belong      0
// k 

import java.util.*;

public class Count_Particular_Times2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char c = sc.next().charAt(0);
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == c) {
                count++;
            }
        }
        System.out.print(count);
        sc.close();
    }
}