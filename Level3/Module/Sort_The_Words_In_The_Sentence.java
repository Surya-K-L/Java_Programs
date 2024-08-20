// Write a program to sort the words in a sentence

// Input Format

// hello, how are you today?

// Output Format

// are hello, how today? you



import java.util.*;
public class Sort_The_Words_In_The_Sentence{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String a[]=sc.nextLine().split(" ");
        Arrays.sort(a);
        for(String z:a)
        {
            System.out.print(z+" ");
        }
        sc.close();
    }
}