// Write a prohram to Check if the given number is between 17 and 33(both inclusive)For example:

// Input Result 
// 17    boundary 
// 22    YES 
// 50    NO

import java.util.*;
public class Boundary{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        if(num==17||num==33)
        {
            System.out.print("boundary");
        }
        else if(num>17 && num<33)
        {
            System.out.print("YES");
        }
        else
        {
            System.out.print("NO");
        }
        sc.close();
    }
}