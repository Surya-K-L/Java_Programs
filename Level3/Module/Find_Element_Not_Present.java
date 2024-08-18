//   Rearrange an array such that arr[i] = i  

//   Given an array of elements of length N, ranging from 1 to N, all elements may not be present in the array. If element is not present then there will be -1 present in the array. Rearrange the array such that A[i] = i and if i is not present, display -1 at that place. Index starts from 0

// Refer to sample input and output for more clarity

// Input Format
// N - size of the array

// 'N' integer values

// Output Format
// Input array in proper arrangement

// Sample Input
// 6
// 6 1 9 3 2 4
// Sample Output
// -1 1 2 3 4 -1 6 -1 -1 9 

// For example:

// Input	
// 6
// 0 2 4 6 8 10
// 0 -1 2 -1 4 -1 6 -1 8 -1 10

// 5
// 0 1 2 3 4
// 0 1 2 3 4 



import java.util.*;
public class Find_Element_Not_Present{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n],max=0;
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
            if(max<a[i])
            {
                max=a[i];
            }
        }
        ArrayList<Integer>ele=new ArrayList<>();
        for(int i=0;i<=max;i++)
        {
            ele.add(i);
        }
        int p=0;
        for(int i=0;i<=max;i++)
        {
            p=0;
            for(int j=0;j<n;j++)
            {
                if(a[j]==ele.get(i))
                {
                    p=1;
                    System.out.print(a[j]+" ");
                    break;
                }
            }
            if(p==0)
                System.out.print(-1+" ");
        }
        sc.close();
        
    }
}