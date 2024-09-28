import java.util.*;
public class Maze1{
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
        if(Maze(a,0,0,sol))
        {
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<n;j++)
                {
                    System.out.print(sol[i][j]+" ");
                }
                System.out.println();
            }
        }
        else
        {
            System.out.print("No solution exists");
        }
    }
    public static boolean Maze(int arr[][],int i,int j,int sol[][])
    {
        int n=sol.length;
        if(i==n-1 && j==n-1 && arr[i][j]==0)
        {
            sol[i][j]=1;
            return true;
        }
        if(i>=0 && i<n && j>=0 && j<n && arr[i][j]==0)
        {
            sol[i][j]=1;
            if(Maze(arr,i,j+1,sol))
            {
                return true;
            }
            if(Maze(arr,i+1,j,sol))
            {
                return true;
            }
            sol[i][j]=0;
            return false;
        }
        return false;
    }
}
