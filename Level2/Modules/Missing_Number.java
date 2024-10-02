// Find the Missing Number       

// You are given a list of n-1 integers and these integers are in the range of 1 to n. There are no duplicates in list. One of the integers is missing in the list. Write an efficient code to find the missing integer. If no number is missing print -1.

// Input Format
// N - size of the array

// 'N' integer values

// Output Format
// Single integer which is missing in the array

// Sample Input 1
// 7
// 1 2 4 6 3 7 8
// Sample Output 1
// 5
// Sample Input 2
// 7
// 7 6 5 4 3 2 1
// Sample Output 2
// -1



import java.util.*;
public class Missing_Number{
    public static void main(String h[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),c=0;
        int a[]=new int[n+1];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        Arrays.sort(a);
        for(int i=0;i<n;i++)
        {
            if(i<n-1 && a[i+1]-a[i]!=1)
            {
                int t=a[i]+1;
                System.out.print(t+" ");
            }
            else
            c++;
        }
        if(c==n)
        {
            System.out.print("-1");
        }
    }
}
