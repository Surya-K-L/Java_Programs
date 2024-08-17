// Given an integer array nums sorted in non-decreasing order,remove the duplicates in-place such that each unique element appears only once.The relative order of the elements should be kept the same.

// Do not allocate extra space for another array.You must do this by modifying the input array in-place with O(1)extra memory.

// Example 1:

// Input:1,1,2 
// Output:1,2 

// Example 2:
// Input:0,0,1,1,1,2,2,3,3,4 
// Output:0,1,2,3,4 

//Constraints: 0<=nums length<=3*104-100<=nums[i]<=100 nums is sorted in non-decreasing order

import java.util.*;
public class Each_Element_Appear_Once {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        TreeSet<Integer>unique=new TreeSet<>();
        for(int i=0;i<n;i++)
        {
            unique.add(sc.nextInt());
        }
        ArrayList<Integer>al=new ArrayList<>();
        for(int z:unique)
        {
            al.add(z);
        }
        for(int i=0;i<al.size();i++)
        {
            if(i<al.size()-1)
            {
                System.out.print(al.get(i)+",");
            }
            else
            {
                System.out.print(al.get(i));
            }
        }
        sc.close();
    }
}