// Print the elements in the array in the reverse order.


// Input Format
// Input consists of n+1 integers. The first integer corresponds to ‘n’ , the size of the array. The next ‘n’ integers correspond to the elements in the array

// Output Format
// Refer sample output for details.

// Sample Input 1
// 5
// 9
// 3
// 5
// 4
// 3
// Sample Output 1
// 3
// 4
// 5
// 3
// 9


import java.util.*;
public class Array_Reverse{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=n-1;i>=0;i--)
        {
            System.out.println(arr[i]);
        }
        sc.close();
    }
}