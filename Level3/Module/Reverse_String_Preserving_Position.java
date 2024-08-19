// Write a program to reverse a string with preserving the position of spaces. For example, if “I Am Not String” is the given string then the reverse of this string with preserving the position of spaces is “g ni rtS toNmAI”

// Input Format

// 3 work while you work ITVAC ROCKS Never believe a stranger

// Output Format

// krow uoyel ihw krow SKCOR CAVTI regna rtsaeve i lebreveN

// Sample Input 0

// 3
// work while you work
// ITVAC ROCKS
// Never$ believe a stranger
// Sample Output 0

// krow uoyel ihw krow
// SKCOR CAVTI
// regna$ rtsaeve i lebreveN

// For example:

// Input	            Result
// I* Am Not String     g* ni rtS toNmAI

// work while you work  krow uoyel ihw krow



import java.util.*;
public class Reverse_String_Preserving_Position{
    public static void main(String h[])
    {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        String b[]=a.split(" ");
        ArrayList<Character> al=new ArrayList<>();
        for(int i=0;i<a.length();i++)
        {
            char t=a.charAt(i);
            if((t>=65 && t<=90)||(t>=97 && t<=122))
            {
                al.add(t);
            }
        }
         char[] charArray = new char[al.size()];
        for (int i = 0; i < al.size(); i++) {
            charArray[i] = al.get(i);
        }
        int p=charArray.length-1;
        for(int i=0;i<a.length();i++)
        {
            
            char t=a.charAt(i);
            if((t>=65 && t<=90)||(t>=97 && t<=122))
            {
                System.out.print(charArray[p]);
                p--;
            }
            else
            {
                System.out.print(a.charAt(i));
            }
        }
        sc.close();
    }
}