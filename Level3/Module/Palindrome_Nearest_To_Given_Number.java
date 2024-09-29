import java.util.*;
public class Palindrome_Nearest_To_Given_Number{
    public static void main(String h[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int s=n+1;
        int e=n-1;
        boolean p=true;
        String a=Integer.toBinaryString(n);
        StringBuilder sk=new StringBuilder(a);
        sk.reverse();
        String z=sk.toString();
        if(z.equals(a))
        {
            System.out.print(n);
        }
        else
        {
            while(p)
            {
                String v=Integer.toBinaryString(s);
                String u=Integer.toBinaryString(e);
                if(v.length()>u.length())
                {
                    String q=Integer.toBinaryString(s);
                    StringBuilder sp=new StringBuilder(q);
                    sp.reverse();    
                    String w=sp.toString();
                    if(w.equals(q))
                    {
                        System.out.print(s);
                        p=false;
                        break;
                    }
                    s++;
                }
                else
                {
                    String q=Integer.toBinaryString(e);
                    StringBuilder sp=new StringBuilder(q);
                    sp.reverse();    
                    String w=sp.toString();
                    if(w.equals(q))
                    {
                        System.out.print(s);
                        p=false;
                        break;
                    }
                    e--;
                }
            }
        }
    }
}
