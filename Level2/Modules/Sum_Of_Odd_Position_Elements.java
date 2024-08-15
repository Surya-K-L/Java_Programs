// Write a program to find the sum of elements (only odd positions) in an array.

// Input Format
// Input consists of n+1 integers. The first integer corresponds to ‘n’ , the size of the array. The next ‘n’ integers correspond to the elements in the array. Assume that the maximum value of n is 15.

// Output Format
// Sum of Odd position Elements

// Input        Output 
// 5            The sum of the odd position in the array is 12
// 1
// 2
// 8
// 9
// 3

// 4            The sum of the odd position in the array is 11
// 3
// 6
// 8
// 9




import java.util.*;
public class Sum_Of_Odd_Position_Elements{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),sum=0;
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
            if(i%2==0)
            {
                sum+=a[i];
            }
        }
        System.out.print("The sum of the odd position in the array is "+sum);
        sc.close();
    }
}