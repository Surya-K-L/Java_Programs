import java.util.*;
public class Rev_A_Num{
    public static void main(String h[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),p=0,q=0;
        int t=n;
        while(t>0)
        {
            p=t%10;
            q=q*10+p;
            t=t/10;
        }
        System.out.print(q);

    }
}
