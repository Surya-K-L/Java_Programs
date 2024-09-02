import java.util.*;
public class Allconvereter
{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(Integer.toHexString(n));
        System.out.println(Integer.toBinaryString(n));
        System.out.println(Integer.toOctalString(n));
    }
}
