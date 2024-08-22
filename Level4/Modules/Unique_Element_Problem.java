// Unique element problems

// You are given an array Array of size N.

// Perform the following operations to delete the array so that you can maximize the value of a unique array element:

// For any turn i(1≤ i≤ N),delete either of the end elements.

// Before deleting the array element at index K, it contributes the value arr[K]*turni+SVi to the unique value where turni is the number of the turn in which you are performing the operation

// SVi is a sustaining value that is the value of the maximum element present in the array before the ithturn is made

// Write a program to print the maximum unique value that can be obtained after the array ids completely deleted

// INPUT FORMAT:

// The first line:T denoting the number of test cases, followed by size of array and elements of array

// Constraints:

// 1 ≤ T ≤ 10

// 1≤ N ≤ 103

// 1 ≤Arri≤ 106

// Explanation:

// INPUT:

// 1

// 5

// 5 4 3 6 2

// OUTPUT:

// 96

// The order we follow to detroy the given array is:

// 2*1+6=8

// 5*2+6=16

// 4*3+6=18

// 3*4+6=18

// 6*5+6=36

// Now 8+16+18+18+36=96


// For example:

// Input	        Result
// 1               96
// 5
// 5 4 3 6 2


import java.util.*;
public class Unique_Element_Problem{
    public static void main(String h[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t!=0)
        {
            int n=sc.nextInt();
            ArrayList<Integer> arr=new ArrayList<>();
            ArrayList<Integer> res=new ArrayList<>();
            int sum=0;
            for(int i=0;i<n;i++)
            {
                arr.add(sc.nextInt());
            }
            int max=Collections.max(arr);
            for(int i=1;i<=n;i++)
            {
                if(i==1)
                {
                    res.add(arr.get(n-1)*i+max);
                }
                else
                {
                    res.add((arr.get(i-2)*i)+max);
                }
            }
            for(int i=0;i<n;i++)
            {
                sum=sum+res.get(i);
            }
            System.out.println(sum);
            t--;
        }
        sc.close();
    }
}