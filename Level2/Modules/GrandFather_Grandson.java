// Given the grandfather and mapping, provide the right grandson. 

// For example:

// Input	                                                    Result
// {Mohan, Kumar},{Gram, Teresa},{Plum, Green}                 Param
// {Kumar, Kishan}, {Teresa, Param}, {Green, Camaroon}
// Gram


// {Moh, Kum},{Gr, Ter},{Plum, Green}, {Hello, Dizzy}          -1
// {Kum, Kishan}, {Ter, Param}, {Green, Camaroon}
// Gram


import java.util.*;
public class GrandFather_Grandson
{
    public static void main(String h[])
    {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        String b=sc.nextLine();
        String c=a.replace("{","").replace("}","").replace(" ","");
        String d=b.replace("{","").replace("}","").replace(" ","");
        String e[]=c.split(",");
        String f[]=d.split(",");
        String g=sc.next(),s="";
        int t=0,k=0;
        for(int i=0;i<e.length;i++)
        {
            if(g.equals(e[i]))
            {
                s=e[i+1];
                t=1;
            }
        }
        if(t==1)
        {
            for(int i=0;i<f.length;i++)
            {
                if(s.equals(f[i]))
                {
                    System.out.print(f[i+1]);
                    k=1;
                }
            }
        }
        if(k==0)
        {
            System.out.print(-1);
        }
        sc.close();
    }
}