// Find LCM and GCD of two numbers
// Input:
// The first line of input is an integer T, denoting number of test cases. The first line of each test case is two integers, N1 and N2 which are positive integers, on the same line separated by a single space respectively.
// Output:
// For each test case, there are two lines of output. First line is LCM of two given integers N1 and N2. Second line is the GCD of two given integers N1 and N2.

// Input       Output 
// 1           72 
// 24 18       6

// 3           24
// 12 24       12
// 35 50       350
// 10 15       5
//             30
//             5

import java.util.*;
public class LCM_GCD{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        while(k-->0)
        {
            int n=sc.nextInt();
            int m=sc.nextInt();
            int gcd=1;
            for(int i=1;i<=n && i<=m;i++)
            {
                if(n%i==0 && m%i==0)
                {
                    gcd=i;
                }
            }
            int lcm=(n*m)/gcd;
            System.out.println(lcm);
            System.out.println(gcd);
        }
        sc.close();
    }
}
