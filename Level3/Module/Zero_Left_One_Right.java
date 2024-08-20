// You are given an array of 0s and 1s in random order. Segregate 0s on left side and 1s on right side of the array. Traverse array only once.

// Input Format

// N - size of the array 'N' integers(0 or 1)

// Constraints

// First line- N, array length Next N inputs- array elements(only 0's and 1's)

// Output Format

// Input array in left-right arrangement

// Sample Input 0

// 5
// 0 1 2 0 1
// Sample Output 0

// Invalid Input



import java.util.*;
public class Zero_Left_One_Right{
    public static void main(String h[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),c=0,f=0;
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
            if(a[i]==0||a[i]==1)
            {
                c++;
            }
            else
            {
                f=1;
            }
        }
        if(f==1)
        {
            System.out.print("Invalid Input");
        }
        else
        {
            Arrays.sort(a);
            for(int i=0;i<n;i++)
            {
                System.out.print(a[i]+" ");
            }
        }
        sc.close();
    }
}