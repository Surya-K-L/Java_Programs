// Write a program that given three integers A, B and K, prints the number of integers within the range [A - B] that are divisible by K.

// For example, for A = 6, B = 11 and K = 2, your function should return 3, because there are three numbers divisible by 2 within the range [6..11], namely 6, 8 and 10.

// Input Format

// The first line of input consists of a single Integer A (lower range). The second line of input consists of a single Integer B (upper range). The third line of input consists of a single Integer K.

// Constraints

// Write an efficient algorithm for the following assumptions: A and B are integers within the range [0..2,000,000,000]; K is an integer within the range [1..2,000,000,000]; A <= B.

// Output Format

// Output consists of a single integer which is the count of integers divisible by K within the range A-B.


// For example:

// Input	Result
// 5     2
// 15
// 6


import java.util.*;

public class Divisible_By_K {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt(),k=sc.nextInt(),c=0;
        for(int i=n;i<=m;i++)
        {
            if(i%k==0)
            {
                c++;
            }
        }
        System.out.print(c);
    }
}


