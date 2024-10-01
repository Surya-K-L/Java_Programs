import java.util.*;
public class Alphabet_Count{
    public static void main(String h[])
    {
        Scanner sc=new Scanner(System.in);
        String a=sc.next();
        int c=1,i;
        for(i=0;i<a.length();i++)
        {
            c=1;
            while(i<a.length()-1 && a.charAt(i)==a.charAt(i+1))
            {
                c++;
                i++;
            }
            System.out.print(a.charAt(i)+""+c);
        }
    }
}
