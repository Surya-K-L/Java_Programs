// Find the common prime number between the given 2 sets of numbers

// For example:

// Input	
// 23,17,33,22,4
// 22,33,17,4
// Result
// 17


// 11,12,13,14,15,16,17,18,19,20
// 5,10,15,20,25,30,35
// Result
// 0


import java.util.*;
public class Multiple_Common_Prime{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String a[]=sc.nextLine().split(",");
        String b[]=sc.nextLine().split(",");
        ArrayList<Integer>al=new ArrayList<>();
        int c[]=new int[a.length];
        int d[]=new int[b.length];
        for(int i=0;i<c.length;i++)
        {
            c[i]=Integer.parseInt(a[i]);
        }
        for(int i=0;i<d.length;i++)
        {
            d[i]=Integer.parseInt(b[i]);
        }
        int p=0;
        for(int i=0;i<c.length;i++)
        {
            for(int j=0;j<d.length;j++)
            {
                if(c[i]==d[j])
                {
                    if(isPrime(c[i]))
                    {
                        p=1;
                        al.add(c[i]);
                    }
                }
            }
        }
        if(p==0)
        {
            System.out.print(0);
        }
        else
        {
            if(al.size()==0)
            {
                System.out.print(al.get(0));
            }
            else
            {
                for(int i=0;i<al.size();i++)
                {
                    if(i<al.size()-1)
                    {
                        System.out.print(al.get(i)+",");
                    }
                    else
                    {
                        System.out.print(al.get(i));
                    }
                }
            }
        }
    }
    public static boolean isPrime(int n)
    {
        for(int i=2;i<n;i++)
        {
            if(n%i==0)
            {
                return false;
            }
        }
        return true;
    }
}
