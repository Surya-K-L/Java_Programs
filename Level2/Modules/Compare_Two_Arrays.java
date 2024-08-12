// Write a program to get 2 array of numbers and compare them. Both the arrays have the same number of elements

// Input:

// 5

// 1 2 3 4 5

// 1 2 3 4 5

// Output

// Yes

// Explanation:

// 5 elements in both the arrays

// All elements are the same in both arrays - so they are equal

// Input           Output

// 5               No            
// 1 2 3 4 5
// 2 1 3 4 5


// Explanation:
// Even though both arrays have same elements they are not in order

// For example:

// Input	           Result
// 3                   Yes
// 1 2 3
// 1 2 3

// 6                   Yes
// 1 3 5 7 9 10
// 1 3 5 7 9 10

// 5                   No
// -2 -4 -6 -8 -10
// -2 -4 -6 -8 10


import java.util.*;
public class Compare_Two_Arrays{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        int b[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            b[i]=sc.nextInt();
        }
        System.out.print(Arrays.equals(a,b)?"Yes":"No");
        sc.close();
    }
}