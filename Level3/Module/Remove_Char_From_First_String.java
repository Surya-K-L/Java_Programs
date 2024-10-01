// Given two strings s1 and s2, remove those characters from first string which are present in second string. Both the strings are different.

// Input Format The first line of input contains an integer T denoting the number of test cases.

// The first line of each test case is s1 is first string.

// The second line of each test case contains s2 is second string.

// Input Format

// 2 itvaccodingteam caw removeccharaterfrom string

// Output Format

// itvodingtem

// Sample Input 0

// 2
// itvaccodingteam
// caw
// removeccharaterfrom
// string
// Sample Output 0

// itvodingtem
// emovecchaaefom




  import java.util.*;
public class Remove_Char_From_First_String{
    public static void main(String h[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),c=0;
        sc.nextLine();
        for(int k=0;k<n;k++)
        {
            String a=sc.nextLine();
            String b=sc.nextLine();
            for(int i=0;i<a.length();i++)
            {
                c=0;
                for(int j=0;j<b.length();j++)
                {
                    if(a.charAt(i)==b.charAt(j))
                    {
                        c=1;
                        break;
                    }
                    else
                    {
                        continue;
                    }
                }
                if(c!=1)
                System.out.print(a.charAt(i));
            }
        }
    }
}
