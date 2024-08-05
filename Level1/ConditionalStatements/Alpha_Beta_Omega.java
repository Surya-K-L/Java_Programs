
// A character and number are given as input

// If the number is between 1 to 10 and character is between A to C then print ALPHA

// If the number is between 11 to 30 and character is between D to R then print BETA

// If the number is between 1 to 10 and character is between D to R then print GAMMA

// If the number is between 11 to 30 and character is between A to C then print DELTA

// Otherwise print OMEGA

// For example:

// Input   Result 
// A 3     ALPHA 
// R 30    BETA 
// R 10    GAMMA 
// C 11    DELTA 
// Z 100   OMEGA 
// X 7     OMEGA

import java.util.*;

public class Alpha_Beta_Omega {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        char alp = sc.next().charAt(0);
        int num = sc.nextInt();
        if ((num >= 1 && num <= 10) && (alp >= 'A' && alp <= 'C')) {
            System.out.print("ALPHA");
        } else if ((num >= 11 && num <= 30) && (alp >= 'D' && alp <= 'R')) {
            System.out.print("BETA");
        } else if ((num >= 1 && num <= 10) && (alp >= 'D' && alp <= 'R')) {
            System.out.print("GAMMA");
        } else if ((num >= 11 && num <= 30) && (alp >= 'A' && alp <= 'C')) {
            System.out.print("DELTA");
        } else {
            System.out.print("OMEGA");
        }
        sc.close();
    }
}
