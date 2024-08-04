// Write a program to read a number and display in given format

// For example:

// Input   Result 
// 5       Entered number is 5 
// 7       Entered number is 7

import java.util.*;

public class Read_And_Display {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print("Entered number is " + n);
        sc.close();
    }
}
