// Convert the array into zig-zag order. The converted array should be formatted in this

// pattern a < b > c < d > e < f

// First the number of elements in the array N is provided followed by each of the numbers.

// Input Format

// First line is N, size of array. 1<=N<=100

// Constraints

// 1<=N<=100

// Output Format

// An array with zigzag pattern

// Example
// Input

// 5

// 31

// 32

// 33

// 34

// 35

// output

// [31, 33, 32, 35, 34]



import java.util.*;
public class Zig_Zag_Order{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int b[]=new int[n];
        for(int i=0;i<n;i=i+2)
        {
            if(i==0)
            {
                b[i]=a[i];
            }
            else
            {
                b[i]=a[i-1];
                b[i-1]=a[i];
            }
        }
        System.out.print(Arrays.toString(b));
        sc.close();
    }
}