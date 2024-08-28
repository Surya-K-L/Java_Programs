// Ram and Krishna play a game with piles of marbles. There are an even number of piles arranged in a row, and each pile has a positive integer number of marbles piles[i].

// The objective of the game is to end with the most marbles. The total number of marbles across all the piles is odd, so there are no ties.

// Ram and Krishna take turns, with Ram starting first. Each turn, a player takes the entire pile of marbles either from the beginning or from the end of the row. This continues until there are no more piles left, at which point the person with the most marbles wins.

// Assuming Ram and Krishna play optimally, return true if Ram wins the game, or false if Krishna wins. If it is draw(both equal scores), again return false

// Example 1:

// Input: piles = [5,3,4,5]

// Output: true

// Explanation: 

// Ram starts first, and can only take the first 5 or the last 5.

// Say she takes the first 5, so that the row becomes [3, 4, 5].

// If Krishna takes 3, then the board is [4, 5], and Ram takes 5 to win with 10 points.

// If Krishna takes the last 5, then the board is [3, 4], and Ram takes 4 to win with 9 points.

// This demonstrated that taking the first 5 was a winning move for Ram, so we return true.

// Constraints:

// 2 <= piles.length <= 500

// 1 <= piles[i] <= 500

// For example:

// Input	    Result
// [5,3,4,5]   true

// [3,7,2,3]   false


import java.util.*;
public class Piles_Of_Marbles{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String a=sc.next();
        a=a.substring(1,a.length()-1);
        String b[]=a.split(",");
        int c[]=new int[b.length];
        for(int i=0;i<c.length;i++)
        {
            c[i]=Integer.parseInt(b[i]);
        }
        int z=c.length-1;
        int r=0,k=0;
        for(int i=0;i<c.length/2;i++)
        {
            int s=Math.max(c[z],c[i]);
            if(i%2==0)
            {
                r+=s;
            }
            else
            {
                k+=s;
            }
            z--;
        }
        System.out.print(r>k?"true":"false");
        sc.close();
    }
}