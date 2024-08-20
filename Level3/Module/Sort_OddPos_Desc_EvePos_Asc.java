// Write a program to sort the elements in odd positions in descending order and elements in even position ascending order Example: Input: 1,2,3,4,5,6,7,8,9 Output: 9,2,7,4,5,6,3,8,1

// Input Format

// First line- N, number of elements Next N line- array elements

// Constraints

// 1

// Output Format

// Modified Array

// Sample Input 0

// 10
// 1 2 3 4 5 6 7 8 9 10
// Sample Output 0

// 9 2 7 4 5 6 3 8 1 10


import java.util.*;
public class Sort_OddPos_Desc_EvePos_Asc{
    public static void main(String aqrgs[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer>oddpos=new ArrayList<>();
        ArrayList<Integer>evepos=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            if(i%2==0)
            {
                evepos.add(sc.nextInt());
            }
            else
            {
                oddpos.add(sc.nextInt());
            }
        }
        Collections.sort(oddpos);
        Collections.sort(evepos);
        int evesize=evepos.size()-1;
        for(int i=0;i<n/2;i++)
        {
            System.out.print(evepos.get(evesize)+" "+oddpos.get(i)+" ");
            evesize--;
        }
        sc.close();
    }
}