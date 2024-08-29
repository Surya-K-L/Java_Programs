package Inheritance;
import java.util.*;
public class SingleInheritance {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        Mobile m=new Mobile();
        m.screensize();
        Samsung s=new Samsung();
        s.screensize(7);
        s.price(25000);
        sc.close();
    }
}
class Mobile{
    public void screensize()
    {
        System.out.println("Common-size: "+5);
    }
}
class Samsung extends Mobile{
    public void screensize(int size)
    {
        System.out.println("Samsung Size: "+size);
    }
    public void price(float price)
    {
        System.out.println("Price: "+price);
    }
}

