// Tim is preparing for his MBA entrance exam,CAT.He really likes solving problems based on Number Theory.One such problem was given as follows:

// Given a number N and another number K,find the last digit of the number formed when N is raised to the power K.

// He easily solved the problem and then gave it to you as a challenge,you being a programmer,look up the challenge and decide to write a program for it.

// Input Specification:

// input1:The number N,

// input2:The number K.

// Note:The values of N and K can be very large.

// Output Specification:

// Return the last digit of the number formed when input1 is raised to the power of input2

// Example 1:

// input1:3

// input2:2

// output:8

// Explanation:

// 3 is raised to power of 2 is 8 and last digit is also 8

// Example 2:

// input1:4

// input2:2

// output:6

// Explanation:

// 4 is raised to power of 2 is 16 and last digit is 6.

// Sample Input 3 2 
// Output 8

// For example:

// Input   Result
// 3 2     8 
// 100 30  0

import java.util.*;

public class MBA_Entrance_Exam {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        if (n % 10 == 0 || m % 10 == 0) {
            System.out.print(0);
        } else {
            int t = 1;
            for (int i = 0; i < n; i++) {
                t = t * m;
            }
            System.out.print(t % 10);
        }
        sc.close();
    }
}