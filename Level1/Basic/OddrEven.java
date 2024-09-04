import java.util.*;
public class OddrEven{
    public static void main(String h[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if((n & 1 )== 1)
        {
            System.out.print("even");
        }
        else
        System.out.print("odd");
    }
}
