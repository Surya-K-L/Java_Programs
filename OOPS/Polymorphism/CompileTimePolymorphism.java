public class CompileTimePolymorphism{
    public static void main(String args[])
    {
        System.out.println(add(5,6,7));
        System.out.println(add(5,6));
    }
    public static int add(int a,int b,int c)
    {
        int t=a+b+c;
        return t;
    }
    public static int add(int a,int b)
    {
        int t=a+b;
        return t;
    }
}

//Compile-time polymorphism is also known as static polymorphism or early binding. 
//Compile-time polymorphism is a polymorphism that is resolved during the compilation process. 
//Overloading of methods is called through the reference variable of a class. 
//Compile-time polymorphism is achieved by method overloading and operator overloading.
