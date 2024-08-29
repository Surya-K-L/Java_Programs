package Abstraction;
import java.util.*;
public class Abstraction {
            public static void main(String h[])
            {
                Scanner sc=new Scanner(System.in);
                Samsung s =new Samsung();
                s.display();
                s.camera();
                sc.close();
            }
        }
        abstract class Mobile{
            abstract void display();
            public void camera()
            {
                System.out.print("It has A Camera");
            }
        }
        class Samsung extends Mobile{
            public void display()
            {
                System.out.print("Has a display");
            }
        }

//Data abstraction is the process of hiding certain details and showing only essential information to the user.
//Abstraction can be achieved with either abstract classes or interfaces (which you will learn more about in the next chapter).

// The abstract keyword is a non-access modifier, used for classes and methods:

// Abstract class: is a restricted class that cannot be used to create objects (to access it, it must be inherited from another class).

// Abstract method: can only be used in an abstract class, and it does not have a body. The body is provided by the subclass (inherited from).
