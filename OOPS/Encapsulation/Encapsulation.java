package Encapsulation;
class Encapsulation{
    public static void main(String args[])
    {
        Mobile m=new Mobile();
        m.setModel("Samsung");
        System.out.print(m.getModel()+" ");
        m.setPrice(25000);
        System.out.print(m.getPrice());
    }
}
class Mobile{
    private float price;
    private String model;
    public void setPrice(float price)
    {
        this.price=price;
    }
    public float getPrice()
    {
        return price;
    }
    public void setModel(String model)
    {
        this.model=model;
    }
    public String getModel()
    {
        return model;
    }
}

//Encapsulation in Java is a fundamental concept in object-oriented programming (OOP) that refers to the bundling of data and methods that operate on that data within a single unit, which is called a class in Java. 
//Java Encapsulation is a way of hiding the implementation details of a class from outside access and only exposing a public interface that can be used to interact with the class.
