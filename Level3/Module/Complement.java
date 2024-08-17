// Given a Binary Number as a string, print its 1’s and 2’s complements.

// 1’s complement of a binary number is another binary number obtained by toggling all bits in it, i.e., transforming the 0 bit to 1 and the 1 bit to 0.

// Examples:

// 1's complement of "0111" is "1000"

// 1's complement of "1100" is "0011" 

// 2’s complement of a binary number is 1 added to the 1’s complement of the binary number.

// Examples:

// 2's complement of "0111" is "1001"

// 2's complement of "1100" is "0100" 


// For example:

// Input	            Result
// 1100                1's complement: 0011
//                     2's complement: 0100

// 1
//                     1's complement: 0
//                     2's complement: 1


import java.util.*;
public class Complement{
    public static void main(String h[])
    {
        Scanner sc=new Scanner(System.in);
        String a=sc.next();
        char b[]=a.toCharArray();
        int l=a.length();
        for(int i=0;i<l;i++)
        {
            if(b[i]=='0')
            {
                b[i]='1';
            }
            else if(b[i]=='1')
            {
                b[i]='0';
            }
        }
        System.out.print("1's complement: ");
        for(int i=0;i<l;i++)
            System.out.print(b[i]);
        System.out.println();
        int p=1;
        for(int i=l-1;i>=0;i--)
        {
            String e=""+b[i];
            int r=Integer.parseInt(e)+p;
            if(r==1)
            {
                b[i]='1';
                p=0;
            }
            else if(r==2)
            {
                b[i]='0';
                p=1;
            }
        }
        System.out.print("2's complement: ");
        for(int i=0;i<l;i++)
        {
            System.out.print(b[i]);
        }
        sc.close();
    }
}
