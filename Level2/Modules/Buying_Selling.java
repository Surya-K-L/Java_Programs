// Stock Price[] is an array containing stock price of Y company for n days starting from day 1 till nth data. An investor can only buy and sell once. Write a function which will print day of buying and day of selling so that investor could have maximized his profit.


// Sample Input 1
// 4
// 250
// 320
// 190
// 300
// Sample Output 1
// Day of buying : 3
// Day of Selling : 4


import java.util.*;
public class Buying_Selling{
    public static void main(String h[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i,j;
        int a[]=new int[n+1];
        int b[]=new int[n+1];
        for(i=1;i<=n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=1;i<=n;i++)
        {
            b[i]=a[i];
        }
        Arrays.sort(b);
        int c=b[1];
        int t=c,k=0;
        int m=i;
        for(i=1;i<=n;i++)
        {
            if(t==a[i])
            {
                m=i;
            }
        }
        System.out.println("Day of buying : "+m);
        for(i=m;i<=n;i++)
        {
           if(a[m]<a[i])
           {
               m=i;
           }
        }
        System.out.println("Day of Selling : "+m);
    }
}
