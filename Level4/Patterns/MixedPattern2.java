// Print the given pattern for 'N' number of rows,
// For Example,
// Number of rows =4

// X X X X 

// X 0 0 X 

// X 0 0 X 

// X X X X 

// For example:

// Input	
// 3

// X X X 
// X 0 X 
// X X X 

// 4

// X X X X 
// X 0 0 X 
// X 0 0 X 
// X X X X 

import java.util.*;
public class MixedPattern2{
    public static void main(String h[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i==0 || i==n-1 ||j==0 ||j==n-1)
                {
                    System.out.print("X ");
                }
                else
                {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
