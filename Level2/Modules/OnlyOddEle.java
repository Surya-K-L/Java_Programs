// Write a program to print the odd numbers in a given array

// Input Format
// The first line in the input contains a number of array elements N

// The next lines N contains elements of the array

// Sample Input 1
// 5
// 1
// 3
// 7
// 5
// 4
// Sample Output 1
// Odd items of the array: 1 3 7 5

// Sample Input 2
// 5
// 2
// 4
// 6
// 8
// 10
// Sample Output 2
// No Odd Elements
// For example:

// Input	Result
// 5
// 1
// 3
// 7
// 5
// 4
// Odd items of the array: 1 3 7 5 
// 3
// -1
// -2
// -3
// Odd items of the array: -1 -3 
// 5
// 2
// 4
// 6
// 8
// 10
// No Odd Elements





import java.util.*;
public class OnlyOddEle{
    public static void main(String h[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),c=0;
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            if(a[i]%2==0)
            {
                c++;
            }
        }
        if(c==n)
        {
            System.out.println("No Odd Elements");
        }
        else
        {
            System.out.print("Odd items of the array: ");
            for(int i=0;i<n;i++)
            {
                if(a[i]%2==1 || a[i]%2==-1)
                {
                    System.out.print(a[i]+" ");
                }
            }
        }
    }
}
        
