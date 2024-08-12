// Sort the given array based on corresponding weights array in ascending order

// Given    Array = [10,20,30,40,50]
//          Weights = [5,2,1,4,3]

//   Output:
//            30, 20, 50, 40, 10

// 10 corresponds to weight 5, 20 corresponds to weight 2, ...


// For example:

// Input	              Result
// [10,20,30,40,50]     30, 20, 50, 40, 10
// [5,2,1,4,3]

// [100,200]            200, 100
// [40,30]


import java.util.*;
public class Corresponding_Weight{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        String b=sc.nextLine();
        String c=a.substring(1,a.length()-1);
        String d=b.substring(1,b.length()-1);
        String e[]=c.split(",");
        String f[]=d.split(",");
        ArrayList<Integer>al1=new ArrayList<>();
        ArrayList<Integer>al2=new ArrayList<>();
        ArrayList<Integer>al3=new ArrayList<>();
        ArrayList<Integer>al4=new ArrayList<>();
        for(int i=0;i<e.length;i++)
        {
            al1.add(Integer.parseInt(e[i]));
            al2.add(Integer.parseInt(f[i]));
            al3.add(Integer.parseInt(f[i]));
        }
        Collections.sort(al2);
        for(int i=0;i<al2.size();i++)
        {
            for(int j=0;j<al3.size();j++)
            {
                if(al2.get(i)==al3.get(j))
                {
                    al4.add(al1.get(j));
                }
            }
        }
        for(int i=0;i<al4.size();i++)
        {
            if(i<al4.size()-1)
                System.out.print(al4.get(i)+", ");
            else
                System.out.print(al4.get(i));
        }
        sc.close();
    }
}
