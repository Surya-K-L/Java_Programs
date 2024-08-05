
// An angle is complementary if it is 90'

// An angle is supplementary if it is 180'

// An angle is complete if it is 0 or 360'

// Find if a given angle is one of the above, otherwise enter NONE



// For example:

// Input	Result
// 90      COMPLEMENTARY
// 180     SUPPLEMENTARY
// 360     COMPLETE
// 0       COMPLETE
// 142     NONE


import java.util.*;

public class Find_Angles {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int degree = sc.nextInt();
        if (degree == 90) {
            System.out.println("COMPLEMENTARY");
        } else if (degree == 180) {
            System.out.println("SUPPLEMENTARY");
        } else if (degree == 360 || degree == 0) {
            System.out.println("COMPLETE");
        } else {
            System.out.println("NONE");
        }
        sc.close();
    }
}