// Write a program to capitalize the alternate words in a sentence.

// Input:

// Better late than never

// Output:

// BETTER late THAN never

// Input:

// The early bird catches the worm

// Output:

// THE early BIRD catches THE worm


// For example:

// Input	                    Result
// India is a great country    INDIA is A great COUNTRY

// Believe in the Best         Believe in the Best

import java.util.*;
public class Alternate_Strings_Capitalize{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String a[]=sc.nextLine().split(" ");
        for(int i=0;i<a.length;i++)
        {
            if(i%2==0)
                System.out.print(a[i].toUpperCase()+" ");
            else
                System.out.print(a[i]+" ");
        }
        sc.close();
    }
}
