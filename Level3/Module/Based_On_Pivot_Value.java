// Partition the given array based on a pivot value.

// Given a pivot x, and a list lst, partition the list into three parts. The first part contains all elements in lst that are less than x. The second part contains all elements in lst that are equal to x. The third part contains all elements in lst that are larger than x Ordering within a part can be arbitrary. The algorithm should result in minimum swaps.

// For example, given x = 10 and lst = [9, 12, 3, 5, 14, 10, 10], one partition may be [9, 5, 3, 10, 10, 14, 12].

// NOTE: Overall sorting and printing will not be the right answer since it does not take minimum swaps.

// Input Format

// First line of the input is an integer N which is the number of elements in the input array arr[].

// Next N lines of input each contains an integer representing the elements arr[i].

// Last line of input is a single integer which corresponds to the pivot value.

// Output Format

// Single line consisting of N space separated integers.

// Constraints :

// 1 <= N <= 100

// 0 <= arr[i] <= 10000

// Sample Input 0

// 7
// 9
// 12
// 3
// 5
// 14
// 10
// 10
// 13
// Sample Output 0

// 12
// 10
// 10
// 9
// 5
// 3
// 14

// For example:

// Input
// 7
// 9
// 12
// 3
// 5
// 14
// 10
// 10
// 13

// Result: 
// 12
// 10
// 10
// 9
// 5
// 3
// 14

// Input
// 7 
// 9 
// 12 
// 3 
// 5 
// 14 
// 10 
// 10
// 10

// Result:
// 9 
// 5 
// 3 
// 10
// 10 
// 14 
// 12

import java.util.*;

public class Based_On_Pivot_Value {
    public static void main(String h[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        Arrays.sort(a);
        for (int i = n - 1; i >= 0; i--) {
            if (a[i] < k) {
                System.out.println(a[i]);
            }
        }
        for (int i = n - 1; i >= 0; i--) {
            if (a[i] == k) {
                System.out.println(a[i]);
            }
        }
        for (int i = n - 1; i >= 0; i--) {
            if (k < a[i]) {
                System.out.println(a[i]);
            }
        }
        sc.close();
    }
}