// Given an integer,say N.You need to find the following:

// 1.The number of bits (bits that are 1 in the bitwise representation) in N.

// 2.The position of the least significant set bit.

// 3.The position of the most significant set bit.

// The output should be a string of the form:a#b#c,where a,b,c are answers for the above three queries respectively.

// Example 1:

// Input : 10

// Output: 2#1#3

// Explanation:

// The Bitwise Representation of 10 is 1010(indexing is 3,2,1,0)

// Total count of set bit (i.e. 1) is 2.So a=2

// the position of least significant set bit is 1,so b=1

// the position of most significant set bit is 3,so c=3

// The output is returned in the form a#b#c, hence the output is 2#1#3.

// Example 2:

// Input : 1

// Output: 1#0#0

// Explanation:

// The Bitwise Representation of 1 is 1(indexing is 0)

// Total count of set bit (i.e. 1) is 1.So a=1

// the position of least significant set bit is 0,so b=0

// the position of most significant set bit is 0,so c=0

// The output is returned in the form a#b#c, hence the output is 1#0#0.

// Input Format
// Input1: N,denoting an Integer

// Output Format
// Return string of the form: a#b#c,where a,b,c are the total number of set bit (i.e. 1),least significant position of set bit,and most significant position of set bit in bitwise representation of N.

// Sample Input
// 10
// Sample Output
// 2#1#3

// For example:

// Input   Result
// 9       2#0#3


import java.util.*;
public class Bitwise_Representation_With_Hash{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String m=Integer.toBinaryString(n);
        char arr[]=m.toCharArray();
        int l=m.length();
        int count=0,mb=0,lb=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]=='1')
            {
                count++;
            }
        }
        for(int i=l-1;i>=0;i--)
        {
            if(arr[i]=='1')
            {
                mb=i;
                break;
            }
        }
        for(int i=0;i<=l;i++)
        {
            if(arr[i]=='1')
            {
                lb=i;
                break;
            }
        }
        System.out.print(count+"#"+lb+"#"+mb);
        sc.close();
    }
}
