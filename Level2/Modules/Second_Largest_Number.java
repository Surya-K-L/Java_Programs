// In a given set of numbers find the second largest number

// Input:

// 7
// 1 2 3 40 30 70 5

// Output:
// 40

// Input:
// 7
// 1 2 3 1 2 3 1

// Output:
// 2

// For example:

// Input	Result
// 7
// 1 2 3 4 4 2 3
// 3
// 5
// 10 20 30 40 50
// 40
// 8
// 10 20 80 70 30 40 50 60
// 70




import java.util.*;
public class Second_Largest_Number{
    public static void main(String h[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        Set<Integer> al=new TreeSet<>();
        for(int i=0;i<n;i++)
        {
            al.add(a[i]);
        }
        Integer[] arr=al.toArray(new Integer[al.size()]);
        int t=(arr.length);
        System.out.print(arr[t-2]);
        
    }
}
