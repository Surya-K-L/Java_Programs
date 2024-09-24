// Write a java program to perform the following operations.

// Create a Linked List Implementation of Queue of type String named LQueue.
// Add the elements “one”, “two”, “three”, “four” into LQueue and display it.
// Remove “three” from LQueue and display it.
// Display the size of LQueue.
// Check whether Queue Contains element “two” or not.
// Check whether the queue is empty or not.
// Empty the Queue.

import java.util.*;
public class LQueue{
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        Queue<String> LQueue = new LinkedList<>();
        LQueue.add("one");
        LQueue.add("two");
        LQueue.add("three");
        LQueue.add("four");
        System.out.println(LQueue.toString());
        LQueue.remove("three");
        System.out.println(LQueue.toString()+"\nQueue Size: "+LQueue.size());
        System.out.print("Queue Contains element 'two' ? : ");
        if(LQueue.contains("two"))
            System.out.print("true");
        else
            System.out.print("false");
        System.out.print("\nQueue is Empty ? : ");
        if(LQueue.isEmpty())
            System.out.print("true");
        else
            System.out.print("false");
        LQueue.clear();
        sc.close();
    }
}
