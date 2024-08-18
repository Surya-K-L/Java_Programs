// Write a program to extract the seconds in a given sentence

// For example:

// Input	                                        Result
// Today the time is 09:11:33: Check it out        33

// This is great time 09:33:17: Check it out       17


import java.util.*;
public class Extract_Seconds{
    public static void main(String h[])
    {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        String b[]=a.split(" ");
        for(int i=0;i<b.length;i++)
        {
            String c=b[i];
            if(c.contains(":"))
            {
                String d[]=c.split(":");
                System.out.print(d[2]);
                break;
            }
        }
        sc.close();
    }
}

