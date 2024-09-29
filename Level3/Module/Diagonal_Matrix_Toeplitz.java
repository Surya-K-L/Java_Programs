import java.util.*;
public class Diagonal_Matrix_Toeplitz{
    public static void main(String h[])
    {
        Scanner sc=new Scanner(System.in);
        int arr[][]={{1,2,3,4,8},
                     {5,1,2,3,4},
                     {4,5,1,2,3},
                     {7,4,5,1,2}};
        int r=4;
        int c=5;
        System.out.print(isValid(arr,r,c));
    }
    public static boolean isValid(int arr[][],int r,int c)
    {
        for(int i=0;i<r-1;i++)
        {
            for(int j=0;j<c-1;j++)
            {
                if(arr[i][j]!=arr[i+1][j+1])
                {
                    System.out.print((i+1)+" "+(j+1)+" "+arr[i+1][j+1]);
                    return false;
                }
            }
        }
        return true;
    }
}
