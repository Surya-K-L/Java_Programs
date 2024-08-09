// Count the number of times a particular character occurs ignoring case

// For example:

// Input	    Result
// Trait       2
// t

// pluSS       2
// s

// Braillie    0
// k



import java.util.*;
public class Count_Particular_Times{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine().toLowerCase();
        char c=Character.toLowerCase(sc.next().charAt(0));
        int count=0;
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)==c)
            {
                count++;
            }
        }
        System.out.print(count);
        sc.close();
    }
}