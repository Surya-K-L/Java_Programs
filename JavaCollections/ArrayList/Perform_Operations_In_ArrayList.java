// Create an arraylist aL1 and perform the following operations.

// Add elements 65, 32, 56 ,78, 96, 124
// Remove the element at the index 4.
// Add 45 at the index 2.
// Check whether 78 is present in aL1. If yes, Print “True” Otherwise “False”
// Print the ArrayList aL1.



import java.util.*;
public class Perform_Operations_In_ArrayList{
    public static void main(String h[])
    {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> aL1=new ArrayList<Integer>();
        aL1.add(65);
        aL1.add(32);
        aL1.add(56);
        aL1.add(78);
        aL1.add(96);
        aL1.add(124);
        aL1.remove(4);
        aL1.add(2,45);
        aL1.contains(78);
        System.out.println("True");
        System.out.print(aL1);
        sc.close();
    }
}