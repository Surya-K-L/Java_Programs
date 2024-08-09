// Find if a given string has even number of characters or odd number of characters

// For example:

// Input	Result
// hello   odd

// good    even



import java.util.*;
public class Even_Odd_Number_Of_Characters{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        if(str.length()%2==1)
        {
            System.out.println("odd");
        }
        else
        {
            System.out.print("even");
        }
        sc.close();
    }
}