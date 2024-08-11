// Print the given 2D Pattern

// 1 
// 1 2 
// 1 2 3 
// 1 2 3
// 1 2 
// 1 

// For example:

// Input   Result
// 3       1
//         1 2 
//         1 2 3 
//         1 2 3 
//         1 2 
//         1 

// 4       1 
//         1 2 
//         1 2 3
//         1 2 3 4 
//         1 2 3 4  
//         1 2 3 
//         1 2 
//         1


import java.util.*;
public class NumberPattern1{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print((j+1)+" ");
            }
            System.out.println();
        }
        for(int i=n;i>=0;i--)
        {
            for(int j=0;j<i;j++)
            {
                System.out.print((j+1)+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
