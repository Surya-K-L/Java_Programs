// Given a number N. Find the last two digits of the Nth fibonacci number.
// Note: If the last two digits are 02, return 2.

// Example 1:

// Input:
// N = 13
// Output:
// 33
// Explanation:
// The 13th Fibonacci number is 233.
// So last two digits are 3 and 3.

// For example:

// Input	Result
// 13      33
// 12      44
// 6       08



import java.util.*;
public class Last_Two_Digit_Of_Fibonacci{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n+1];
        arr[0]=0;
        arr[1]=1;
        for(int i=2;i<=n;i++)
        {
            arr[i]=arr[i-1]+arr[i-2];
        }
        int t=arr[n]%100;
        int len=(int)Math.log10(t)+1;
        if(len==1)
        {
            System.out.print("0"+t);
        }
        else
        {
            System.out.print(t);
        }
        sc.close();
    }
}
