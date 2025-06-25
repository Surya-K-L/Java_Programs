import java.util.*;
public class Main{
    public static void main(String h[])
    {
        Scanner sc=new Scanner(System.in);
        String a="abBAcC";
        System.out.print(makeGood(a));
    }
     public static String makeGood(String s) {
        int r=1,c=0;
        if(s.length()==1)
        {
            return s;
        }
        else
        {
            while(r!=0)
            {
                for(int i=0;i<s.length()-1;i++)
                {
                    char t=s.charAt(i);
                    r=0;
                    if(i==0 && Character.isUpperCase(t))
                    {
                        if(Character.toLowerCase(t)==s.charAt(i+1))
                        {
                            r=1;
                            s=s.substring(i+2,s.length());
                        }
                    }
                    else if(Character.isUpperCase(t))
                    {
                        if(Character.toLowerCase(t)==s.charAt(i+1) ||Character.toLowerCase(t)==s.charAt(i-1))
                        {
                            r=1;
                            s=s.substring(0,i-1)+s.substring(i+1,s.length());
                        }
                    }
                    else if(i==s.length()-1 &&Character.isUpperCase(t))
                    {
                        if(Character.toLowerCase(t)==s.charAt(i+1) ||Character.toLowerCase(t)==s.charAt(i-1))
                        {
                            r=1;
                            s=s.substring(0,i-2);
                        }
                    }
                }
            }
            if(s.length()==2)
            {
                    if(Character.isUpperCase(s.charAt(0)) && Character.toLowerCase(s.charAt(0))==s.charAt(1))
                    {
                        return "";
                    }
                    else if(Character.isUpperCase(s.charAt(1)) && Character.toLowerCase(s.charAt(1))==s.charAt(0))
                    {
                        return "";
                    }
            }
            return s;
        }
    }
}
