// Program to print  the following pattern for given N value

//     1 
//    1 1 
//   1 2 1 
//  1 3 3 1 
// 1 4 6 4 1
// Input
// 5

// output   
// ** Printing the pattern... **
//     1 
//    1 1 
//   1 2 1 
//  1 3 3 1 
// 1 4 6 4 1


// For example:

// Input	
// 4
// ** Printing the pattern... **
//    1 
//   1 1 
//  1 2 1 
// 1 3 3 1 

// 3
// ** Printing the pattern... **
//   1 
//  1 1 
// 1 2 1 
 

import java.util.*;
public class NumberPattern1{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("** Printing the pattern... **");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n-i-1;j++)
            {
                System.out.print(" ");
            }
            int num=1;
            for(int j=0;j<=i;j++)
            {
                System.out.print(num+" ");
                num=num*(i-j)/(j+1);
            }
            System.out.println();
        }
        sc.close();
    }
}
