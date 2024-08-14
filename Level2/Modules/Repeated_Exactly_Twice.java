// Given an array of n words. Some words are repeated twice (exactly twice and not more than that), we need count such words.

// Input Format

// 2

// 10

// hate love peace love peace hate love peace love peace

// 8 

// Tom Jerry Thomas Tom Jerry Courage Tom Courage

// Constraints

// 1<=T<=105

// 1<=no of words<=105

// 1<=length of each word<=105

// Output Format

// 1

// 2

import java.util.*;
public class Repeated_Exactly_Twice{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        while(k-->0)
        {
            int n=sc.nextInt(),c=0,count=0;
            sc.nextLine();
            String a=sc.nextLine();
            String b[]=a.split(" ");
            Arrays.sort(b);
            for(int i=0;i<b.length;i++)
            {
                c=1;
                while(i<b.length-1 && b[i].equals(b[i+1]))
                {
                    i++;
                    c++;
                }
                if(c==2)
                {
                    count++;
                }
            }
            System.out.println(count);
        }
        sc.close();
    }
}