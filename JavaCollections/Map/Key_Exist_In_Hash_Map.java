// Given a HashMap<Integer,String> and a key , Write a program to check whether the key exists in the HashMap or not.

// Sample Input:

// 5

// 1 ECE

// 2 CSE

// 3 EEE

// 4 IT

// 5 MECH

// 5

// Sample Output:

// Key Found



// For example:

// Input	            Result
// 3                   Key Not Found
// 10 Sri
// 15 Shakthi
// 14 Institute
// 12





import java.util.*;
public class Key_Exist_In_Hash_Map{
    public static void main(String h[])
    {
        Scanner sc=new Scanner(System.in);
        int  n=sc.nextInt();
        HashMap<Integer,String> al=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            al.put(sc.nextInt(),sc.next());
        }
        int k=sc.nextInt();
        if(al.containsKey(k)==true)
        {
            System.out.print("Key Found");
        }
        else
        {
            System.out.print("Key Not Found");
        }
        sc.close();
        
    }
}
