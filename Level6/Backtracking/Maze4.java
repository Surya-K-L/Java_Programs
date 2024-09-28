import java.util.*;
public class Maze4{
    static int min=1000,f=0;
    public static void main(String h[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),s=sc.nextInt(),e=sc.nextInt();
        int a[][]=new int[n][n];
        int sol[][]=new int[n][n];
        int res[][]=new int[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                a[i][j]=sc.nextInt();
                sol[i][j]=0;
            }
        }
        Maze(s,e,a,sol,n,n,0,res);
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(res[i][j]==1)
                    min++;
            }
        }
        System.out.println("Minimum Steps: "+(min-1));
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(res[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static boolean Maze(int i,int j,int a[][],int sol[][],int m,int n,int c,int res[][])
    {
        if(((i==n-1 && j==n-1)||(i==n-1 && j==0)||(i==0 && j==0)||(i==0 && j==n-1)) && a[i][j]==0)
        {
            sol[i][j]=1;
            if(min>(c+1))
            {
                min=c+1;
                for(int x=0;x<n;x++)
                {
                    for(int y=0;y<m;y++)
                    {
                        res[x][y]=sol[x][y];
                    }
                }
            }
            return false;
        }
        if(i>=0 && j>=0 && i<n && j<n && a[i][j]==0 && sol[i][j]==0)
        {
            sol[i][j]=1;
            if(Maze(i,j+1,a,sol,n,m,c,res))
            {
                return true;
            }
            if(Maze(i+1,j,a,sol,n,m,c,res))
            {
                return true;
            }
            if(Maze(i-1,j,a,sol,n,m,c,res))
            {
                return true;
            }
            if(Maze(i,j-1,a,sol,n,m,c,res))
            {
                return true;
            }
            sol[i][j]=0;
        }
        return false;
    }
}
