import java.util.*;
public class MiddleElement
{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=(int)Math.log10(n)+1;
        int b=a/2;
        int c=(int)Math.pow(10,b);
        int d=n/c;
        int f=d%10;
        System.out.println(f);
    }
}
