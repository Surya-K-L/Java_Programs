// Write the program to sum the first N elements in the array

// 5  <- Total number of elements in the array
// 11 20 30 40 50 <- Array elements
// 2 <- Number of elements to add (index 0 and index 1)

// Output:
// 31

// For example:

// Input	        Result
// 5               33
// 10 20 3 4 5
// 3

// 3               3
// 1 2 3
// 2



import java.util.*;
public class Sum_Of_First_N_Elements{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n],sum=0;
        for (int i = 0; i < n; i++) 
        {
            a[i] = sc.nextInt();
        }
        int k=sc.nextInt();
        for(int i=0;i<k;i++)
        {
            sum+=a[i];
        }
        System.out.print(sum);
        sc.close();
    }
}