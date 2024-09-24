// Write a java program to perform the following operations.

// Create a Priority Queue PQ of type String
// Read the size of the queue from the user.
// Read the elements of the Queue
// Display the Queue PQ
// Read a string from the user and remove it from Queue and display PQ.

// For example:

// Input	                                        Result
// 6                                               Initial Queue [Alto, Brezza, Baleno, Swift, Creta, Triber]
// Swift Alto Baleno Brezza Creta Triber           After Remove [Alto, Creta, Baleno, Swift, Triber]
// Brezza



import java.util.*;
public class Queue_Perform_Op {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        PriorityQueue<String> pq = new PriorityQueue<>();
        for (int i = 0; i < n; i++)
            pq.offer(sc.next());
        System.out.print("Initial Queue " + pq.toString() + "\n");
        String s = sc.next();
        while (pq.remove(s))
            System.out.println("After Remove " + pq.toString());
        sc.close();
    }
}
