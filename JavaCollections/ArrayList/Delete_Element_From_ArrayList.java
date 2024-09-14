// Write a program to delete an element from the arraylist

// For example:

// Input	   Result
// 0          [BMW, Ford, Mazda]


import java.util.*;
public class Delete_Element_From_ArrayList{
  public static void main(String[] args) {
      int n;
      Scanner sc = new Scanner(System.in);
      n = sc.nextInt(); //n is a value between 0 to 3
    ArrayList<String> cars = new ArrayList<String>();

    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("Mazda");
    //Write code here to delete the nth element from arraylist
    cars.remove(n);
    System.out.println(cars);
    sc.close();
  }
}


