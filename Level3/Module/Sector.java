// The postal address is unique and it starts with a number followed by a character then by a space with a string "Sector" followed by space and then a letter. 

// Find out if a given string is a valid address or not

// For example:

// Input	        Result
// 45D Sector X    True

// 33Y Setor X     False


import java.util.*;
import java.util.regex.*;
public class Sector{
    public static void main(String h[])
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        boolean isvalid=ValidateAddress(str);
        if(isvalid==true)
        {
            System.out.print("True");
        }
        else
        {
            System.out.print("False");
        }
        sc.close();
    }
    public static boolean ValidateAddress(String str)
    {
        String pattern="^\\d\\d[A-Za-z]\\sSector\\s[A-Za-z]$";
        Pattern regex=Pattern.compile(pattern);
        Matcher matcher=regex.matcher(str);
        return matcher.matches();
    }
}
