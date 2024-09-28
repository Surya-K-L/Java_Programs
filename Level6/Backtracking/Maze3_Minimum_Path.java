import java.util.*;
public class Maze3_Minimum_Path{
    public static void main(String h[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[][]=new int[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        int sol[][]=new int[n][n];
        int min=0,c=0;
        if(Maze(a,0,0,sol))
        {
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<n;j++)
                {
                    if(sol[i][j]==1)
                    {
                        c++;
                    }
                }
            }
        }
        System.out.println("Minimum Steps: "+c);
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(sol[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static boolean Maze(int a[][],int i,int j,int sol[][])
    {
        int n=sol.length;
        if(i==n-1 && j==n-1 && a[i][j]==0)
        {
            sol[i][j]=1;
            return true;
        }
        if(i>=0 && j>=0 && j<n && i<n && a[i][j]==0 && sol[i][j]!=1)
        {
            sol[i][j]=1;
            if(Maze(a,i+1,j,sol))
            {
                return true;
            }
            if(Maze(a,i,j+1,sol))
            {
                return true;
            }
            if(Maze(a,i-1,j,sol))
            {
                return true;
            }
            if(Maze(a,i,j-1,sol))
            {
                return true;
            }
            sol[i][j]=0;
            return false;
        }
        return false;
    }
}
