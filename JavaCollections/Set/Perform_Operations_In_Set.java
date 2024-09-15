// Create Collection called TreeSet T1 which is capable of storing String Integers. The Collection should have the following capabilities.

// a) Reverse the elements of the Collection

// b) Iterate the elements of the TreeSet

// c) Check if a particular element exists or not

// Note: Size of the TreeSet is 5.


// For example:

// Input	                                                   Result
// Gingerbread Eclair Cupcake Honeycomb Marshmallow            After Reversing
// Eclair                                                      [Marshmallow, Honeycomb, Gingerbread, Eclair, Cupcake]
//                                                             Using Iterator:
//                                                             Marshmallow Honeycomb Gingerbread Eclair Cupcake
//                                                             Entered Element is Present

// JellyBean Kitkat Lollipop Nougat Oreo                       After Reversing
// Pie                                                         [Oreo, Nougat, Lollipop, Kitkat, JellyBean]
//                                                             Using Iterator:
//                                                             Oreo Nougat Lollipop Kitkat JellyBean
//                                                             Entered Element is not Present



import java.util.*;
public class Perform_Operations_In_Set{
    public static void main(String h[])
    {
        Scanner sc=new Scanner(System.in);
        TreeSet<String> T1=new TreeSet<String>();
        for(int i=0;i<5;i++)
        {
            String s=sc.next();
            T1.add(s);
        }
        String s1=sc.next();
        System.out.println("After Reversing");
        ArrayList<String> aL1=new ArrayList<>(T1);
        Collections.reverse(aL1);
        System.out.println(aL1);
        System.out.println("Using Iterator:");
        Iterator it=aL1.iterator();
        while(it.hasNext())
        {
            System.out.print(it.next()+" ");
        }
        System.out.println();
        if(aL1.contains(s1))
        System.out.println("Entered Element is Present");
        else
        System.out.println("Entered Element is not Present");
        sc.close();
    }
}
