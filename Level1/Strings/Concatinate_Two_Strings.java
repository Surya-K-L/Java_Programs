// Concatenate given 2 strings

// For example:

// Input	    Result
// hello       helloworld
// world



import java.util.*;
public class Concatinate_Two_Strings{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String str1=sc.next(),str2=sc.next();
        System.out.print(str1+str2);
        sc.close();
    }
}