// Read and display a set of strings given separated by commas



// For example:

// Input	                        Result
// Trial, Boys, Car, Now,This      Trial                   
//                                 Boys
//                                 Car
//                                 Now
//                                 This

// Street, Show, This              Street
//                                 Show
//                                 This


import java.util.*;
public class Split_And_Print_Comma{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String split[]=str.split(", ");
        for(String s:split)
        {
            System.out.println(s);
        }
        sc.close();
    }
}