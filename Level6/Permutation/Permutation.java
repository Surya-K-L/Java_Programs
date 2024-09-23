import java.util.*;
public class Permutation{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String str="ABC";
        char arr[]=str.toCharArray();
        permute(arr,0,arr.length-1);
    }
    public static void permute(char arr[],int l,int r)
    {
        if(l==r)
        {
            System.out.println(new String(arr));
        }
        else
        {
            for(int i=l;i<=r;i++)
            {
                swap(arr,l,i);
                permute(arr,l+1,r);
                swap(arr,l,i);
            }
        }
    }
    public static void swap(char arr[],int l,int r)
    {
        char t=arr[l];
        arr[l]=arr[r];
        arr[r]=t;
    }
}
