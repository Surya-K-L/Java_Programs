// Check if two strings are rotations of each other. Refer to sample input and output. Rotation can be left rotation or right rotation

// For example:

// Input	
// Hello
// lleHo
// Result
// Not a rotation of each other

// Input
// Hello
// elloH
// Result
// Hello and elloH are rotation of each other

// Input
// Hello
// oHell
// Result
// Hello and oHell are rotation of each other



import java.util.*;
public class Rotation_Of_Each_Other{
    public static void main(String h[])
    {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine(), s2=sc.nextLine(),lr="",s=s1;
        boolean b=false;
        for(int i=0;i<s1.length();i++)
        {
            lr=s.substring(s.length()-1)+s.substring(0,s.length()-1);
            s=lr;
            if(s2.equals(s))
            {
                b=true;
                break;
            }
        }
        if(b)
        {
            System.out.print(s1+" and "+s2+" are rotation of each other");
        }
        else
             System.out.print("Not a rotation of each other");
    }
}
