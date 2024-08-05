// Read the 2 numbers in order and display in reverse order

// For example:

// Input Result 
// 3 4   Second is 4 and First is 3
import java.util.*;

public class Rev_Order_Two_Number {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        System.out.print("Second is " + m + " and First is " + n);
        sc.close();
    }
}