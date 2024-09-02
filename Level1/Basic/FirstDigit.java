import java.util.*;
public class FirstDigit
{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=(int)Math.log10(n)+1;
        int b=a-1;
        int c=(int)Math.pow(10,b);
        int d=n/c;
        System.out.print(d);
    }
}
