
// Write a program to print alphabets from A to Z.

// Sample Output

// A B C D E F G H I J K L M N O P Q R S T U V W X Y Z

import java.util.*;

public class Print_Alphabets {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <= 26; i++) {
            System.out.print((char) (i + 64) + " ");
        }
        sc.close();
    }
}