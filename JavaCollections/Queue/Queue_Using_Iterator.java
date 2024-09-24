// Write a java program to perform the following operations.

// Create a Priority Queue pQueue of type Integer.
// Read the size of the queue from the user.
// Add the elements of the Queue
// Display the Queue pQueue
// Print the top element of the PriorityQueue pQueue
// Printing the top element and removing it from the PriorityQueue container.
// Print the Top element again.
// Display pQueue using Iterator.



// For example:

// Input	                            Result
// 5                                   [12, 18, 75, 96, 42]
// 12 18 75 96 42                      12
//                                     12
//                                     18
//                                     18 42 75 96

// 10                                  [12, 13, 19, 36, 28, 57, 27, 89, 46, 45]
// 89 57 45 12 36 19 27 46 28 13       12
//                                     12
//                                     13
//                                     13 28 19 36 45 57 27 89 46




import java .util.*;
public class Queue_Using_Iterator{
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=0;i<n;i++)
            pq.offer(sc.nextInt());
        System.out.print(pq.toString()+"\n");
        System.out.println(pq.peek());
        System.out.println(pq.peek());
        pq.poll();
        System.out.println(pq.peek());
        Iterator itr=pq.iterator();
        while(itr.hasNext())
        {
            System.out.print(itr.next()+" ");
        }
        sc.close();
    }
}
