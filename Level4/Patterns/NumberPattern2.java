// Develop the code to generate the depicted pattern below

// Sample Input


// 5
// Sample Output


// 5 5 5 5 5 5 5 5 5 
// 5 4 4 4 4 4 4 4 5 
// 5 4 3 3 3 3 3 4 5 
// 5 4 3 2 2 2 3 4 5 
// 5 4 3 2 1 2 3 4 5 
// 5 4 3 2 2 2 3 4 5 
// 5 4 3 3 3 3 3 4 5 
// 5 4 4 4 4 4 4 4 5 
// 5 5 5 5 5 5 5 5 5 

// For example:

// Input	
// 5

// 5 5 5 5 5 5 5 5 5 
// 5 4 4 4 4 4 4 4 5 
// 5 4 3 3 3 3 3 4 5 
// 5 4 3 2 2 2 3 4 5 
// 5 4 3 2 1 2 3 4 5 
// 5 4 3 2 2 2 3 4 5 
// 5 4 3 3 3 3 3 4 5 
// 5 4 4 4 4 4 4 4 5 
// 5 5 5 5 5 5 5 5 5


// 7

// 7 7 7 7 7 7 7 7 7 7 7 7 7 
// 7 6 6 6 6 6 6 6 6 6 6 6 7 
// 7 6 5 5 5 5 5 5 5 5 5 6 7 
// 7 6 5 4 4 4 4 4 4 4 5 6 7 
// 7 6 5 4 3 3 3 3 3 4 5 6 7 
// 7 6 5 4 3 2 2 2 3 4 5 6 7 
// 7 6 5 4 3 2 1 2 3 4 5 6 7 
// 7 6 5 4 3 2 2 2 3 4 5 6 7 
// 7 6 5 4 3 3 3 3 3 4 5 6 7 
// 7 6 5 4 4 4 4 4 4 4 5 6 7 
// 7 6 5 5 5 5 5 5 5 5 5 6 7 
// 7 6 6 6 6 6 6 6 6 6 6 6 7 
// 7 7 7 7 7 7 7 7 7 7 7 7 7 



import java.util.*;
public class NumberPattern2{
    public static void innerPattern(int n)
    {
        int size=2*n-1;
        int front=0;
        int back=size-1;
        int a[][]=new int[size][size];
        while(n!=0)
        {
            for(int i=front;i<=back;i++)
            {
                for(int j=front;j<=back;j++)
                {
                    if(i==front||i==back||j==front ||j==back)
                    {
                        a[i][j]=n;
                    }
                }
            }
            ++front;
            --back;
            --n;
        }
        print(a,size);
    }
    public static void print(int a[][],int size)
    {
        for(int i=0;i<size;i++)
        {
            for(int j=0;j<size;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String h[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        innerPattern(n);
        sc.close();
    }
}
