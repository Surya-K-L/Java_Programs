// You are given a string num, representing a large integer. Return the largest-valued odd integer (as a string) that is a non-empty substring of num, or "Odd Number doesn't exist" if no odd integer exists.

// A substring is a contiguous sequence of characters within a string.

// Example 1:

// Input: num = "52"

// Output: "5"

// Explanation: The only non-empty substrings are "5", "2", and "52". "5" is the only odd number.

// Example 2:

// Input: num = "4206"

// Output: "Odd Number doesn't exist"

// Explanation: There are no odd numbers in "4206".

// Example 3:

// Input: num = "35427"

// Output: "35427"

// Explanation: "35427" is already an odd number.

// You cannot change the order of the given numbers

// Constraints:

// 1 <= num.length <= 105

// num only consists of digits and does not contain any leading zeros.



import java.util.*;
public class Largest_Valued_Odd_Integer{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n%2==1)
        {
            System.out.print(n);
        }
        else
        {
            int max=0,s=0;
            String a=""+n;
            for(int i=0;i<a.length();i++)
            {
                for(int j=i+1;j<a.length();j++)
                {
                    String z=a.substring(i,j);
                    int t=Integer.parseInt(z);
                    if(t%2==1 && t>max)
                    {
                        s=1;
                        max=t;
                    }
                }
            }
            if(s==0)
            {
                System.out.print("Odd Number doesn't exist");
            }
            else
            {
                System.out.print(max);
            }
        }
        sc.close();
    }
}