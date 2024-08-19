// A personal identification number(PIN)is a numeric or alphanumeric password or code used in the process of authenticating or identifying a user.The PIN numbers of the customers of FB Bank are encoded in an array.Your task is to decode the array and generate the six digit PIN number based on the following rules:

// 1. Find the cumulative sum of all the digits until you get a single digit.

// 2. Replace all the odd numbers with their respective alphabets in lowercase i.e.

// 1=a,2=b...9=i...

// Explanation:

// pinArray={1,22,123,4242,45,56}

// the cumulative sums are

// ={1,4,6,3,9,2}

// =146392

// After replacing all the odd numbers with alphabets

// Output=a46ci2

// For example:

// Input                       Result  
// 6                           ei68a6   
// 14 18 6 548 46 78         

// 6                           0a28ia
// 0 1 2 8 45 5896

import java.util.*;

public class PIN {
    public static void main(String hp[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int sum = 0, p = 0;
        for (int i = 0; i < n; i++) {
            p = a[i];
            while (p > 9) {
                sum = 0;
                while (p != 0) {
                    int r = p % 10;
                    sum += r;
                    p = p / 10;
                }
                p = sum;
            }
            a[i] = p;
            if (a[i] % 2 != 0) {
                int k = a[i] + 96;
                System.out.print((char) (k));
            } else {
                System.out.print(a[i]);
            }
        }
        sc.close();
    }
}
