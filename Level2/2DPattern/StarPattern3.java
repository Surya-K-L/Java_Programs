// Write a program to display the pattern given below.

// Sample Input:

// 5

// Sample Output:

//     * 
//    * * 
//   * * * 
//  * * * * 
// * * * * *

// For example:

// Input	Result
// 5          *
//           * *
//          * * *
//         * * * *
//        * * * * *

// 7          *
//           * *
//          * * *
//         * * * *
//        * * * * *
//       * * * * * *
//      * * * * * * *


     import java.util.*;
     public class StarPattern3{
         public static void main(String args[])
         {
             Scanner sc=new Scanner(System.in);
             int n=sc.nextInt();
             for(int i=0;i<n;i++)
             {
                 for(int j=n-1;j>i;j--)
                 {
                     System.out.print(" ");
                 }
                 for(int k=0;k<=i;k++)
                 {
                     System.out.print("* ");
                 }
                 System.out.println();
             }
             sc.close();
         }
     }
