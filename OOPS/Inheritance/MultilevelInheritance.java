package Inheritance;
import java.util.*;
public class MultilevelInheritance {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        SamsungM13 m=new SamsungM13();
        m.display();
        m.displaymob();
        m.displaym13();
        sc.close();
    }
}
class Mobile{
    public void display()
    {
        System.out.print("Common-screen-size: 5");
    }
}
class SamsungMobile extends Mobile{
    public void displaymob()
    {
        System.out.print("Touch-screen-size: 6");
    }
}
class SamsungM13 extends SamsungMobile{
    public void displaym13()
    {
        System.out.print("SamsungM13 screen-size: 7");
    }
}
