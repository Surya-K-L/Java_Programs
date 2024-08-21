// You are given a string S of alphabet characters and the task is to find its matching decimal representation as on a mobile phones numeric keypad. Output the decimal representation corresponding to the string. For ex: if you are given “amazon” then its corresponding decimal representation will be 262966.
// Input:
// The first line of input contains an integer T denoting the number of test cases. Each test case consists of a single line containing a string.

// Output:
// For each test case, print in a new line, the corresponding decimal representation of the given string.
// Constraints:
// 1 <= T <= 100
// 1 <= length of String <= 100
// Sample Input 1
// 2
// ram
// sita
// Sample Output 1
// 726
// 7482
// Sample Input 2
// 2
// king
// queen
// Sample Output 2
// 5464
// 78336


// For example:

// Input	Result
// 2       726
// ram     7482
// sita 

// 2       5464
// king    78336
// queen


import java.util.*;
public class Decimal_Representation_Of_Mobile_Phone{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String arr[]={"","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        while(n-->0)
        {
            String a=sc.next(),ans="";
            for(int i=0;i<a.length();i++)
            {
                String p=""+a.charAt(i);
                for(int j=0;j<arr.length;j++)
                {
                    if(arr[j].contains(p))
                    {
                        ans=ans+""+(j+1);
                    }
                }
            }
            System.out.println(ans);
        }
        sc.close();
    }
}