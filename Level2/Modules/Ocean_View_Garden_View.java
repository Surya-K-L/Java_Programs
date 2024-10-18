// There are n buildings in a line. You are given an integer array heights of size n that represents the heights of the buildings in the line.

// The ocean is to the right of the buildings. A building has an ocean view if the building can see the ocean without obstructions. Formally, a building has an ocean view if all the buildings to its right have a smaller height.

// The garden is on the left side of the building. a building has a garden view if all the buildings to the left have a smaller view.

// Return a list of indices (0-indexed) of buildings that have an ocean view, sorted in increasing order

// Return a list of indices (0-indexed) of buildings that have an garden view, sorted in increasing order.


// For example:

// Input	        Result
// [4,2,3,1]     [0,2,3]
//               [0]
  
// [4,3,2,1]     [0,1,2,3] 
//               [0]

// [1,2,3,4]     [3]
//               [0,1,2,3]



import java.util.*;
public class Ocean_View_Garden_View{
    public static void main(String agrs[])
    {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        a=a.substring(1,a.length()-1);
        String b[]=a.split(",");
        int z[]=new int[b.length];
        for(int i=0;i<z.length;i++)
        {
            z[i]=Integer.parseInt(b[i]);
        }
        int s=0;
        ArrayList<Integer>al=new ArrayList<>();
        for(int i=0;i<z.length;i++)
        {
            s=0;
            for(int j=i+1;j<z.length;j++)
            {
                if(z[i]>z[j])
                {
                    continue;
                }
                else
                {
                    s=1;
                    break;
                }
            }
            if(s==0)
            {
                al.add(i);
            }
        }
        System.out.print("[");
        for(int i=0;i<al.size();i++)
        {
            if(i<al.size()-1)
                System.out.print(al.get(i)+",");
            else
                System.out.print(al.get(i)+"]");
        }
        ArrayList<Integer>al2=new ArrayList<>();
        int p=0;
        for(int i=0;i<z.length;i++)
        {
            p=0;
            for(int j=i-1;j>=0;j--)
            {
                if(z[i]>z[j])
                {
                    continue;
                }
                else
                {
                    p=1;
                    break;
                }
            }
            if(p==0)
            {
                al2.add(i);
            }
        }
        System.out.println();
        System.out.print("[");
        for(int i=0;i<al2.size();i++)
        {
            if(i<al2.size()-1)
                System.out.print(al2.get(i)+",");
            else
                System.out.print(al2.get(i)+"]");
        }
        
    }
}
