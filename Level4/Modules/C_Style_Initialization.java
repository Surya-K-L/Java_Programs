// Given a C style initialization statement find the variable types and values. Only int and char are allowed. If a variable is not initialized it should be marked as “junk”.

// Sample Input 1
// int b,a=10;char s='a';

// Sample Output 1

// Integers
// b=junk
// a=10
// Characters
// s='a'

// Sample Input 2
// int i,k=10;int a=-10;char b='c';

// Sample Output 2
// Integers
// i=junk
// k=10
// a=-10
// Characters
// b='c'



import java.util.*;
public class C_Style_Initialization{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        String b[]=a.split(";");
        ArrayList<String>Inte=new ArrayList<>();
        ArrayList<String>Cha=new ArrayList<>();
        for(int i=0;i<b.length;i++)
        {
            String z=b[i];
            if(z.contains("int"))
            {
                z=z.replaceAll("int","").replaceAll("\\s+","");
                if(z.contains(","))
                {
                    String k[]=z.split(",");
                    for(int j=0;j<k.length;j++)
                    {
                        if(k[j].contains("="))
                        {
                            Inte.add(k[j]);
                        }
                        else
                        {
                            String p=k[j]+"=junk";
                            Inte.add(p);
                        }
                    }
                }
                else
                {
                    if(z.contains("="))
                    {
                        Inte.add(z);
                    }
                    else
                    {
                        String p=z+"=junk";
                        Inte.add(p);
                    }
                }
            }
            else if(z.contains("char"))
            {
                z=z.replaceAll("char","").replaceAll("\\s+","");
                if(z.contains(","))
                {
                    String k[]=z.split(",");
                    for(int j=0;j<k.length;j++)
                    {
                        if(k[j].contains("="))
                        {
                            Cha.add(k[j]);
                        }
                        else
                        {
                            String p=k[j]+"=junk";
                            Cha.add(p);
                        }
                    }
                }
                else
                {
                    if(z.contains("="))
                    {
                        Cha.add(z);
                    }
                    else
                    {
                        String p=z+"=junk";
                        Cha.add(p);
                    }
                }
            }
        }
        System.out.println("Integers");
        for(String zz:Inte)
        {
            System.out.println(zz);
        }
        System.out.println("Characters");
        for(String pp:Cha)
        {
            System.out.println(pp);
        }
        sc.close();
    }
}