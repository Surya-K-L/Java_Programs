import java.util.*;
public class FirstLastSum
{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=(int)Math.log10(n)+1;
        int b=a-1;
        int c=(int)Math.pow(10,b);
        int d=n/c;
        int e=n%10;
        System.out.print(d+e);
    }
}
