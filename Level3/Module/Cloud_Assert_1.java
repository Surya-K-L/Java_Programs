import java.util.*;
public class Cloud_Assert_1{
    public static void main(String h[])
    {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        System.out.print(SearchChallenge(a));
    }
    public static String SearchChallenge(String a)
    {
        int ch=0,ans=0;
        for(int i=0;i<a.length();i++)
        {
            if(Character.isDigit(a.charAt(i)))
            {
                ans+=Character.getNumericValue(a.charAt(i));
            }
            else
            {
                ch++;
            }
        }
        double p=(double)ans/ch;
        int v=(int)Math.round(p);
        return Integer.toString(v);
    }
}
