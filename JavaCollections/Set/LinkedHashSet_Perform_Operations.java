// Create a LinkedHashSet LH of type integer and perform the following operations.

// Read the size of the set and elements from the user and store it in LH.
// Display the size and elements of LH.
// Add all the elements of LH into LH1 and display it using iterator.
// Remove all elements from LH and display its size.
// Convert LH1 into an array and display the values.

// For example:

// Input	                        Result
// 6                               Size of LH is: 6
// 12 15 48 56 98 75               Elements in LH: [12, 15, 48, 56, 98, 75]
//                                 12 15 48 56 98 75
//                                 Size of LH after removing all the elements: 0
//                                 12 15 48 56 98 75

// 8                               Size of LH is: 8
// 14 15 75 98 63 26 51 74         Elements in LH: [14, 15, 75, 98, 63, 26, 51, 74]
//                                 14 15 75 98 63 26 51 74
//                                 Size of LH after removing all the elements: 0
//                                 14 15 75 98 63 26 51 74



import java.util.*;
public class LinkedHashSet_Perform_Operations{
    public static void main(String h[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Set<Integer> LH=new LinkedHashSet<Integer>();
        for(int i=0;i<n;i++)
        {
            LH.add(sc.nextInt());
        }
        System.out.println("Size of LH is: "+LH.size());
        System.out.println("Elements in LH: "+LH);
        Set<Integer> LH1=new LinkedHashSet<Integer>();
        LH1.addAll(LH);
        Iterator it=LH1.iterator();
        while(it.hasNext())
        {
            System.out.print(it.next()+" ");
        }
        System.out.println();
        LH.clear();
        System.out.println("Size of LH after removing all the elements: "+LH.size());
        Integer[] ar=LH1.toArray(new Integer[0]);
        for(int a=0;a<ar.length;a++)
        {
            System.out.print(ar[a]+" ");
        }
        sc.close();
    }
}
