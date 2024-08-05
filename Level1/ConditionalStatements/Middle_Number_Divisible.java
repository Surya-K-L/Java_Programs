// Check if the middle number of a given 3 digit number is divisible by 5

// Note: Consider the count of digits in the number be odd.

// For example:

// Input	Result
// 353     Yes
// 372     No



import java.util.*;
public class Middle_Number_Divisible{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        n=n/10;
        int mid=n%10;
        if(mid%5==0)
        {
            System.out.print("Yes");
        }
        else
        {
            System.out.print("No");
        }
        sc.close();
    }
}