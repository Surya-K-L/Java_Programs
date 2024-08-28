// You are playing the following Game with your friend:

// Initially, there is a heap of stones on the table.
// You and your friend will alternate taking turns, and you go first.
// On each turn, the person whose turn it is will remove 1 to 3 stones from the heap.
// The one who removes the last stone is the winner.
// Given n, the number of stones in the heap, return true if you can win the game assuming both you and your friend play optimally, otherwise return false


// Input: n = 4
// Output: false
// Explanation: These are the possible outcomes:
// 1. You remove 1 stone. Your friend removes 3 stones, including the last stone. Your friend wins.
// 2. You remove 2 stones. Your friend removes 2 stones, including the last stone. Your friend wins.
// 3. You remove 3 stones. Your friend removes the last stone. Your friend wins.
// In all outcomes, your friend wins.
// Hint: If there are 5 stones in the heap, could you figure out a way to remove the stones such that you will always be the winner?
// For example:

// Input	Result
// 5       true


import java.util.*;
public class Heap_Of_Stones{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.print(n%4==0?"false":"true");
        sc.close();
    }
}