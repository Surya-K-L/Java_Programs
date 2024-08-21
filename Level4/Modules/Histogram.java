// Given an array of integers heights representing the histograms bar height where the width of each bar is 1, return the area of the largest rectangle in the histogram.
 
// Example 1:

// Input: heights = [2,1,5,6,2,3]
// Output: 10
// Explanation: The above is a histogram where width of each bar is 1.
// The largest rectangle is shown in the red area, which has an area = 10 units.
// Example 2:

// Input: heights = [2,4]
// Output: 4
 

// Constraints:

// 1 <= heights.length <= 105
// 0 <= heights[i] <= 104

// For example:

// Input	            Result
// [2,1,5,6,2,3]       10

// [2,4]               4



import java.util.*;
public class Histogram{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        a=a.substring(1,a.length()-1);
        String b[]=a.split(",");
        int arr[]=new int[b.length];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=Integer.parseInt(b[i]);
        }
        Stack<Integer>al=new Stack<>();
        int area=0;
        for(int i=0;i<=arr.length;i++)
        {
            while(!al.isEmpty() && (i==arr.length || arr[i]<arr[al.peek()]))
            {
                int height=arr[al.pop()];
                int width=al.isEmpty()?i:i-al.peek()-1;
                area=Math.max(area,height*width);
            }
            al.push(i);
        }
        System.out.print(area);
        sc.close();
    }
}