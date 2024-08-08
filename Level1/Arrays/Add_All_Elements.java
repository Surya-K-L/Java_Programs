// Write a program to sum all the items in the list.

// Input Format:

// The first line of input N denotes the size of the list followed by N integers.

// For example:

// Input	        Result
// 4               64
// 10 12 20 22

// 4               2
// 3 4 -9 4



import java.util.*;
public class Add_All_Elements{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n],sum=0;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            sum+=a[i];
        }
        System.out.print(sum);
        sc.close();
    }
}
