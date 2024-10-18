// Read 2 strings and replace the first occurance of the second string in first string with the third string

// If the second string is not there in the first string, then the first string should be displayed as is

// For example:

// Input	Result
// Hello - Are you there?
// Are
// While
// Hello - While you there?
// This is a long sentence. is it not?
// is
// was
// This was a long sentence. is it not?


import java.util.*;
public class Replace_First_Are_While{
    public static void main(String h[])
    {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        String b=sc.next(),c=sc.next();
        String d[]=a.split(" ");
        for(int i=0;i<d.length;i++)
        {
            if(d[i].equals(b))
            {
                d[i]=c;
                break;
            }
        }
        for(int i=0;i<d.length;i++)
        {
            System.out.print(d[i]+" ");
        }
    }
}
