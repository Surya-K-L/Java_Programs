// Given an integer array data representing the data, return whether it is a valid UTF-8 encoding.

// A character in UTF8 can be from 1 to 4 bytes long, subjected to the following rules:

// For a 1-byte character, the first bit is a 0, followed by its Unicode code.
// For an n-bytes character, the first n bits are all ones, the n + 1 bit is 0, followed by n - 1 bytes with the most significant 2 bits being 10.
// This is how the UTF-8 encoding would work:

//    Char. number range  |        UTF-8 octet sequence
//       (hexadecimal)    |              (binary)
//    --------------------+---------------------------------------------
//    0000 0000-0000 007F | 0xxxxxxx
//    0000 0080-0000 07FF | 110xxxxx 10xxxxxx
//    0000 0800-0000 FFFF | 1110xxxx 10xxxxxx 10xxxxxx
//    0001 0000-0010 FFFF | 11110xxx 10xxxxxx 10xxxxxx 10xxxxxx
// Note: The input is an array of integers. Only the least significant 8 bits of each integer is used to store the data. This means each integer represents only 1 byte of data.

// Input: data = [197,130,1]
// Output: true
// Explanation: data represents the octet sequence: 11000101 10000010 00000001.
// It is a valid utf-8 encoding for a 2-bytes character followed by a 1-byte character.

// Input: data = [235,140,4]
// Output: false
// Explanation: data represented the octet sequence: 11101011 10001100 00000100.
// The first 3 bits are all ones and the 4th bit is 0 means it is a 3-bytes character.
// The next byte is a continuation byte which starts with 10 and thats correct.
// But the second continuation byte does not start with 10, so it is invalid.


// For example:

// Input	        Result
// [197,130,1]     true
// [235,140,4]     false



import java.util.*;
public class Valid_UTF8_Encoding{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        String b=a.substring(1,a.length()-1);
        String c[]=b.split(",");
        int d[]=new int[c.length];
        for(int i=0;i<c.length;i++)
        {
            d[i]=Integer.parseInt(c[i]);
        }
        String e[]=new String[d.length];
        for(int i=0;i<d.length;i++)
        {
            e[i]=Integer.toBinaryString(d[i]);
        }
        String f=e[0];
        int t=0;
        for(int i=0;i<f.length();i++)
        {
            if(f.charAt(i)=='1')
            {
                t++;
            }
            else
            {
                break;
            }
        }
        int z=0,s=0;
        for(int i=1;i<e.length;i++)
        {
            String g=e[i];
            for(int j=0;j<g.length();j++)
            {
                if(g.charAt(0)=='1')
                {
                    z=1;
                }
                else
                {
                    break;
                }
            }
            if(z==1)
            {
                s++;
            }
        }
        System.out.print(s==t-1?"false":"true");
        sc.close();
    }
}