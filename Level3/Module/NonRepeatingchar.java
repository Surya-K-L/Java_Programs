// Given a string s, find the first non-repeating character in it and return its position. If it does not exist, return -1.

 

// Example 1:

// Input: s = "itvac"
// Output: 1
// Example 2:

// Input: s = "lovecodinglife"
// Output: 3
// Example 3:

// Input: s = "aabb"
// Output: -1


// For example:

// Input	Result
// itvac 1







import java.util.*;
public class NonRepeatingchar{
    public static void main(String h[])
    {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        int t=0,c=0,f=0;
        int d[]=new int[a.length()];
        for(int i=0;i<a.length();i++)
        {
            c=0;
           for(int j=0;j<a.length();j++)
           {
               if(a.charAt(i)==a.charAt(j))
               {
                   c++;
                   d[i]=c;
               }
           }
           if(c<=1)
           {
               System.out.print(i+1);
               break;
           }
        }
        for(int i=0;i<a.length();i++)
        {
            if(d[i]>1)
            {
                f++;
            }
        }
        if(f==a.length())
        {
            System.out.print(-1);
        }
    }
}
           
