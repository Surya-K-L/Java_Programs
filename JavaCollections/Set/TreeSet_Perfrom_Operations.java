// Create two TreeSet TS1 and TS2 of type Integer and perform the following operations.

// Read the size of the set and elements from the user and store it in TS1.
// Read the size of the set and elements from the user and store it in TS2.
// Display the first and last element of TS1.
// Check whether TS1 contains all of the elements in TS2. If yes, Print “TS2 is a subset of TS1”. Else “Not a subset”
// Return the greatest element in the set TS1 less than 25.
// Return the least element in the set TS1 greater than 32.
// Perform Intersection of TS1 and TS2 and display the output.

// For example:

// Input	                Result
// 6                       First Element of TS1: 1
// 1 2 3 4 5 6             Last Element of TS1: 6
// 6                       Not a subset
// 5 6 7 8 9 10            Greatest element in the set TS1 less than 25: 6
//                         Least element in the set TS1 greater than 32: null
//                         Intersection of TS1 and TS2: [5, 6]

// 7                       Last Element of TS1: 96
// 14 15 23 65 48 96 75    Not a subset
// 6                       Greatest element in the set TS1 less than 25: 23
// 20 10 35 69 84 75       Least element in the set TS1 greater than 32: 48
//                         Intersection of TS1 and TS2: [75]


import java.util.*;
public class TreeSet_Perfrom_Operations{
    public static void main(String str[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        TreeSet<Integer> TS1=new TreeSet<Integer>();
        for(int i=0;i<n;i++){
            int num=sc.nextInt();
            TS1.add(num);
            }
            int m=sc.nextInt();
        TreeSet<Integer> TS2=new TreeSet<Integer>();
        for(int i=0;i<m;i++){
            int num2=sc.nextInt();
            TS2.add(num2);
        }
        System.out.println("First Element of TS1: "+TS1.first());
        System.out.println("Last Element of TS1: "+TS1.last());
        if(TS1.containsAll(TS2)){
            System.out.println("TS2 is a subset of TS1");
        }
        else{
            System.out.println("Not a subset");
        }
        System.out.println("Greatest element in the set TS1 less than 25: "+TS1.lower(25));
        System.out.println("Least element in the set TS1 greater than 32: "+TS1.higher(32));
        TreeSet<Integer> intersection=new TreeSet<Integer>();
        intersection.addAll(TS1);
        intersection.retainAll(TS2);
        System.out.println("Intersection of TS1 and TS2: "+intersection);
        sc.close();
    }
}
