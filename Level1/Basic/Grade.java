import java.util.*;
public class Grade{
    public static void main(String h[])
    {
        Scanner sc=new Scanner(System.in);
        int m1=sc.nextInt();
        int m2=sc.nextInt();
        int m3=sc.nextInt();
        double t=(m1+m2+m3)/3;
        System.out.println(t);
        System.out.print((t>=90)?"O":(t>=80 && t<90)?"A":(t>=70 && t<80)?"B":(t>=60 && t<70)?"C":(t>=50 && t<60)?"D":"F");
        
    }
}
