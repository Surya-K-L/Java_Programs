// Basically number of hours * 3600 + number of minutes * 60 + number of seconds
// For example:

// Input	  Result
// 10:9:8  36548

// 1:1:1   3661

import java.util.*;
public class Hour_Min_Sec{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String arr[]=str.split(":");
        int hr=Integer.parseInt(arr[0])*3600;
        int min=Integer.parseInt(arr[1])*60;
        int sec=Integer.parseInt(arr[2]);
        int sum=hr+min+sec;
        System.out.print(sum);
            
    }
}
