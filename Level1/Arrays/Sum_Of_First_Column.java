// Display the sum of the first column in a 2D Matrix

// For example:

// Input   Result 
// 2 2     12
// 5 6 
// 7 8

// 2 2     40
// 40 10 
// 20 30 

import java.util.*;

public class Sum_Of_First_Column {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        int a[][] = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        int ans = 0;
        for (int i = 0; i < n; i++) {
            ans += a[i][0];
        }
        System.out.print(ans);
        sc.close();
    }
}