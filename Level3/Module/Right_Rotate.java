// Write a program to right rotate the elements of an array. (i.e) Rotate the elements of array towrads its right by the spcified number of times.

// For example:

// Input	                Result
// 5                        14 15 16 12 13
// 12 13 14 15 16
// 3
 

// 7                        15 16 87 54 69 47 52 
// 87 54 69 47 52 15 16
// 9


import java.util.*;
public class Right_Rotate{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList <Integer>al=new ArrayList<Integer>();
        for(int i=0;i<n;i++)
        {
            al.add(sc.nextInt());
        }
        int k=sc.nextInt();
            Collections.rotate(al,k);
            for(int s:al)
            {
                System.out.print(s+" ");
            }
            sc.close();
    }
}