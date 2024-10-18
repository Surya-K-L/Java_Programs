// Left Rotation and Right Rotation of a String
// Given a string of size n, write functions to perform the following operations on a string-

// Left (Or anticlockwise) rotate the given string by d elements (where d <= n)
// Right (Or clockwise) rotate the given string by d elements (where d <= n).
// Examples: 

// Input : s = "srishakthi"
//         d = 2
// Output : Left Rotation  : "ishakthisr" 
//          Right Rotation : "hisrishakt" 
// Input : s = "qwertyu" 
//         d = 2
// Output : Left rotation : "ertyuqw"
//          Right rotation : "yuqwert"



import java.util.*;
public class Left_Rotation_Right_Rotation{
    public static void main(String h[])
    {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine(),b=a;
        int n=sc.nextInt();
        ArrayList<Character>al1=new ArrayList<>();
        ArrayList<Character>al2=new ArrayList<>();
        for(int i=0;i<a.length();i++)
        {
            al1.add(a.charAt(i));
            al2.add(a.charAt(i));
        }
        System.out.print("Left Rotation:");
        System.out.print((char)(34));
        Collections.rotate(al1,-n);
        Iterator itr=al1.iterator();
        while(itr.hasNext())
        {
            System.out.print(itr.next());
        }
        System.out.print((char)(34));
        System.out.println();
        System.out.print("Right Rotation:");
        System.out.print((char)(34));
        Collections.rotate(al2,n);
        Iterator itr2=al2.iterator();
        while(itr2.hasNext())
        {
            System.out.print(itr2.next());
        }
        System.out.print((char)(34));
    }
}
