// Write a program to remove the nth occurance of a string in another string



// For example:

// Input	                                       Result
// Hello What do you think? Hello here we come     Hello What do you think? here we come
// 2
// Hello

import java.util.*;
public class Remove_Nth_Occurance{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        int n=sc.nextInt(),count=0;
        String b=sc.next();
        String arr[]=a.split(" ");
        for(int i=0;i<arr.length;i++)
        {
            String z=arr[i];
            if(z.equals(b))
            {
                count++;
                if(count==n)
                {
                    continue;
                }
            }
            System.out.print(z+" ");
        }
        sc.close();
    }
}