// Create an ArrayList aL1 of type Float and perform the following operations.

//  Read 5 elements from user.
// Create an ArrayList aL2 and copy all the elements from aL1 into aL2 and print the same using Iterator.
// Remove all the elements from ArrayList aL1.
// Print the size of ArrayList aL1.

// For example:

// Input	                    Result
// 12.5 56.2 78.4 89.4 15.6    12.5 56.2 78.4 89.4 15.6
//                             Size of aL1 is: 0


import java.util.*;
public class Float_Operation_ArrayList{
    public static void main(String h[])
    {
        Scanner sc=new Scanner(System.in);
        ArrayList<Double> aL1=new ArrayList<Double>();
        for(int i=0;i<5;i++)
        {
            aL1.add(sc.nextDouble());
        }
        ArrayList<Double> aL2=new ArrayList<Double>();
        Collections.copy(aL1,aL2);
        Iterator<Double> itr= aL1.iterator();
        while(itr.hasNext())
        {
            System.out.print(itr.next()+" ");
        }
        System.out.println();
        aL1.clear();
        System.out.println("Size of aL1 is: "+aL1.size());
        sc.close();
    }
}

