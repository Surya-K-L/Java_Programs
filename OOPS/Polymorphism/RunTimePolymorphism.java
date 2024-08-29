class RunTimePolymorphism{
    public static void main(String args[])
    {
        Mobile m=new Mobile();
        m.screensize(5);
        Samsung s=new Samsung();
        s.screensize(6);
        s.sensor();
        Vivo v=new Vivo();
        v.screensize(7);
        v.sensor();
    }
}
class Mobile{
    public void sensor()
    {
        System.out.println("Have FingerPrint Sensor");
    }
    public void screensize(int size)
    {
        System.out.println("Common screen-size: "+size);
    }
}

class Samsung extends Mobile{
    public void screensize(int size)
    {
        System.out.println("Samsung screen-size: "+size);
    }
    public void sensor()
    {
        System.out.println("Have FingerPrint Sensor");
    }
}

class Vivo extends Mobile{
    public void screensize(int size)
    {
        System.out.println("Vivo screen-size: "+size);
    }
    public void sensor()
    {
        System.out.println("Doesn't Have FingerPrint Sensor");
    }
}

//Compile-time polymorphism is also known as static polymorphism or early binding. 
//Compile-time polymorphism is a polymorphism that is resolved during the compilation process.
// Overloading of methods is called through the reference variable of a class. 
//Compile-time polymorphism is achieved by method overloading and operator overloading.
