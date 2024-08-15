// Given a password entered by the user, check its strength using the below constraints and display either the password is strong or password is not strong.

// Input Format

// The first line contains the given string

// Constraints

// A password is strong if it has :

// 1. At least 8 characters

// 2. At least one special char

// 3. At least one number

// 4. At least one upper and one lower case char.

// Output Format

// Display either Your Password is Strong or Your Password is Not Strong

// For example:

// Input	                            Result
// rakesh@1995kumar                    Your Password is Not Strong

// %ba7RNFm                            Your Password is Strong



import java.util.*;
public class StrongPassword{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String pass=sc.nextLine();
        int z=0;
        if(pass.length()!=8)
        {
            System.out.print("Your Password is Not Strong");
        }
        else
        {
            for(int i=0;i<pass.length();i++)
            {
                char c=pass.charAt(i);
                if(c>=32 ||(c<=48 && c>=57) || (c<=64 && c>=91) || (c<=96 && c>=123) ||c<=126)
                {
                    z++;
                }
                if(z==1)
                {
                    System.out.print("Your Password is Strong");
                    break;
                }
            }
        }
        sc.close();
    }
}