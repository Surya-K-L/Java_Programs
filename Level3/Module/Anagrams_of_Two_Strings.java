// Check if the two strings are anagrams of each other

// Input

// SILENT

// LISTEN

// Output

// Yes

// Input

// True

// False

// Output

// No


import java.util.*;
public class Anagrams_of_Two_Strings{
    public static void main(String h[])
    {
        Scanner sc=new Scanner(System.in);
        String a=sc.next();
        String b=sc.next();
        char c[]=a.toCharArray();
        char d[]=b.toCharArray();
        Arrays.sort(c);
        Arrays.sort(d);
        if(Arrays.equals(c,d))
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
        sc.close();
    }
}