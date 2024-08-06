// Print the given square pattern

// For example:

// Input	Result
// 2       A B
//         A B 

// 3       A B C 
//         A B C 
//         A B C 



import java.util.*;
public class AlphabetPattern1{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print((char)(j+65)+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
