// Create a stack S1 of type Integer and perform the following operations on it.

// Read the size and values from user and add it in stack
// Remove the top most value and display the stack.
// Determine the number of elements present in stack.

// For example:

// Input	            Result
// 8                   After removing Top Most value 5 7 9 4 6 3 1
// 5 7 9 4 6 3 1 2     The size of stack is 7


import java.util.*;
public class Stack_Perform_Operations{
    public static void main(String h[])
    {
        Scanner sc=new Scanner(System.in);
        Stack<Integer> s=new Stack<Integer>();
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            s.push(sc.nextInt());
        }
        System.out.print("After removing Top Most value ");
        s.pop();
        Iterator itr=s.iterator();
        while(itr.hasNext())
        {
            System.out.print(itr.next()+" ");
        }
        System.out.println("");
        System.out.println("The size of stack is "+s.size());
        sc.close();
    }
}
