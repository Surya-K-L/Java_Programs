// Check if a given number is a binary number or not.

// NOTE:A binary number has only 0 and 1.

// Input:

// 101

// Output:

// Yes

// Input:

// 203

// Output:

// No

// For example:

// Input   Result 
// 103     No
// 110     Yes
// 1014    No
// 1634    No

import java.util.*;
public class Binary_Or_Not {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), p = 0;
        String bin = Integer.toString(n);
        if (BinaryOrNot(bin)) {
            System.out.print("Yes");
        } else {
            System.out.print("No");
        }
        sc.close();
    }

    public static boolean BinaryOrNot(String bin) {
        for (int i = 0; i < bin.length(); i++) {
            if (bin.charAt(i) == '0' || bin.charAt(i) == '1') {
                continue;
            } else {
                return false;
            }
        }
        return true;
    }
}