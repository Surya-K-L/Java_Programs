// Print the inverted triangle pattern.

// Input Format

// The first line of input is the integer T, denoting number of test cases. The first line of each test case is a number of rows N.

// Constraints

// 1<=T<=100 1<=N<=99

// Output Format

// For each test case, there is an output which generates the given pattern with the given number of rows.

// Sample Input 0

// 1
// 3
// Sample Output 0

// 6 5 4
// 3 2
// 1
// Sample Input 1

// 1
// 0
// Sample Output 1

// Invalid Input




import java.util.*;
public class NumberPattern3{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(n-->0)
        {
            int k=sc.nextInt();
            if(k<=0)
            {
                System.out.println("Invalid Input");
            }
            else
            {
                int s=(k*(k+1))/2;
                    for(int i=k;i>=0;i--)
                    {
                        for(int j=0;j<i;j++)
                        {
                            System.out.print(s+" ");
                            s--;
                        }
                        System.out.println();
                    }
            }
        }
    }
}
