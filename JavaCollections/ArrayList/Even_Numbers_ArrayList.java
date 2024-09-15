// Develop a java class Collections_ArrayList and perform the following operations.

// Create a method saveEvenNumbers(int N) and use ArrayList to store even numbers from 2 to N, where N is a integer which is passed as a parameter to the method saveEvenNumbers(). The method should return the ArrayList (A1) created.
//  In the same class create a method printEvenNumbers() which iterates through the arrayList A1 in step 1, and It should multiply each number with 2 and display it in format 4,8,12….2*N.
//  Note: Create ArrayList A1 and A2 as instance variables.


// For example:

// Input	    Result
// 23          List of Even Numbers:           
//             [2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22]
//             List of Even Numbers multiplied by 2:
//             [4, 8, 12, 16, 20, 24, 28, 32, 36, 40, 44]



import java.util.*;
public class Even_Numbers_ArrayList{
    public static ArrayList<Integer> saveEvenNumbers(int n)
    {
        ArrayList<Integer> A1=new ArrayList<>();
        for(int i=2;i<=n;i++)
        {
            if(i%2==0)
            A1.add(i);
        }
        return A1;
        
    }
    public static void main(String h[])
    {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> a1=new ArrayList<>();
        int n=sc.nextInt();
        System.out.println("List of Even Numbers:");
        a1=saveEvenNumbers(n);
        System.out.println(a1);
        System.out.println("List of Even Numbers multiplied by 2:");
        ArrayList <Integer> A2=new ArrayList<>();
        for(int i=2;i<=n;i++)
        {
            if(i%2==0)
            A2.add(i*2);
        }
        System.out.print(A2);
        sc.close();
    }
}
