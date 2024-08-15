// There is an integer array with duplicate elements. Print the unique element which is not repeated. If more than one element is repeated it should the print least value.

// Input Format

// N - size of the array 'N' integer values

// Constraints

// No Constraints

// Output Format

// Single integer from the array which is the unique number


// For example:

// Input	               Result
// 9                       4
// 1 2 3 1 2 3 4 2 3

// 6                       No unique elements
// 1 1 2 2 3 3


import java.util.*;
public class Unique_Elements{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        ArrayList<Integer>al=new ArrayList<>();
        int c=0;
        Arrays.sort(a);
        for(int i=0;i<n;i++)
        {
            c=1;
            while(i<n-1 && a[i]==a[i+1])
            {
                c++;
                i++;
            }
            if(c==1)
            {
                al.add(a[i]);
            }
        }
        if(al.size()>0)
        {
            System.out.print(al.get(0));
        }
        else
        {
            System.out.print("No unique elements");
        }
        sc.close();
    }
}
