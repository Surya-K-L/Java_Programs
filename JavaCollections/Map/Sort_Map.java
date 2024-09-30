// Given the details of marks scored by students in form of a HashMap where the name of the student is the Key and the marks scored is the Value. 

// Your task is to sort the map according to the key values i.e the names of the students in the alphabetical(lexicographical) order.

// Sample Input:

// 5

// Akash 85

// Vikram 95

// Dev 76

// Arun 92

// Jai 81

// Sample Output:

// Akash 85

// Arun 92

// Dev 76

// Jai 81

// Vikram 95




import java.util.*;
public class Sort_Map{
    public static void main(String h[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        TreeMap<String,Integer>al=new TreeMap<>();
        for(int i=0;i<n;i++)
        {
            al.put(sc.next(),sc.nextInt());
        }
        for(Map.Entry<String,Integer> entry:al.entrySet())
        {
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
        sc.close();
    }
}
