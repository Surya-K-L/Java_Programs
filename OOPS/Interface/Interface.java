package Interface;
import java.util.*;
public class Interface {
        public static void main(String h[])
        {
            Scanner sc=new Scanner(System.in);
            Samsung s =new Samsung();
            s.display();
            sc.close();
        }
    }
    interface Mobile{
        public void display();
    }
    class Samsung implements Mobile{
        public void display()
        {
            System.out.print("Has a display");
        }
    }


    //An Interface in Java programming language is defined as an abstract type used to specify the behavior of a class. 
    //An interface in Java is a blueprint of a behavior. A Java interface contains static constants and abstract methods.
