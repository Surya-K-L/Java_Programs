// Return the index of the first occurence of a character in a string

// For example:

// Input	        Result
// srishakthi    2
// i

// GoodBoy       1
// o

// Thisisit      -1
// w


import java.util.*;
public class Index_Of_First_Occ_Of_Char_In_String{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        char s=sc.next().charAt(0);
        int c=0;
        for(int i=0;i<str.length();i++)
        {
            if(s==str.charAt(i))
            {
                System.out.print(i);
                c=1;
                break;
            }
        }
        if(c==0)
        {
            System.out.print(-1);
        }
    }
}
