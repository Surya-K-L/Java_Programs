
// Compress the given strings as given below
// INPUT
// aaabbb
// OUTPUT
// a3b3

// INPUT
// ab
// OUTPUT
// a1b1


// For example:

// Input	    Result
// aaabbb      a3b3

// abc         a1b1c1



import java.util.*;
public class CompressString{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        int c=0;
        for(int i=0;i<str.length();i++)
        {
            c=1;
            while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1))
            {
                c++;
                i++;
            }
            System.out.print(str.charAt(i)+""+c);
        }
        sc.close();
    }
}
