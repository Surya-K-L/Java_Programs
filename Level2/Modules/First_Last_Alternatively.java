// For a given set of numbers print alternatively one element from the first and one element from the last

// For this question, you need to have an array - it is not possible just with loops

// For example:

// Input	                Result
// 6                     1 6 2 5 3 4
// 1 2 3 4 5 6

// 6                     10 60 20 50 30 40
// 10 20 30 40 50 60  




import java.util.*;
public class First_Last_Alternatively{
    public static void main(String h[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),c=0;
        int a[]=new int[n+1];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int t=n-1;
        for(int i=0;i<n/2;i++)
        {
            System.out.print(a[i]+" "+a[t--]+" ");
        }
    }
}
