// Write a program to rotate an array in anti-clockwise direction for the given number of rotation.


// For example:

// Input
// 5
// 1 2 3 4 5
// 2
// Result
// 4 5 1 2 3

// Input
// 6
// 4 6 7 2 3 9
// 3
// Result
// 2 3 9 4 6 7

// Input
// 1
// 1
// 1
// Result
// Invalid Input


import java.util.*;
public class Anti_CLockwise_Rotation{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer>al=new ArrayList<>();
        for(int  i=0;i<n;i++)
        {
            al.add(sc.nextInt());
        }
        int k=sc.nextInt();
        if(n==1)
        {
            System.out.print("Invalid Input");
        }
        else
        {
            Collections.rotate(al,k);
            for(int i=0;i<n;i++)
            {
                System.out.print(al.get(i)+" ");
            }
        }
        
    }
}

