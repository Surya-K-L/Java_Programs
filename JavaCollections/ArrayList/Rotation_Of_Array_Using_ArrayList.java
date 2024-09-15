// Krish has recently heard about something called Array Rotation and wants you to write a code for rotating an array. So what happens in array rotation is, you are given an integer array A of size N and an integer K, you have to rotate the array in the right direction by K steps. The task is to print the rotated array.

// Input Format

// The first line contains N, number of elements in the array and K number of steps.

// The Second line contains N space-separated integers.

// Output Format

// For each test case on a new line, print the rotated array.

// Sample Input:

// 5 2

// 1 2 3 4 5

// Sample Output:

// 4 5 1 2 3


import java.util.*;
public class Rotation_Of_Array_Using_ArrayList{
    public static void main(String h[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        ArrayList<Integer>al=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            al.add(sc.nextInt());
        }
        Collections.rotate(al,m);
        for(int i=0;i<n;i++)
        {
            System.out.print(al.get(i)+" ");
        }
        sc.close();
    }
}
