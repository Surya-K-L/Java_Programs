// Find the given phone number is valid or not. 

// Note: A valid phone number will have 10 numeric digits 

// Input 1:  9876543210 

// Output 1: Valid Mobile number 

// Input 2: IONIXX12345 

// Output 2: 

// Invalid mobile number 

// Input 3: 923452342 

// Output 3: 

// Invalid mobile number 

// For example:

// Input	        Result
// srishakthi123   Invalid mobile number 


import java.util.*;
public class Valid_Mobile_Number{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        if(str.length()!=10)
        {
            System.out.print("Invalid mobile number");
        }
        else
        {
            int c=0;
            for(int i=0;i<str.length();i++)
            {
                if(Character.isDigit(str.charAt(i)))
                {
                    continue;
                }
                else
                {
                    System.out.print("Invalid mobile number");
                    c=1;
                    break;
                }
            }
            if(c==0)
            {
                System.out.print("Valid Mobile number");
            }
        }
        sc.close();
    }
}