// In the given String S, replace the letters in a string with new string in the given start and end position

// For example:

// Input	                Result
// Hello World           HSIETlo World
// 1
// 3
// SIET

// This is Fun            ThREPFun
// 2
// 8
// REP

// India is my country    I Love my country
// 0
// 8
// I Love




import java.util.*;
public class Replace_Word_With_New_String_St_End{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        int n=sc.nextInt();
        int k=sc.nextInt();
        sc.nextLine();
        String z=sc.nextLine();
        String p=a.substring(0,n)+z+a.substring(k,a.length());
        System.out.print(p);
    }
}
