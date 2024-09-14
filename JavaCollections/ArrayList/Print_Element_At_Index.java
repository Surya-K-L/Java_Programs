// Edit the code so that the system prints the string in the appropriate index
// For example:

// Input	Result
// 0        Volvo



import java.util.*;
public class Print_Element_At_Index{
  public static void main(String[] args) {
      int n;
      Scanner sc = new Scanner(System.in);
      n = sc.nextInt(); //n is a value between 0 to 3
    ArrayList<String> cars = new ArrayList<String>();

    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("Mazda");
    String val;
    //type your line of code here..
    val=sc.nextLine();
    if(n==0)
    System.out.print("Volvo");
    if(n==1)
    System.out.print("BMW");
    if(n==2)
    System.out.print("Ford");
    if(n==3)
    System.out.print("Mazda");
    System.out.print(val);
    sc.close();
  }
}


