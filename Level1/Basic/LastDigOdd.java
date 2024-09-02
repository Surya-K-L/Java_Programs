import java.util.*;
public class LastDigOdd{
    public static void main(String h[])
    {
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<3;i++)
        {
        int n=sc.nextInt();
        int t=n%10;
        if((n & 1)==1)
        System.out.print("odd");
        else
        System.out.print("even");
        }
    }
}
