// Create a Stack named Words of type String and perform the following operations.

// Read the size and add the elements in to the stack
// Retrieve the topmost value from the stack
// Read a string from user and display the position of it.

// For example:

// Input	                                        Result
// 6                                               Topmost element is: is
// Where there is peace god is                     Position of god: 5
// god

// 10                                              Topmost element is: god
// The nest of the blind bird is made by god       Position of heart: Not Found
// heart


import java.util.*;
public class String_Stack{
    public static void main(String h[])
    {
        Scanner sc=new Scanner(System.in);
        Stack<String> s=new Stack<String>();
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            s.push(sc.next());
        }
        String b=sc.next();
        System.out.println("Topmost element is: "+s.pop());
        int j=s.indexOf(b);
        if(j>0)
        {
            System.out.println("Position of "+b+": "+(j+1));
        }
        else
        {
            System.out.println("Position of "+b+": "+"Not Found");
        }
        sc.close();
    }
}
