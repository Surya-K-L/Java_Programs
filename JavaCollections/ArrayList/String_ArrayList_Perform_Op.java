// Create an ArrayList aL1 of type String and perform the following operations.

// Add “One”, “Two” into the arrayList aL1.
// Read 5 elements from user.
// Print the element at the index 5.
// Change the element at index 2 as “Three”.
// Create a printAll method which will print all the elements using an ListIterator.
// Sort the elements and print the same.

// For example:

// Input	                            Result
// Four Five Six Seven Eight           Element at index 5: Seven
//                                     One Two Three Five Six Seven Eight
//                                     [Eight, Five, One, Seven, Six, Three, Two]


import java.util.*;
public class String_ArrayList_Perform_Op{
    public static void main(String h[])
    {
        Scanner sc =new Scanner(System.in);
        ArrayList<String> aL1=new ArrayList<>();
        aL1.add("One");
        aL1.add("Two");
        for(int i=0;i<5;i++)
        {
            aL1.add(sc.next());
        }
        System.out.println("Element at index 5: "+aL1.get(5));
        aL1.set(2,"Three");
        Iterator itr=aL1.iterator();
        while(itr.hasNext())
        {
            System.out.print(itr.next()+" ");
        }
        System.out.println();
        Collections.sort(aL1);
        System.out.println(aL1);
        sc.close();
    }
}
