// Write a program which displays the below pattern for a given value of n

// For example:

// Input	
// 4
//       J 
//     I H 
//   G F E 
// D C B A 

// 3
//     F 
//   E D 
// C B A 



import java.util.*;
public class AlphabetPattern1{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int t=(n*(n+1))/2;
        t=t-1;
        for(int i=0;i<n;i++)
        {
            for(int j=n-1;j>i;j--)
            {
                System.out.print("  ");
            }
            for(int k=0;k<=i;k++)
            {
                System.out.print((char)(t+65)+" ");
                t--;
            }
            System.out.println();
        }
        sc.close();
    }
}