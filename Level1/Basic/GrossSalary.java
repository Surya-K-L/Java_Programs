import java.util.*;
public class GrossSalary{
    public static void main(String h[])
    {
        Scanner sc=new Scanner(System.in);
        int bp=sc.nextInt();
        int hra=(10*bp)/100;
        int da=(5*bp)/100;
        int ta=(6*bp)/100;
        int tax=(2*bp)/100;
        int f=bp+hra+da+ta;
        int total=f-tax;
        System.out.print(total);
    }

}
