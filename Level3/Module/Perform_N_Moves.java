// Given an array of size N in which initially all the elements are 0(zero).The task is to count the number of 1’s in the array after performing N moves on the array as explained:

// In each move (starting from 1 to N) the element at the position of the multiple of the move number is changed from 0 to 1 or 1 to 0.

// Move 1: Change the element t position at 1, 2, 3,…

// Move 2: Change the element t position at 2, 4, 6,…

// Move 3:Change the element t position at 3, 6, 9,…

// Count the elements whose value is 1 after performing N moves.

// Example:

// Input:N=5

// Output:2

// Explanation:

// Move 1: {1,1,1,1,1}

// Move 2: {1,0,1,0,1}

// Move 3: {1,0,0,0,1}

// Move 4: {1,0,0,1,1}

// Move 5: {1,0,0,1,0}

// Total numbers of 1’s after 5 moves=2




import java.util.*;
public class Perform_N_Moves {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int count = (int)Math.sqrt(N);
        System.out.println(count);
    }
}
