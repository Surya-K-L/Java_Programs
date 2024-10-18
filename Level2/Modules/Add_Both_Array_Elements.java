// Write a program to get 2 array of numbers and add them. Both the arrays have the same number of elements

// Input:

// 5

// 1 2 3 4 5

// 10 20 30 40 50

// Output

// 11 22 33 44 55

// Explanation:

// 5 elements in both the arrays

// 1+10 = 11

// 2+20 = 22

// 3 + 30 = 33



import java.util.*;
public class Add_Both_Array_Elements{
    public static void main(String h[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        int b[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            b[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+b[i]+" ");
        }
    }
}
