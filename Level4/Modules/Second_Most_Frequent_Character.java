// Given a string, find the second most frequent character in it.If it does not have any second most repeated character then return “No Second most frequent character”.

// Input Format

// A string.

// Constraints

// It should be a string.

// Output Format

// Second most frequent character.

// Sample Input 0

// aabababa
// Sample Output 0

// Second most frequent character is b

// For example:

// Input	           Result
// aabababacc          Second most frequent character is b

// aaaaa               No Second most frequent character




import java.util.*;
public class Second_Most_Frequent_Character{
    public static void main(String h[])
    {
        Scanner sc=new Scanner(System.in);
        String a=sc.next();
        char b[]=a.toCharArray();
        Arrays.sort(b);
        int max=0,c=0;
        char t='0';
        for(int i=0;i<b.length;i++)
        {
            c=1;
            while(i<b.length-1 && b[i]==b[i+1])
            {
                c++;
                i++;
            }
            if(c>max)
            {
                max=c;
                t=a.charAt(i-1);
            }
        }
        String z=a.replace(String.valueOf(t),"");
        char f[]=z.toCharArray();
        int s=0,maxx=1,o=0;
        char l='0';
        for(int i=0;i<f.length;i++)
        {
            s=1;
            while(i<f.length-1 && f[i]==f[i+1])
            {
                s++;
                i++;
            }
            if(s>maxx)
            {
                maxx=s;
                l=z.charAt(i-1);
                o=1;
            }
        }
        if(o==1)
        System.out.print("Second most frequent character is "+l);
        else
        System.out.print("No Second most frequent character");
        sc.close();
    }
}