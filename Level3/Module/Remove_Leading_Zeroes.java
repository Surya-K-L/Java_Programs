// Given a string of digits, remove leading zeros from it.

// Illustration: 

// Input  : 00000123569
// Output : 123569
// Input  : 000012356090
// Output : 12356090

// For example:

// Input	        Result
// 000001234       1234

// 00000012034     12034

import java.util.*;
public class Remove_Leading_Zeroes{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String a=sc.next();
        for(int i=0;i<a.length();i++)
        {
            if(a.charAt(i)=='0')
            {
               continue;
            }
            else
            {
                System.out.print(a.substring(i,a.length()));
                break;
            }
        }
        sc.close();
    }
}
