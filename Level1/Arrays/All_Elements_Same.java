// Check if all elements in the array are the same

// For example:

// Input           Result 
// 5               YES
// 10 10 10 10 10  
// 3               NO
// 5 5 4 

import java.util.*;

public class All_Elements_Same {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int t = a[0], k = 0;
        for (int i = 1; i < n; i++) {
            if (t == a[i]) {
                continue;
            } else {
                k = 1;
                System.out.print("NO");
                break;
            }
        }
        if (k == 0) {
            System.out.print("YES");
        }
        sc.close();
    }
}