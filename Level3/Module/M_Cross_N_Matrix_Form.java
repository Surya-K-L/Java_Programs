// Convert the given input into M*N matrix from.

// For example:

// Input	         
// {{3,2,1,5},{9,1,3,0}}
// Result
// 3 2 1 5
// 9 1 3 0

// Input
// {{2,9,0},{1,2,3},{4,5,6},{7,8,9}}
// Result
// 2 9 0
// 1 2 3
// 4 5 6
// 7 8 9


import java.util.*;
public class M_Cross_N_Matrix_Form{
    public static void main(String h[])
    {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        a=a.substring(1,a.length()-1);
        a=a.replace("{","").replace(" ","").replace("\\s+","").replace(",","").trim();
        String b[]=a.split("}");
        for(int i=0;i<b.length;i++)
        {
            String z=b[i];
            for(int j=0;j<z.length();j++)
            {
                System.out.print(z.charAt(j)+" ");
            }
            System.out.println();
        }
        
    }
}
