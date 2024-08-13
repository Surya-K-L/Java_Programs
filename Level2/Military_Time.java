// Given a time in 12-hour AM/PM format, convert it to military (24-hour) time.

// Note: Midnight is 12:00:00 AM on a 12-hour clock, and 00:00:00 on a 24-hour clock. Noon is 12:00:00 PM on a 12-hour clock, and 12:00:00 on a 24-hour clock.

// Input Format
// Enter hours: 12
// Enter minutes: 36
// Enter seconds: 4
// Enter string am or pm: pm

// Output Format
// 12:36:04
// Sample Input 1
// 10
// 55
// 16
// pm
// Sample Output 1
// 22:55:16

// For example:

// Input	Result
// 10      22:55:16
// 55
// 16
// pm

import java.util.*;
public class Military_Time{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int h=sc.nextInt(),m=sc.nextInt(),s=sc.nextInt();
        sc.nextLine();
        String ti=sc.next();
        if(ti.equals("pm") && h<12)
        {
           System.out.printf("%02d:%02d:%02d",(h+12),m,s);
        }
        else
        {
           System.out.printf("%02d:%02d:%02d",(h),m,s);
        }
        sc.close();
    }
}