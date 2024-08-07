// Write a Program read a number and perform the following,

// If it is divisible by 3 and 5, Print "FooBar" 
// If it is divisible by 3, Print "Foo"
// If it is divisible by 5, Print "Bar"  and 
// If it is not divisible by 3 and 5, Print "None".
// Sample Input
// 4
// 21
// 25
// 30
// 11

// Sample Output
// Foo
// Bar
// FooBar
// None

// Input Format

// The first line of input is the integer T, denoting a number of test cases. The first line of each test case is an integer N

// Constraints

// 1<=T<=100 0<=N<=1000

// Output Format

// For each test case, there is one line of output i.e. Foo or Bar or FooBar or None.




import java.util.*;

public class FooBar{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n-->0)
        {
            int num=sc.nextInt();
            if (num % 3 == 0 && num % 5 == 0) {
                System.out.println("FooBar");
            } else if (num % 3 == 0) {
                System.out.println("Foo");
            } else if (num % 5 == 0) {
                System.out.println("Bar");
            } else {
                System.out.println("None");
            }
        }
        sc.close();
    }
}