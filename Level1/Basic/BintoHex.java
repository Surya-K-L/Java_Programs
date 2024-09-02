import java.util.*;
public class BintoHex
{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(2);
        System.out.print(Integer.toHexString(n));
    }
}